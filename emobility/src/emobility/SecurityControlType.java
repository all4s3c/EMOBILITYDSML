/**
 */
package emobility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Security Control Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see emobility.EmobilityPackage#getSecurityControlType()
 * @model
 * @generated
 */
public enum SecurityControlType implements Enumerator {
	/**
	 * The '<em><b>Encryption</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCRYPTION_VALUE
	 * @generated
	 * @ordered
	 */
	ENCRYPTION(0, "Encryption", "Encryption"),

	/**
	 * The '<em><b>WAF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAF_VALUE
	 * @generated
	 * @ordered
	 */
	WAF(1, "WAF", "WAF"),

	/**
	 * The '<em><b>IP Filtering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_FILTERING_VALUE
	 * @generated
	 * @ordered
	 */
	IP_FILTERING(2, "IP_Filtering", "IP_Filtering"),

	/**
	 * The '<em><b>Antimalware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANTIMALWARE_VALUE
	 * @generated
	 * @ordered
	 */
	ANTIMALWARE(3, "Antimalware", "Antimalware"),

	/**
	 * The '<em><b>IPS IDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPS_IDS_VALUE
	 * @generated
	 * @ordered
	 */
	IPS_IDS(4, "IPS_IDS", "IPS_IDS"),

	/**
	 * The '<em><b>Authentication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATION_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHENTICATION(5, "Authentication", "Authentication"),

	/**
	 * The '<em><b>API Management</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #API_MANAGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	API_MANAGEMENT(6, "API_Management", "API_Management"),

	/**
	 * The '<em><b>Secure Software Developement Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_SOFTWARE_DEVELOPEMENT_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	SECURE_SOFTWARE_DEVELOPEMENT_PROCESS(7, "Secure_Software_Developement_Process", "Secure_Software_Developement_Process"),

	/**
	 * The '<em><b>Logging access and actions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGGING_ACCESS_AND_ACTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	LOGGING_ACCESS_AND_ACTIONS(8, "Logging_access_and_actions", "Logging_access_and_actions"),

	/**
	 * The '<em><b>Hardening</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDENING_VALUE
	 * @generated
	 * @ordered
	 */
	HARDENING(9, "Hardening", "Hardening"),

	/**
	 * The '<em><b>Patch Management</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATCH_MANAGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	PATCH_MANAGEMENT(10, "Patch_Management", "Patch_Management"),

	/**
	 * The '<em><b>Access Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_CONTROL(13, "Access_Control", "Access_Control"),

	/**
	 * The '<em><b>Locking mecanisms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCKING_MECANISMS_VALUE
	 * @generated
	 * @ordered
	 */
	LOCKING_MECANISMS(14, "Locking_mecanisms", "Locking_mecanisms"),

	/**
	 * The '<em><b>Door Sensors</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOOR_SENSORS_VALUE
	 * @generated
	 * @ordered
	 */
	DOOR_SENSORS(15, "Door_Sensors", "Door_Sensors"),

	/**
	 * The '<em><b>Tamper evident seals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAMPER_EVIDENT_SEALS_VALUE
	 * @generated
	 * @ordered
	 */
	TAMPER_EVIDENT_SEALS(16, "Tamper_evident_seals", "Tamper_evident_seals"),

	/**
	 * The '<em><b>Inspection of seals and Intrenal material</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSPECTION_OF_SEALS_AND_INTRENAL_MATERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	INSPECTION_OF_SEALS_AND_INTRENAL_MATERIAL(17, "Inspection_of_seals_and_Intrenal_material", "Inspection_of_seals_and_Intrenal_material"),

	/**
	 * The '<em><b>RFID Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFID_CARD_VALUE
	 * @generated
	 * @ordered
	 */
	RFID_CARD(18, "RFID_Card", "RFID_Card"),

	/**
	 * The '<em><b>Authentication OTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATION_OTP_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHENTICATION_OTP(19, "Authentication_OTP", "Authentication_OTP"),

	/**
	 * The '<em><b>Authentication App</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATION_APP_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHENTICATION_APP(20, "Authentication_App", "Authentication_App");

	/**
	 * The '<em><b>Encryption</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCRYPTION
	 * @model name="Encryption"
	 * @generated
	 * @ordered
	 */
	public static final int ENCRYPTION_VALUE = 0;

	/**
	 * The '<em><b>WAF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAF_VALUE = 1;

	/**
	 * The '<em><b>IP Filtering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_FILTERING
	 * @model name="IP_Filtering"
	 * @generated
	 * @ordered
	 */
	public static final int IP_FILTERING_VALUE = 2;

	/**
	 * The '<em><b>Antimalware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANTIMALWARE
	 * @model name="Antimalware"
	 * @generated
	 * @ordered
	 */
	public static final int ANTIMALWARE_VALUE = 3;

	/**
	 * The '<em><b>IPS IDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPS_IDS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPS_IDS_VALUE = 4;

	/**
	 * The '<em><b>Authentication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATION
	 * @model name="Authentication"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHENTICATION_VALUE = 5;

	/**
	 * The '<em><b>API Management</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #API_MANAGEMENT
	 * @model name="API_Management"
	 * @generated
	 * @ordered
	 */
	public static final int API_MANAGEMENT_VALUE = 6;

	/**
	 * The '<em><b>Secure Software Developement Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_SOFTWARE_DEVELOPEMENT_PROCESS
	 * @model name="Secure_Software_Developement_Process"
	 * @generated
	 * @ordered
	 */
	public static final int SECURE_SOFTWARE_DEVELOPEMENT_PROCESS_VALUE = 7;

