/**
 */
package emobility;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EVSE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.EVSE#getElectric_vehicule <em>Electric vehicule</em>}</li>
 *   <li>{@link emobility.EVSE#isIsExposed <em>Is Exposed</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getEVSE()
 * @model
 * @generated
 */
public interface EVSE extends Energy_Transfer_Element {
	/**
	 * Returns the value of the '<em><b>Electric vehicule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emobility.Electric_Vehicule#getEvse <em>Evse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electric vehicule</em>' reference.
	 * @see #setElectric_vehicule(Electric_Vehicule)
	 * @see emobility.EmobilityPackage#getEVSE_Electric_vehicule()
	 * @see emobility.Electric_Vehicule#getEvse
	 * @model opposite="evse"
	 * @generated
	 */
	Electric_Vehicule getElectric_vehicule();

	/**
	 * Sets the value of the '{@link emobility.EVSE#getElectric_vehicule <em>Electric vehicule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electric vehicule</em>' reference.
	 * @see #getElectric_vehicule()
	 * @generated
	 */
	void setElectric_vehicule(Electric_Vehicule value);

	/**
	 * Returns the value of the '<em><b>Is Exposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Exposed</em>' attribute.
	 * @see #setIsExposed(boolean)
	 * @see emobility.EmobilityPackage#getEVSE_IsExposed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsExposed();

	/**
	 * Sets the value of the '{@link emobility.EVSE#isIsExposed <em>Is Exposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exposed</em>' attribute.
	 * @see #isIsExposed()
	 * @generated
	 */
	void setIsExposed(boolean value);

} // EVSE
