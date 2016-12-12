/**
 * generated by Xtext 2.10.0
 */
package org.smalluml.smalluml;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smalluml.smalluml.Association#getName <em>Name</em>}</li>
 *   <li>{@link org.smalluml.smalluml.Association#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see org.smalluml.smalluml.SmallumlPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.smalluml.smalluml.SmallumlPackage#getAssociation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.smalluml.smalluml.Association#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Role</b></em>' containment reference list.
   * The list contents are of type {@link org.smalluml.smalluml.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' containment reference list.
   * @see org.smalluml.smalluml.SmallumlPackage#getAssociation_Role()
   * @model containment="true"
   * @generated
   */
  EList<Role> getRole();

} // Association