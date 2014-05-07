package com.mentor.nucleus.bp.utilities;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;

import com.mentor.nucleus.bp.core.ComponentParticipant_c;
import com.mentor.nucleus.bp.core.Component_c;
import com.mentor.nucleus.bp.core.InteractionParticipant_c;
import com.mentor.nucleus.bp.core.Ooaofooa;
import com.mentor.nucleus.bp.core.Package_c;
import com.mentor.nucleus.bp.core.PackageableElement_c;
import com.mentor.nucleus.bp.core.SystemModel_c;
import com.mentor.nucleus.bp.core.common.ModelElement;
import com.mentor.nucleus.bp.core.common.NonRootModelElement;
import com.mentor.nucleus.bp.core.common.Transaction;
import com.mentor.nucleus.bp.core.common.TransactionException;
import com.mentor.nucleus.bp.core.common.TransactionManager;
import com.mentor.nucleus.bp.core.util.UIUtil;
import com.mentor.nucleus.bp.ui.canvas.Ooaofgraphics;

public class CreateClassDiagramAction implements IActionDelegate {

	private ISelection selection;

	@Override
	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			for (Iterator<?> iterator = ss.iterator(); iterator.hasNext();) {
				Object selected = iterator.next();
				if (selected instanceof Package_c) {
					Package_c pkg = (Package_c) selected;
					// first create a new package that will hold
					// the class diagram, we will do this at the
					// same level as the selected package
					// locate the parent of the package
					NonRootModelElement parent = SystemModel_c
							.getOneS_SYSOnR1401(pkg);
					if (parent == null) {
						// TODO: see if the parent is a component
						parent = Package_c
								.getOneEP_PKGOnR8000(PackageableElement_c
										.getManyPE_PEsOnR8001(pkg));
					}
					if (parent != null) {
						// TODO: note the code below does not consider anything
						// but a package as the parent
						// create the destination package in a transaction
						performActionInTransaction("Newpackage", parent,
								new Class[0], new Object[0]);
						Package_c[] currentPackages = Package_c
								.getManyEP_PKGsOnR8001(PackageableElement_c
										.getManyPE_PEsOnR8000((Package_c) parent));
						Package_c componentDiagram = currentPackages[currentPackages.length - 1];
						componentDiagram.setName(pkg.getName()
								+ "_Implementation");
						// find all of the Component participant elements
						// for each of them create a Component in
						// the new package
						ComponentParticipant_c[] cops = ComponentParticipant_c
								.getManySQ_COPsOnR930(InteractionParticipant_c
										.getManySQ_PsOnR8001(PackageableElement_c
												.getManyPE_PEsOnR8000(pkg)));
						if (cops.length == 0) {
							// warn that there are no class participants
							UIUtil.displayWarning("Could not find any class participants to create classes from.");
							return;
						}
						for (ComponentParticipant_c participant : cops) {
							// only create classes if the participant is
							// informal
							if (!participant.getIsformal()) {
								// we will create a class for each participant
								// we will let the reconciler create the
								// graphics
								// TODO: We need to add support for arrangement
								// maybe just copy the layout from the sequence
								// diagram?
								performActionInTransaction("Newcomponent",
										componentDiagram, new Class[0],
										new Object[0]);
								Component_c[] components = Component_c
										.getManyC_CsOnR8001(PackageableElement_c
												.getManyPE_PEsOnR8000(componentDiagram));
								Component_c newComponent = components[components.length - 1];
								newComponent.setName(participant.getLabel());
							}
						}
					}
				}
			}
		}
	}

	private Object performActionInTransaction(String action, Object element,
			Class<?>[] paramTypes, Object[] params) {
		Transaction transaction = null;
		try {
			transaction = TransactionManager.getSingleton().startTransaction(
					"Create element.",
					new ModelElement[] { Ooaofooa.getDefaultInstance(),
							Ooaofgraphics.getDefaultInstance() });
			Method method = element.getClass().getMethod(action, paramTypes);
			Object result = method.invoke(element, params);
			TransactionManager.getSingleton().endTransaction(transaction);
			return result;
		} catch (SecurityException e) {
			System.err.println("Unable to execute method.");
		} catch (NoSuchMethodException e) {
			System.err.println("Unable to execute method.");
		} catch (IllegalArgumentException e) {
			System.err.println("Unable to execute method.");
		} catch (IllegalAccessException e) {
			System.err.println("Unable to execute method.");
		} catch (InvocationTargetException e) {
			System.err.println("Unable to execute method.");
		} catch (TransactionException e) {
			TransactionManager.getSingleton().cancelTransaction(transaction, e);
			System.err.println("Unable to execute method.");
		}
		return null;
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// cache the selection
		this.selection = selection;
	}

}
