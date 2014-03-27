package com.mentor.nucleus.bp.ui.explorer.adapters;
//======================================================================
//
// File: com/mentor/nucleus/bp/ui/explorer/adapters/InformalMessageArgumentsAdapter.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_adapters.inc
// Version:      $Revision: 1.31 $
//
// (c) Copyright 2006-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
//
// This class is responsible for decoupling the client model entity
// class MessageArgument_c from the tree viewer and the hierarchy
// it imposes.
//
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import com.mentor.nucleus.bp.core.*;

import com.mentor.nucleus.bp.ui.explorer.*;
/**
 * This file adapts the meta-model entity; 'MessageArgument_c'
 * so that it works with the Eclipse JFace user interface components.
 * <p>
 * Do not edit this class, it was created using the Mentor 
 * Graphics MC-Java code generator product.
 * </p>
 */
public class InformalMessageArgumentsAdapter implements ITreeContentProvider {
	static InformalMessageArgumentsAdapter informalmessageargumentsadapter = null;
	/**
	 * Returns the adapters singleton instance. If this
	 * is the first time, the instance is created.
	 */
	public static InformalMessageArgumentsAdapter getInstance() {
		if (informalmessageargumentsadapter == null) {
			informalmessageargumentsadapter = new InformalMessageArgumentsAdapter();
		}
		return informalmessageargumentsadapter;
	}
	/**
	 * @see IContentProvider#inputChanged(Viewer, Object, Object)
	 * Called when the tree's input has been changed
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// Nothing to do
	}
	/**
	 * @see IContentProvider#dispose()
	 * Called when this viewer is no longer needed
	 */
	public void dispose() {
		// Nothing to dispose
	}
	/**
	 * @see ITreeContentProvider#getParent(Object)
	 * Returns the parent of this node
	 */
	public Object getParent(Object arg) {
		SynchronousMessage_c result59 = SynchronousMessage_c
				.getOneMSG_SMOnR1020(InformalSynchronousMessage_c.getOneMSG_ISMOnR1020(SynchronousMessage_c
						.getOneMSG_SMOnR1018(Message_c
								.getOneMSG_MOnR1000((MessageArgument_c) arg))));
		if (result59 != null) {
			return result59;
		}
		AsynchronousMessage_c result60 = AsynchronousMessage_c
				.getOneMSG_AMOnR1019(InformalAsynchronousMessage_c.getOneMSG_IAMOnR1019(AsynchronousMessage_c
						.getOneMSG_AMOnR1018(Message_c
								.getOneMSG_MOnR1000((MessageArgument_c) arg))));
		if (result60 != null) {
			return result60;
		}
		ReturnMessage_c result61 = ReturnMessage_c.getOneMSG_ROnR1018(Message_c
				.getOneMSG_MOnR1000((MessageArgument_c) arg));
		if (result61 != null) {
			return result61;
		}
		return null;
	}
	/**
	 * @see IStructuredContentProvider#getElements(Object)
	 * Returns the elements below this node
	 */
	public Object[] getElements(Object arg) {
		return getChildren(arg);
	}

	/**
	 * @see ITreeContentProvider#getChildren(Object)
	 * Returns the children of this node
	 */
	public Object[] getChildren(Object arg) {
		int resultSize = 0;

		Object[] result = new Object[resultSize];
		return result;
	}
	/**
	 * @see ITreeContentProvider#hasChildren(Object)
	 * Returns true if this node has any children
	 */
	public boolean hasChildren(Object arg) {
		return false;
	}
}