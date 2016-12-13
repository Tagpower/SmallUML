/**
 */
package smalluml;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Enumeration#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends SuperType {
	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' attribute list.
	 * @see smalluml.SmallumlPackage#getEnumeration_Enumeration()
	 * @model
	 * @generated
	 */
	EList<String> getEnumeration();

} // Enumeration