	/**
	 * The '<em><b>Logging access and actions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGGING_ACCESS_AND_ACTIONS
	 * @model name="Logging_access_and_actions"
	 * @generated
	 * @ordered
	 */
	public static final int LOGGING_ACCESS_AND_ACTIONS_VALUE = 8;

	/**
	 * The '<em><b>Hardening</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDENING
	 * @model name="Hardening"
	 * @generated
	 * @ordered
	 */
	public static final int HARDENING_VALUE = 9;

	/**
	 * The '<em><b>Patch Management</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATCH_MANAGEMENT
	 * @model name="Patch_Management"
	 * @generated
	 * @ordered
	 */
	public static final int PATCH_MANAGEMENT_VALUE = 10;

	/**
	 * The '<em><b>Access Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_CONTROL
	 * @model name="Access_Control"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_CONTROL_VALUE = 13;

	/**
	 * The '<em><b>Locking mecanisms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCKING_MECANISMS
	 * @model name="Locking_mecanisms"
	 * @generated
	 * @ordered
	 */
	public static final int LOCKING_MECANISMS_VALUE = 14;

	/**
	 * The '<em><b>Door Sensors</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOOR_SENSORS
	 * @model name="Door_Sensors"
	 * @generated
	 * @ordered
	 */
	public static final int DOOR_SENSORS_VALUE = 15;

	/**
	 * The '<em><b>Tamper evident seals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAMPER_EVIDENT_SEALS
	 * @model name="Tamper_evident_seals"
	 * @generated
	 * @ordered
	 */
	public static final int TAMPER_EVIDENT_SEALS_VALUE = 16;

	/**
	 * The '<em><b>Inspection of seals and Intrenal material</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSPECTION_OF_SEALS_AND_INTRENAL_MATERIAL
	 * @model name="Inspection_of_seals_and_Intrenal_material"
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_OF_SEALS_AND_INTRENAL_MATERIAL_VALUE = 17;

	/**
	 * The '<em><b>RFID Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFID_CARD
	 * @model name="RFID_Card"
	 * @generated
	 * @ordered
	 */
	public static final int RFID_CARD_VALUE = 18;

	/**
	 * The '<em><b>Authentication OTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATION_OTP
	 * @model name="Authentication_OTP"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHENTICATION_OTP_VALUE = 19;

	/**
	 * The '<em><b>Authentication App</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATION_APP
	 * @model name="Authentication_App"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHENTICATION_APP_VALUE = 20;

	/**
	 * An array of all the '<em><b>Security Control Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SecurityControlType[] VALUES_ARRAY =
		new SecurityControlType[] {
			ENCRYPTION,
			WAF,
			IP_FILTERING,
			ANTIMALWARE,
			IPS_IDS,
			AUTHENTICATION,
			API_MANAGEMENT,
			SECURE_SOFTWARE_DEVELOPEMENT_PROCESS,
			LOGGING_ACCESS_AND_ACTIONS,
			HARDENING,
			PATCH_MANAGEMENT,
			ACCESS_CONTROL,
			LOCKING_MECANISMS,
			DOOR_SENSORS,
			TAMPER_EVIDENT_SEALS,
			INSPECTION_OF_SEALS_AND_INTRENAL_MATERIAL,
			RFID_CARD,
			AUTHENTICATION_OTP,
			AUTHENTICATION_APP,
		};

	/**
	 * A public read-only list of all the '<em><b>Security Control Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SecurityControlType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Security Control Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityControlType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityControlType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Control Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityControlType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityControlType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Control Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityControlType get(int value) {
		switch (value) {
			case ENCRYPTION_VALUE: return ENCRYPTION;
			case WAF_VALUE: return WAF;
			case IP_FILTERING_VALUE: return IP_FILTERING;
			case ANTIMALWARE_VALUE: return ANTIMALWARE;
			case IPS_IDS_VALUE: return IPS_IDS;
			case AUTHENTICATION_VALUE: return AUTHENTICATION;
			case API_MANAGEMENT_VALUE: return API_MANAGEMENT;
			case SECURE_SOFTWARE_DEVELOPEMENT_PROCESS_VALUE: return SECURE_SOFTWARE_DEVELOPEMENT_PROCESS;
			case LOGGING_ACCESS_AND_ACTIONS_VALUE: return LOGGING_ACCESS_AND_ACTIONS;
			case HARDENING_VALUE: return HARDENING;
			case PATCH_MANAGEMENT_VALUE: return PATCH_MANAGEMENT;
			case ACCESS_CONTROL_VALUE: return ACCESS_CONTROL;
			case LOCKING_MECANISMS_VALUE: return LOCKING_MECANISMS;
			case DOOR_SENSORS_VALUE: return DOOR_SENSORS;
			case TAMPER_EVIDENT_SEALS_VALUE: return TAMPER_EVIDENT_SEALS;
			case INSPECTION_OF_SEALS_AND_INTRENAL_MATERIAL_VALUE: return INSPECTION_OF_SEALS_AND_INTRENAL_MATERIAL;
			case RFID_CARD_VALUE: return RFID_CARD;
			case AUTHENTICATION_OTP_VALUE: return AUTHENTICATION_OTP;
			case AUTHENTICATION_APP_VALUE: return AUTHENTICATION_APP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SecurityControlType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SecurityControlType
