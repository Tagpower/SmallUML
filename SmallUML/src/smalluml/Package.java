/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Package#getElements <em>Elements</em>}</li>
 *   <li>{@link smalluml.Package#getAssociation <em>Association</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.SuperType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getPackage_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperType> getElements();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getPackage_Association()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getAssociation();

} // Package
