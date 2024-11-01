/**
 */
package emobility.tests;

import emobility.CS_manag_sys_to_from_CS_Controller;
import emobility.EmobilityFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CS manag sys to from CS Controller</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CS_manag_sys_to_from_CS_ControllerTest extends EMobility_DataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CS_manag_sys_to_from_CS_ControllerTest.class);
	}

	/**
	 * Constructs a new CS manag sys to from CS Controller test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS_manag_sys_to_from_CS_ControllerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this CS manag sys to from CS Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CS_manag_sys_to_from_CS_Controller getFixture() {
		return (CS_manag_sys_to_from_CS_Controller)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EmobilityFactory.eINSTANCE.createCS_manag_sys_to_from_CS_Controller());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CS_manag_sys_to_from_CS_ControllerTest
