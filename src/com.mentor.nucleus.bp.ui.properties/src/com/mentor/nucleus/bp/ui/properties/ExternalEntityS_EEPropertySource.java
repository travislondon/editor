//======================================================================
//
// File: ExternalEntityS_EEPropertySource.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/BuildPropertySource.arc
// Version:      $Revision: 1.66 $
//
// (c) Copyright 2006-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================

package com.mentor.nucleus.bp.ui.properties;
import org.eclipse.ui.views.properties.*;

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.*;
import com.mentor.nucleus.bp.core.sorter.MetadataSortingManager;
import com.mentor.nucleus.bp.core.ui.cells.editors.*;
import com.mentor.nucleus.bp.core.util.DimensionsUtil;

public class ExternalEntityS_EEPropertySource implements IPropertySource {
	private ExternalEntity_c m_inst;
	private Bridge_c[] m_Bridge;
	private PropertyDescriptor[] m_propertyDescriptors;

	MetadataSortingManager sorter = MetadataSortingManager.createDefault();

	public ExternalEntityS_EEPropertySource(ExternalEntity_c inst) {
		m_inst = inst;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getEditableValue()
	 */
	public Object getEditableValue() {
		return this;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#isPropertySet(java.lang.Object)
	 */
	public boolean isPropertySet(Object id) {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.lang.Object)
	 */
	public void resetPropertyValue(Object id) {
		// do nothing
	}

	public String toString() {
		return m_inst.getName();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyDescriptors()
	 */
	public IPropertyDescriptor[] getPropertyDescriptors() {
		if (m_inst == null || m_inst.isOrphaned())
			return new IPropertyDescriptor[0];
		int num_children = 0;
		Bridge_c[] v_bridge = Bridge_c
				.getManyS_BRGsOnR19((ExternalEntity_c) m_inst);

		m_Bridge = v_bridge;
		num_children += m_Bridge.length;

		sorter.sort(v_bridge);
		if (m_propertyDescriptors == null
				|| 6 + num_children != m_propertyDescriptors.length) {
			m_propertyDescriptors = new PropertyDescriptor[6 + num_children];
			boolean readonly = false;

			m_propertyDescriptors[0] = new TextPropertyDescriptor("Name",
					"External Entity Name");
			m_propertyDescriptors[0]
					.setValidator(new ModelElementNameValidator(m_inst));
			m_propertyDescriptors[0]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[1] = new DescriptionPropertyDescriptor(
					"Descrip", "External Entity Description", m_inst);
			m_propertyDescriptors[1]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[2] = new TextPropertyDescriptor("Key_Lett",
					"External Entity Key Letters");
			m_propertyDescriptors[2]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[3] = new TextPropertyDescriptor(
					"Realized_Class_Path", "Realized External Entity Path");
			m_propertyDescriptors[3]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[4] = new PropertyDescriptor("Label",
					"External Entity Label");
			m_propertyDescriptors[4]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[5] = new BooleanPropertyDescriptor(
					"isRealized", "Realized External Entity", readonly);
			m_propertyDescriptors[5]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);

			int d_index = 6;
			for (int i = 0; i < m_Bridge.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"Bridge." + String.valueOf(i), "Bridge");
				m_propertyDescriptors[d_index].setCategory("Bridge");
				++d_index;
			}

		}
		return m_propertyDescriptors;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.lang.Object)
	 */
	public Object getPropertyValue(Object id) {
		if (m_inst.isOrphaned()) {
			return "";
		}
		if (id.equals("Name")) {
			return m_inst.getName();
		} else if (id.equals("Descrip")) {
			return m_inst.getDescrip().replace('\n', '/');
		} else if (id.equals("Key_Lett")) {
			return m_inst.getKey_lett();
		} else if (id.equals("Realized_Class_Path")) {
			return m_inst.getRealized_class_path();
		} else if (id.equals("Label")) {
			return m_inst.getLabel();
		} else if (id.equals("isRealized")) {
			return new Boolean(m_inst.getIsrealized());
		}
		int d_index = 6;
		for (int i = 0; i < m_Bridge.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new BridgeS_BRGPropertySource(m_Bridge[i]);
			}
			++d_index;
		}

		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	public void setPropertyValue(Object id, Object value) {
		boolean value_changed = false;
		String trans_name = "";
		Transaction tr = null;
		Ooaofooa modelRoot = (Ooaofooa) m_inst.getModelRoot();
		TransactionManager tm = TransactionManager.getSingleton();
		try {
			if (id.equals("Name")) {
				if (!value.toString().equals(m_inst.getName())) {
					trans_name = "Change in property: 'Name' of External Entity";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setName(value.toString());
				}
			} else if (id.equals("Descrip")) {
				if (!value.toString().equals(m_inst.getDescrip())) {
					trans_name = "Change in property: 'Descrip' of External Entity";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setDescrip(value.toString());
				}
			} else if (id.equals("Key_Lett")) {
				if (!value.toString().equals(m_inst.getKey_lett())) {
					trans_name = "Change in property: 'Key_Lett' of External Entity";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setKey_lett(value.toString());
				}
			} else if (id.equals("Realized_Class_Path")) {
				if (!value.toString().equals(m_inst.getRealized_class_path())) {
					trans_name = "Change in property: 'Realized_Class_Path' of External Entity";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setRealized_class_path(value.toString());
				}
			} else if (id.equals("isRealized")) {
				boolean new_val = ((Boolean) value).booleanValue();
				if (new_val != m_inst.getIsrealized()) {
					trans_name = "Change in property: 'isRealized' of External Entity"; //$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setIsrealized(new_val);
				}
			}

			// catch all exceptions and cancel the transaction
		} catch (Exception e) {
			// this can be null if there was
			// an exception starting the
			// transaction
			if (tr != null) {
				tm.cancelTransaction(tr, e);
				tr = null;
			}
			CorePlugin.logError("Transaction: " + trans_name
					+ " could not complete", e);
		}
		if (tr != null) {
			if (value_changed)
				tm.endTransaction(tr);
			else
				tm.cancelTransaction(tr);
		}
	}
}