/**
 */
package emobility.impl;

import emobility.App_to_from_CS_operator_system;
import emobility.App_to_from_CS_operator_system_Cat;
import emobility.EmobilityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App to from CS operator system</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.App_to_from_CS_operator_systemImpl#getData_type <em>Data type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class App_to_from_CS_operator_systemImpl extends EMobility_DataImpl implements App_to_from_CS_operator_system {
	/**
	 * The default value of the '{@link #getData_type() <em>Data type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_type()
	 * @generated
	 * @ordered
	 */
	protected static final App_to_from_CS_operator_system_Cat DATA_TYPE_EDEFAULT = App_to_from_CS_operator_system_Cat.GPS_COORDINATES_OF_AMIDDLE_POINT_ON_THE_TRIP;

	/**
	 * The cached value of the '{@link #getData_type() <em>Data type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_type()
	 * @generated
	 * @ordered
	 */
	protected App_to_from_CS_operator_system_Cat data_type = DATA_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected App_to_from_CS_operator_systemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.APP_TO_FROM_CS_OPERATOR_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App_to_from_CS_operator_system_Cat getData_type() {
		return data_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData_type(App_to_from_CS_operator_system_Cat newData_type) {
		App_to_from_CS_operator_system_Cat oldData_type = data_type;
		data_type = newData_type == null ? DATA_TYPE_EDEFAULT : newData_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.APP_TO_FROM_CS_OPERATOR_SYSTEM__DATA_TYPE, oldData_type, data_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmobilityPackage.APP_TO_FROM_CS_OPERATOR_SYSTEM__DATA_TYPE:
				return getData_type();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmobilityPackage.APP_TO_FROM_CS_OPERATOR_SYSTEM__DATA_TYPE:
				setData_type((App_to_from_CS_operator_system_Cat)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmobilityPackage.APP_TO_FROM_CS_OPERATOR_SYSTEM__DATA_TYPE:
				setData_type(DATA_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmobilityPackage.APP_TO_FROM_CS_OPERATOR_SYSTEM__DATA_TYPE:
				return data_type != DATA_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (data_type: ");
		result.append(data_type);
		result.append(')');
		return result.toString();
	}

} //App_to_from_CS_operator_systemImpl