package com.mentor.nucleus.bp.core.inspector;
//======================================================================
//
// File: com/mentor/nucleus/bp/core/inspector/DataTypePackageInspector.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_object_inspector.inc
// Version:      $Revision: 1.23 $
//
// (c) Copyright 2004-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
//
// This class is responsible for decoupling the client model entity
// class DataTypePackage_c from the traversal mechanisms that it provides to
// model diff.
//
import com.mentor.nucleus.bp.core.*;

import org.eclipse.swt.graphics.Image;

import com.mentor.nucleus.bp.core.sorter.MetadataSortingManager;
import java.util.*;

/**
 * This file adapts the meta-model entity; 'DataTypePackage_c' to provide 
 * support of traversing to its children and parents.
 * <p>
 * Do not edit this class, it was created using the Mentor Graphics
 * MC-Java code generator product.
 * </p>
 */
public class DataTypePackageInspector extends BaseModelClassInspector {

  private String parentAssoc;
  
  public DataTypePackageInspector(MetadataSortingManager sortingManager){
    super(sortingManager);
  }

  /**
   * @see IModelClassInspector#getParent(Object)
   * Returns the parent(s) of this node
   */
  public Object getParent(Object arg) {
    SystemModel_c result1 = SystemModel_c.getOneS_SYSOnR4400(SystemDatatypePackage_c.getOneSLD_SDPOnR4400((DataTypePackage_c)arg));
     if (result1 != null) {
        return result1;
    }               
    Domain_c result2 = Domain_c.getOneS_DOMOnR40((DataTypePackage_c)arg);
     if (result2 != null) {
        return result2;
    }               
    DataTypePackage_c result3 = DataTypePackage_c.getOneS_DPKOnR37(DataTypePackageInPackage_c.getOneS_DPIPOnR38((DataTypePackage_c)arg));
     if (result3 != null) {
        return result3;
    }               
    Package_c result4 = Package_c.getOneEP_PKGOnR1400(SpecificationPackage_c.getOneEP_SPKGOnR1402((DataTypePackage_c)arg));
     if (result4 != null) {
        return result4;
    }               
        return null;    //No parent found           
  }
  	  
