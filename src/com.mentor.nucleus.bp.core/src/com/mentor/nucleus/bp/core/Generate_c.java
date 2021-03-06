package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.Generate_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

// No special imports
import java.util.*;
import java.lang.reflect.*;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import com.mentor.nucleus.bp.core.util.PersistenceUtil;
import org.eclipse.core.runtime.NullProgressMonitor;
import com.mentor.nucleus.bp.core.ui.marker.UmlProblem;
import com.mentor.nucleus.bp.core.common.*;
abstract class EV_GENERATE extends genericEvent_c {
	public abstract int getEvtcode();
}

public class Generate_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public Generate_c(ModelRoot modelRoot, java.util.UUID p_m_statement_id,
			java.util.UUID p_m_var_id) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_statement_id = IdAssigner.preprocessUUID(p_m_statement_id);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_var_id = IdAssigner.preprocessUUID(p_m_var_id);

		Object[] key = {m_statement_id};
		addInstanceToMap(key);
	}
	static public Generate_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_statement_id, java.util.UUID p_m_var_id,
			String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot.getInstanceList(Generate_c.class);
		Generate_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_statement_id};
			new_inst = (Generate_c) instances.get(key);
		}
		String contentPath = PersistenceUtil.resolveRelativePath(p_localPath,
				new Path(p_contentPath));
		if (modelRoot.isNewCompareRoot()) {
			// for comparisons we do not want to change
			// the content path
			contentPath = p_contentPath;
		}
		if (new_inst != null && !modelRoot.isCompareRoot()) {
			PersistableModelComponent pmc = new_inst.getPersistableComponent();
			if (pmc == null) {
				// dangling reference, redo this instance
				new_inst.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_statement_id = IdAssigner
						.preprocessUUID(p_m_statement_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_var_id = IdAssigner.preprocessUUID(p_m_var_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new Generate_c(modelRoot, p_m_statement_id, p_m_var_id);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public Generate_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_statement_id, java.util.UUID p_m_var_id) {
		InstanceList instances = modelRoot.getInstanceList(Generate_c.class);
		Generate_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_statement_id};
			source = (Generate_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_statement_id = IdAssigner
						.preprocessUUID(p_m_statement_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_var_id = IdAssigner.preprocessUUID(p_m_var_id);

				return source;
			}
		}
		// there is no instance matching the id
		Generate_c new_inst = new Generate_c(modelRoot, p_m_statement_id,
				p_m_var_id);
		return new_inst;
	}
	public Generate_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_statement_id = IdAssigner.NULL_UUID;
		m_var_id = IdAssigner.NULL_UUID;
		Object[] key = {m_statement_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_statement_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_statement_id != p_newKey) {

			m_statement_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof Generate_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof Generate_c)) {
			return false;
		}

		Generate_c me = (Generate_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getStatement_id()) || IdAssigner.NULL_UUID
				.equals(((Generate_c) elem).getStatement_id())) && this != elem) {
			return false;
		}
		if (!getStatement_id().equals(((Generate_c) elem).getStatement_id()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof Generate_c)) {
			return false;
		}

		Generate_c me = (Generate_c) elem;
		if (!getStatement_idCachedValue().equals(
				((Generate_c) elem).getStatement_idCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_statement_id;
	private java.util.UUID m_var_id;

	// declare association references from this class

	// referring navigation

	GenerateSmEventStatement_c IsSupertypeGenerateSmEventStatement;
	public void relateAcrossR705To(GenerateSmEventStatement_c target) {
		relateAcrossR705To(target, true);
	}
	public void relateAcrossR705To(GenerateSmEventStatement_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSupertypeGenerateSmEventStatement)
			return; // already related

		if (IsSupertypeGenerateSmEventStatement != target) {

			Object oldKey = getInstanceKey();

			if (IsSupertypeGenerateSmEventStatement != null) {

				IsSupertypeGenerateSmEventStatement
						.clearBackPointerR705To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"Generate_c.relateAcrossR705To(GenerateSmEventStatement_c target)",
									"Relate performed across R705 from Generate to Generate SM Event Statement without unrelate of prior instance.");
				}
			}

			IsSupertypeGenerateSmEventStatement = target;
			if (IdAssigner.NULL_UUID.equals(target.getStatement_id())) {
				// do not update cached value
			} else {
				// update cached value
				m_statement_id = target.getStatement_idCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR705To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR705From(GenerateSmEventStatement_c target) {
		unrelateAcrossR705From(target, true);
	}
	public void unrelateAcrossR705From(GenerateSmEventStatement_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSupertypeGenerateSmEventStatement == null)
			return; // already unrelated

		if (target != IsSupertypeGenerateSmEventStatement) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R705",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR705To(this);
		}

		if (IsSupertypeGenerateSmEventStatement != null) {

			m_statement_id = IsSupertypeGenerateSmEventStatement
					.getStatement_id();
			if (IdAssigner.NULL_UUID.equals(m_statement_id)) {
				m_statement_id = IsSupertypeGenerateSmEventStatement
						.getStatement_idCachedValue();
			}
			IsSupertypeGenerateSmEventStatement = null;
			target.removeRef();
		}
	}

	public static Generate_c getOneE_GENOnR705(
			GenerateSmEventStatement_c[] targets) {
		return getOneE_GENOnR705(targets, null);
	}

	public static Generate_c getOneE_GENOnR705(
			GenerateSmEventStatement_c[] targets, ClassQueryInterface_c test) {
		Generate_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneE_GENOnR705(targets[i], test);
			}
		}

		return ret_val;
	}

	public static Generate_c getOneE_GENOnR705(GenerateSmEventStatement_c target) {
		return getOneE_GENOnR705(target, null);
	}

	public static Generate_c getOneE_GENOnR705(
			GenerateSmEventStatement_c target, boolean loadComponent) {
		return getOneE_GENOnR705(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static Generate_c getOneE_GENOnR705(
			GenerateSmEventStatement_c target, ClassQueryInterface_c test) {
		if (target != null) {
			return getOneE_GENOnR705(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static Generate_c getOneE_GENOnR705(ModelRoot modelRoot,
			GenerateSmEventStatement_c target, ClassQueryInterface_c test) {
		return getOneE_GENOnR705(modelRoot, target, test, true);
	}

	public static Generate_c getOneE_GENOnR705(ModelRoot modelRoot,
			GenerateSmEventStatement_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		return find_getOneE_GENOnR705(modelRoot, target, test);
	}
	private static Generate_c find_getOneE_GENOnR705(ModelRoot modelRoot,
			GenerateSmEventStatement_c target, ClassQueryInterface_c test) {
		if (target != null) {
			Generate_c source = (Generate_c) target.backPointer_IsSubtypeGenerateIsSubtype_R705;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static Generate_c[] getManyE_GENsOnR705(
			GenerateSmEventStatement_c[] targets) {
		return getManyE_GENsOnR705(targets, null);
	}
	public static Generate_c[] getManyE_GENsOnR705(
			GenerateSmEventStatement_c[] targets, boolean loadComponent) {
		return getManyE_GENsOnR705(targets, null, loadComponent);
	}
	public static Generate_c[] getManyE_GENsOnR705(
			GenerateSmEventStatement_c[] targets, ClassQueryInterface_c test) {
		return getManyE_GENsOnR705(targets, test, true);
	}

	public static Generate_c[] getManyE_GENsOnR705(
			GenerateSmEventStatement_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new Generate_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot.getInstanceList(Generate_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			Generate_c source = (Generate_c) targets[i].backPointer_IsSubtypeGenerateIsSubtype_R705;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			Generate_c[] ret_set = new Generate_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new Generate_c[0];
		}
	}

	public static Generate_c[] getManyE_GENsOnR705(
			GenerateSmEventStatement_c target) {
		if (target != null) {
			GenerateSmEventStatement_c[] targetArray = new GenerateSmEventStatement_c[1];
			targetArray[0] = target;
			return getManyE_GENsOnR705(targetArray);
		} else {
			Generate_c[] result = new Generate_c[0];
			return result;
		}
	}

	public static Generate_c[] getManyE_GENsOnR705(
			GenerateSmEventStatement_c target, boolean loadComponent) {
		if (target != null) {
			GenerateSmEventStatement_c[] targetArray = new GenerateSmEventStatement_c[1];
			targetArray[0] = target;
			return getManyE_GENsOnR705(targetArray, loadComponent);
		} else {
			Generate_c[] result = new Generate_c[0];
			return result;
		}
	}

	// referring navigation

	Variable_c HasRecipientVariable;
	public void relateAcrossR712To(Variable_c target) {
		relateAcrossR712To(target, true);
	}
	public void relateAcrossR712To(Variable_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == HasRecipientVariable)
			return; // already related

		if (HasRecipientVariable != target) {

			Object oldKey = getInstanceKey();

			if (HasRecipientVariable != null) {

				HasRecipientVariable.clearBackPointerR712To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"Generate_c.relateAcrossR712To(Variable_c target)",
									"Relate performed across R712 from Generate to Variable without unrelate of prior instance.");
				}
			}

			HasRecipientVariable = target;
			m_var_id = target.getVar_id();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR712To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR712From(Variable_c target) {
		unrelateAcrossR712From(target, true);
	}
	public void unrelateAcrossR712From(Variable_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (HasRecipientVariable == null)
			return; // already unrelated

		if (target != HasRecipientVariable) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R712",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR712To(this);
		}

		if (HasRecipientVariable != null) {

			m_var_id = HasRecipientVariable.getVar_id();
			HasRecipientVariable = null;
			target.removeRef();
		}
	}

	public static Generate_c getOneE_GENOnR712(Variable_c[] targets) {
		return getOneE_GENOnR712(targets, null);
	}

	public static Generate_c getOneE_GENOnR712(Variable_c[] targets,
			ClassQueryInterface_c test) {
		Generate_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneE_GENOnR712(targets[i], test);
			}
		}

		return ret_val;
	}

	public static Generate_c getOneE_GENOnR712(Variable_c target) {
		return getOneE_GENOnR712(target, null);
	}

	public static Generate_c getOneE_GENOnR712(Variable_c target,
			boolean loadComponent) {
		return getOneE_GENOnR712(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static Generate_c getOneE_GENOnR712(Variable_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneE_GENOnR712(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static Generate_c getOneE_GENOnR712(ModelRoot modelRoot,
			Variable_c target, ClassQueryInterface_c test) {
		return getOneE_GENOnR712(modelRoot, target, test, true);
	}

	public static Generate_c getOneE_GENOnR712(ModelRoot modelRoot,
			Variable_c target, ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneE_GENOnR712(modelRoot, target, test);
	}
	private static Generate_c find_getOneE_GENOnR712(ModelRoot modelRoot,
			Variable_c target, ClassQueryInterface_c test) {
		if (target != null) {
			synchronized (target.backPointer_Generate_R712) {
				for (int i = 0; i < target.backPointer_Generate_R712.size(); ++i) {
					Generate_c source = (Generate_c) target.backPointer_Generate_R712
							.get(i);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						return source;
					}
				}
			}
		}
		// not found
		return null;
	}

	public static Generate_c[] getManyE_GENsOnR712(Variable_c[] targets) {
		return getManyE_GENsOnR712(targets, null);
	}
	public static Generate_c[] getManyE_GENsOnR712(Variable_c[] targets,
			boolean loadComponent) {
		return getManyE_GENsOnR712(targets, null, loadComponent);
	}
	public static Generate_c[] getManyE_GENsOnR712(Variable_c[] targets,
			ClassQueryInterface_c test) {
		return getManyE_GENsOnR712(targets, test, true);
	}

	public static Generate_c[] getManyE_GENsOnR712(Variable_c[] targets,
			ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new Generate_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot.getInstanceList(Generate_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			synchronized (targets[i].backPointer_Generate_R712) {
				for (int j = 0; j < targets[i].backPointer_Generate_R712.size(); ++j) {
					Generate_c source = (Generate_c) targets[i].backPointer_Generate_R712
							.get(j);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						matches.add(source);
					}
				}
			}
		}
		if (matches.size() > 0) {
			Generate_c[] ret_set = new Generate_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new Generate_c[0];
		}
	}

	public static Generate_c[] getManyE_GENsOnR712(Variable_c target) {
		return getManyE_GENsOnR712(target, null);
	}

	public static Generate_c[] getManyE_GENsOnR712(Variable_c target,
			boolean loadComponent) {
		return getManyE_GENsOnR712(target, null, loadComponent);
	}

	public static Generate_c[] getManyE_GENsOnR712(Variable_c target,
			ClassQueryInterface_c test) {
		return getManyE_GENsOnR712(target, test, true);
	}

	public static Generate_c[] getManyE_GENsOnR712(Variable_c target,
			ClassQueryInterface_c test, boolean loadComponent) {
		if (target == null)
			return new Generate_c[0];

		ModelRoot modelRoot = target.getModelRoot();
		Vector matches = new Vector();
		synchronized (target.backPointer_Generate_R712) {
			for (int i = 0; i < target.backPointer_Generate_R712.size(); ++i) {
				Generate_c source = (Generate_c) target.backPointer_Generate_R712
						.get(i);
				if (source != null && (test == null || test.evaluate(source))) {

					matches.add(source);
				}
			}
		}

		if (matches.size() > 0) {
			Generate_c[] ret_set = new Generate_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new Generate_c[0];
		}
	}

	public void batchRelate(ModelRoot modelRoot, boolean notifyChanges,
			boolean searchAllRoots) {
		batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
	}

	public void batchRelate(ModelRoot modelRoot, boolean relateProxies,
			boolean notifyChanges, boolean searchAllRoots) {
		InstanceList instances = null;
		ModelRoot baseRoot = modelRoot;

		// R705
		GenerateSmEventStatement_c relInst54535 = (GenerateSmEventStatement_c) baseRoot
				.getInstanceList(GenerateSmEventStatement_c.class).get(
						new Object[]{m_statement_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst54535 == null) {
			relInst54535 = (GenerateSmEventStatement_c) Ooaofooa
					.getDefaultInstance()
					.getInstanceList(GenerateSmEventStatement_c.class)
					.get(new Object[]{m_statement_id});
		}
		if (relInst54535 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst54535 = (GenerateSmEventStatement_c) roots[i]
						.getInstanceList(GenerateSmEventStatement_c.class).get(
								new Object[]{m_statement_id});
				if (relInst54535 != null)
					break;
			}
		}
		//synchronized
		if (relInst54535 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst54535) && !isProxy())) {
				relInst54535.relateAcrossR705To(this, notifyChanges);
			}
		}

		if (HasRecipientVariable == null) {
			// R712
			Variable_c relInst54536 = (Variable_c) baseRoot.getInstanceList(
					Variable_c.class).get(new Object[]{m_var_id});
			// if there was no local element, check for any global elements
			// failing that proceed to check other model roots
			if (relInst54536 == null) {
				relInst54536 = (Variable_c) Ooaofooa.getDefaultInstance()
						.getInstanceList(Variable_c.class)
						.get(new Object[]{m_var_id});
			}
			if (relInst54536 == null && searchAllRoots
					&& !baseRoot.isCompareRoot()) {
				Ooaofooa[] roots = Ooaofooa.getInstances();
				for (int i = 0; i < roots.length; i++) {
					if (roots[i].isCompareRoot()) {
						// never use elements from any compare root
						continue;
					}
					relInst54536 = (Variable_c) roots[i].getInstanceList(
							Variable_c.class).get(new Object[]{m_var_id});
					if (relInst54536 != null)
						break;
				}
			}
			//synchronized
			if (relInst54536 != null) {
				if (relateProxies || !isProxy()
						|| (inSameComponent(this, relInst54536) && !isProxy())) {
					relInst54536.relateAcrossR712To(this, notifyChanges);
				}
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R705
		// E_GSME
		inst = IsSupertypeGenerateSmEventStatement;
		unrelateAcrossR705From(IsSupertypeGenerateSmEventStatement,
				notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
		// R712
		// V_VAR
		inst = HasRecipientVariable;
		unrelateAcrossR712From(HasRecipientVariable, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
	}
	public static void batchRelateAll(ModelRoot modelRoot,
			boolean notifyChanges, boolean searchAllRoots) {
		batchRelateAll(modelRoot, notifyChanges, searchAllRoots, false);
	}
	public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots, boolean relateProxies)
  {
	InstanceList instances = modelRoot.getInstanceList(Generate_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final Generate_c inst = (Generate_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot.getInstanceList(Generate_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static Generate_c GenerateInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		Generate_c result = findGenerateInstance(modelRoot, test, loadComponent);
		return result;
	}
	private static Generate_c findGenerateInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		InstanceList instances = modelRoot.getInstanceList(Generate_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				Generate_c x = (Generate_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					return x;
				}
			}
		}
		return null;
	}
	public static Generate_c GenerateInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test) {
		return GenerateInstance(modelRoot, test, true);
	}

	public static Generate_c GenerateInstance(ModelRoot modelRoot) {
		return GenerateInstance(modelRoot, null, true);
	}

	public static Generate_c[] GenerateInstances(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		InstanceList instances = modelRoot.getInstanceList(Generate_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				Generate_c x = (Generate_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					matches.add(x);
				}
			}
			if (matches.size() > 0) {
				Generate_c[] ret_set = new Generate_c[matches.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new Generate_c[0];
			}
		}
	}
	public static Generate_c[] GenerateInstances(ModelRoot modelRoot,
			ClassQueryInterface_c test) {
		return GenerateInstances(modelRoot, test, true);
	}
	public static Generate_c[] GenerateInstances(ModelRoot modelRoot) {
		return GenerateInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Generate.dispose call: ";
		GenerateSmEventStatement_c testR705Inst2 = GenerateSmEventStatement_c
				.getOneE_GSMEOnR705(this, false);

		if (testR705Inst2 != null) {
			delete_error = true;
			errorMsg = errorMsg + "705 ";
		}
		Variable_c testR712Inst = Variable_c.getOneV_VAROnR712(this, false);

		if (testR712Inst != null) {
			delete_error = true;
			errorMsg = errorMsg + "712 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE, "Generate", errorMsg);
			} else {
				Exception e = new Exception();
				e.fillInStackTrace();
				CorePlugin.logError(errorMsg, e);
			}
		}
		return result;
	}

	// end declare instance pool

	// declare attribute accessors
	public boolean isUUID(String attributeName) {
		if (attributeName.equals("statement_id")) {
			return true;
		}
		if (attributeName.equals("var_id")) {
			return true;
		}
		return false;
	}
	// declare attribute accessors
	public long getStatement_idLongBased() {
		if (IsSupertypeGenerateSmEventStatement != null) {
			return IsSupertypeGenerateSmEventStatement
					.getStatement_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getStatement_id() {
		if (IsSupertypeGenerateSmEventStatement != null) {
			return IsSupertypeGenerateSmEventStatement.getStatement_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public boolean hasSuperType() {
		return (IsSupertypeGenerateSmEventStatement != null);

	}

	public java.util.UUID getStatement_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_statement_id))
			return m_statement_id;
		else
			return getStatement_id();
	}

	public void setStatement_id(java.util.UUID newValue) {
		m_statement_id = IdAssigner.preprocessUUID(newValue);
	}
	public long getVar_idLongBased() {
		if (HasRecipientVariable != null) {
			return HasRecipientVariable.getVar_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getVar_id() {
		if (HasRecipientVariable != null) {
			return HasRecipientVariable.getVar_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getVar_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_var_id))
			return m_var_id;
		else
			return getVar_id();
	}

	public void setVar_id(java.util.UUID newValue) {
		m_var_id = IdAssigner.preprocessUUID(newValue);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log.println(ILogger.OPERATION, "Generate", //$NON-NLS-1$
				" Operation entered: Generate::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		Generate_c[] objs = Generate_c
				.GenerateInstances(modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log.println(ILogger.OPERATION, "Generate", //$NON-NLS-1$
				" Operation entered: Generate::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class Generate_c_test54538_c implements ClassQueryInterface_c {
			Generate_c_test54538_c(java.util.UUID p54539) {
				m_p54539 = p54539;
			}
			private java.util.UUID m_p54539;
			public boolean evaluate(Object candidate) {
				Generate_c selected = (Generate_c) candidate;
				boolean retval = false;
				retval = (selected.getStatement_id().equals(m_p54539));
				return retval;
			}
		}

		Generate_c[] objs54537 = Generate_c.GenerateInstances(modelRoot,
				new Generate_c_test54538_c(getStatement_id()));

		if (((objs54537.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Generate", //$NON-NLS-1$
								"Consistency: Object: Generate: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs54537.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin.logError(
						"Consistency: Object: Generate: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
								+ "Actual Value: " //$NON-NLS-1$
								+ Integer.toString(objs54537.length), e);
			}
			retval = false;

		}

		if (((objs54537.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Generate", //$NON-NLS-1$
								"Consistency: Object: Generate: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs54537.length)
										+ " Statement_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Generate: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs54537.length)
										+ " Statement_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Generate is a subtype in association: rel.Numb = 705
		// The supertype class is: Generate SM Event Statement
		class GenerateSmEventStatement_c_test54543_c
				implements
					ClassQueryInterface_c {
			GenerateSmEventStatement_c_test54543_c(java.util.UUID p54544) {
				m_p54544 = p54544;
			}
			private java.util.UUID m_p54544;
			public boolean evaluate(Object candidate) {
				GenerateSmEventStatement_c selected = (GenerateSmEventStatement_c) candidate;
				boolean retval = false;
				retval = (selected.getStatement_id().equals(m_p54544));
				return retval;
			}
		}

		GenerateSmEventStatement_c[] objs54542 = GenerateSmEventStatement_c
				.GenerateSmEventStatementInstances(modelRoot,
						new GenerateSmEventStatement_c_test54543_c(
								getStatement_id()));

		if (((objs54542.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Generate", //$NON-NLS-1$
								"Consistency: Object: Generate: Association: 705: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs54542.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Generate: Association: 705: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs54542.length), e);
			}
			retval = false;

		}

		// Generate is a referring class in association: rel.Numb = 712
		// The participating class is: Variable
		class Variable_c_test54546_c implements ClassQueryInterface_c {
			Variable_c_test54546_c(java.util.UUID p54547) {
				m_p54547 = p54547;
			}
			private java.util.UUID m_p54547;
			public boolean evaluate(Object candidate) {
				Variable_c selected = (Variable_c) candidate;
				boolean retval = false;
				retval = (selected.getVar_id().equals(m_p54547));
				return retval;
			}
		}

		Variable_c[] objs54545 = Variable_c.VariableInstances(modelRoot,
				new Variable_c_test54546_c(getVar_id()));

		// The participant is unconditional
		// The multiplicity of the participant is one
		if (((objs54545.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Generate", //$NON-NLS-1$
								"Consistency: Object: Generate: Association: 712: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs54545.length)
										+ " Var_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Generate: Association: 712: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs54545.length)
										+ " Var_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		return retval;
	}

	// declare transform functions
	public void Dispose() {
		Ooaofooa.log.println(ILogger.OPERATION, "Generate",
				" Operation entered: Generate::Dispose");
		final ModelRoot modelRoot = getModelRoot();
		Variable_c v_var = Variable_c.getOneV_VAROnR712(this);

		if ((!(v_var == null))) {

			this.unrelateAcrossR712From(v_var);

		}

		delete();

	} // End dispose
	public void Execute(final java.util.UUID p_Stack_frame_id) {
		Ooaofooa.log.println(ILogger.OPERATION, "Generate",
				" Operation entered: Generate::Execute");
		final ModelRoot modelRoot = getModelRoot();

	} // End execute

	// end transform functions

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Generate
