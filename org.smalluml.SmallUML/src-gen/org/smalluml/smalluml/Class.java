/**
 * generated by Xtext 2.10.0
 */
package org.smalluml.smalluml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smalluml.smalluml.Class#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.smalluml.smalluml.Class#getSuper <em>Super</em>}</li>
 *   <li>{@link org.smalluml.smalluml.Class#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.smalluml.smalluml.Class#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see org.smalluml.smalluml.SmallumlPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends SuperType
{
  /**
   * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Abstract</em>' attribute.
   * @see #setIsAbstract(boolean)
   * @see org.smalluml.smalluml.SmallumlPackage#getClass_IsAbstract()
   * @model
   * @generated
   */
  boolean isIsAbstract();

  /**
   * Sets the value of the '{@link org.smalluml.smalluml.Class#isIsAbstract <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Abstract</em>' attribute.
   * @see #isIsAbstract()
   * @generated
   */
  void setIsAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Super</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super</em>' reference.
   * @see #setSuper(Inheritance)
   * @see org.smalluml.smalluml.SmallumlPackage#getClass_Super()
   * @model
   * @generated
   */
  Inheritance getSuper();

  /**
   * Sets the value of the '{@link org.smalluml.smalluml.Class#getSuper <em>Super</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super</em>' reference.
   * @see #getSuper()
   * @generated
   */
  void setSuper(Inheritance value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link org.smalluml.smalluml.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see org.smalluml.smalluml.SmallumlPackage#getClass_Attribute()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttribute();

  /**
   * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
   * The list contents are of type {@link org.smalluml.smalluml.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' containment reference list.
   * @see org.smalluml.smalluml.SmallumlPackage#getClass_Operation()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperation();

} // Class
