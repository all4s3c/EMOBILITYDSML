/**
 */
package emobility;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.SecurityControl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getSecurityControl()
 * @model
 * @generated
 */
public interface SecurityControl extends EMobilityElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link emobility.SecurityControlType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see emobility.SecurityControlType
	 * @see #setType(SecurityControlType)
	 * @see emobility.EmobilityPackage#getSecurityControl_Type()
	 * @model
	 * @generated
	 */
	SecurityControlType getType();

	/**
	 * Sets the value of the '{@link emobility.SecurityControl#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see emobility.SecurityControlType
	 * @see #getType()
	 * @generated
	 */
	void setType(SecurityControlType value);

} // SecurityControl