  /**
   * @see IModelClassInspector#getChildRelations(Object)
   * Returns the children of this node
   */
  public ObjectElement[] getChildRelations(Object arg) {
    int resultSize = 0;
    DataTypePackage_c [] v_datatypepackage = 
DataTypePackage_c.getManyS_DPKsOnR38(
DataTypePackageInPackage_c.getManyS_DPIPsOnR37(
(DataTypePackage_c)arg)
)
;



    sort(v_datatypepackage);
    CoreDataType_c [] v_coredatatype = 
CoreDataType_c.getManyS_CDTsOnR17(
DataType_c.getManyS_DTsOnR39(
DataTypeInPackage_c.getManyS_DIPsOnR39(
(DataTypePackage_c)arg)
)
)
;



    sort(v_coredatatype);
    UserDataType_c [] v_userdefineddatatype = 
UserDataType_c.getManyS_UDTsOnR17(
DataType_c.getManyS_DTsOnR39(
DataTypeInPackage_c.getManyS_DIPsOnR39(
(DataTypePackage_c)arg)
)
)
;



    sort(v_userdefineddatatype);
    EnumerationDataType_c [] v_enumeration = 
EnumerationDataType_c.getManyS_EDTsOnR17(
DataType_c.getManyS_DTsOnR39(
DataTypeInPackage_c.getManyS_DIPsOnR39(
(DataTypePackage_c)arg)
)
)
;



    sort(v_enumeration);
    StructuredDataType_c [] v_structureddatatype = 
StructuredDataType_c.getManyS_SDTsOnR17(
DataType_c.getManyS_DTsOnR39(
DataTypeInPackage_c.getManyS_DIPsOnR39(
(DataTypePackage_c)arg)
)
)
;



    sort(v_structureddatatype);
    ConstantSpecification_c [] v_constantspecification = 
ConstantSpecification_c.getManyCNST_CSPsOnR1506(
ConstantInPackage_c.getManyCNST_CIPsOnR1506(
(DataTypePackage_c)arg)
)
;



    sort(v_constantspecification);
    List<ObjectElement> result = new ArrayList<ObjectElement> ();
    for (int i = 0 ; i < v_datatypepackage.length ; i++) {   
        result.add(new ObjectElement("v_datatypepackage", ObjectElement.RELATION_ROLE_ELEMENT, v_datatypepackage[i], arg, false));
    }
    for (int i = 0 ; i < v_coredatatype.length ; i++) {   
        result.add(new ObjectElement("v_coredatatype", ObjectElement.RELATION_ROLE_ELEMENT, v_coredatatype[i], arg, false));
    }
    for (int i = 0 ; i < v_userdefineddatatype.length ; i++) {   
        result.add(new ObjectElement("v_userdefineddatatype", ObjectElement.RELATION_ROLE_ELEMENT, v_userdefineddatatype[i], arg, false));
    }
    for (int i = 0 ; i < v_enumeration.length ; i++) {   
        result.add(new ObjectElement("v_enumeration", ObjectElement.RELATION_ROLE_ELEMENT, v_enumeration[i], arg, false));
    }
    for (int i = 0 ; i < v_structureddatatype.length ; i++) {   
        result.add(new ObjectElement("v_structureddatatype", ObjectElement.RELATION_ROLE_ELEMENT, v_structureddatatype[i], arg, false));
    }
    for (int i = 0 ; i < v_constantspecification.length ; i++) {   
        result.add(new ObjectElement("v_constantspecification", ObjectElement.RELATION_ROLE_ELEMENT, v_constantspecification[i], arg, false));
    }
    return result.toArray(new ObjectElement[result.size()]);
  }
  /**
   * @see IModelClassInspector#hasChildren(Object)
   * Returns true if this node has any children
   */
  public boolean hasChildRelations(Object arg) {
    DataTypePackage_c [] v_datatypepackage = 
DataTypePackage_c.getManyS_DPKsOnR38(
DataTypePackageInPackage_c.getManyS_DPIPsOnR37(
(DataTypePackage_c)arg)
)
;



    if (v_datatypepackage.length > 0) return true;
    CoreDataType_c [] v_coredatatype = 
CoreDataType_c.getManyS_CDTsOnR17(
DataType_c.getManyS_DTsOnR39(
DataTypeInPackage_c.getManyS_DIPsOnR39(
(DataTypePackage_c)arg)
)
)
;



    if (v_coredatatype.length > 0) return true;
    UserDataType_c [] v_userdefineddatatype = 
UserDataType_c.getManyS_UDTsOnR17(
DataType_c.getManyS_DTsOnR39(
DataTypeInPackage_c.getManyS_DIPsOnR39(
(DataTypePackage_c)arg)
)
)
;



    if (v_userdefineddatatype.length > 0) return true;
    EnumerationDataType_c [] v_enumeration = 
EnumerationDataType_c.getManyS_EDTsOnR17(
DataType_c.getManyS_DTsOnR39(
DataTypeInPackage_c.getManyS_DIPsOnR39(
(DataTypePackage_c)arg)
)
)
;



    if (v_enumeration.length > 0) return true;
    StructuredDataType_c [] v_structureddatatype = 
StructuredDataType_c.getManyS_SDTsOnR17(
DataType_c.getManyS_DTsOnR39(
DataTypeInPackage_c.getManyS_DIPsOnR39(
(DataTypePackage_c)arg)
)
)
;



    if (v_structureddatatype.length > 0) return true;
    ConstantSpecification_c [] v_constantspecification = 
ConstantSpecification_c.getManyCNST_CSPsOnR1506(
ConstantInPackage_c.getManyCNST_CIPsOnR1506(
(DataTypePackage_c)arg)
)
;



    if (v_constantspecification.length > 0) return true;
    return false;
  }
  
  public Object[] getReferentialDetails(Class<?> referentialClass, Object arg) {
  	Object[] details = new Object[4];
	return details;
  }
  
  /**
  * @seee IModelClassInspector#getReferentials(Object)
  * Returns the an array of Role Objects specifying the referenctial attibutes of
  * this model element
  * Role Name: <T_TPS.NameOnly>
  * Role Value: <Chain_result>
  * Role Type: "Referential"
  */
  public ObjectElement[] getReferentials(Object arg) {
     List<ObjectElement> referentials = new ArrayList<ObjectElement>();
    return referentials.toArray(new ObjectElement [referentials.size()]);        
  }

  /**
  * @seee IModelClassInspector#getAttributes(Object)
  * Returns the an array of Role objects that give the attibutes of the model 
  * element it self e.g.
  * Role Name: "Name"
  * Role Value: metaModelElement.getName()
  * Role Type: "Primitive"
  */
  public ObjectElement[] getAttributes(Object arg) {
    ObjectElement attrSet[] = new ObjectElement[4];
      attrSet[0] = new ObjectElement("Name", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getName"), arg, "getName", true);
    ObjectElement compAttrSet[] = new ObjectElement[1];    
    for (int i = 0; i < 1 ; i++) {
        compAttrSet[i] = attrSet[i];
    }
    return compAttrSet;
  }

    /**
     * Return configured image if none exists for the element type
     */
    public Image getImage(Object element) {
		Image image = CorePlugin.getImageFor(element, false);
		if(image != null) {
			return image;
		}
		return CorePlugin.getImageFor("DataTypePackage.gif");
	}
    }       
