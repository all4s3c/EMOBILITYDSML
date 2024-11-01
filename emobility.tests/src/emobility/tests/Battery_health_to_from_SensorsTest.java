/**
 */
package emobility.tests;

import emobility.Battery_health_to_from_Sensors;
import emobility.EmobilityFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Battery health to from Sensors</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Battery_health_to_from_SensorsTest extends EMobility_DataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Battery_health_to_from_SensorsTest.class);
	}

	/**
	 * Constructs a new Battery health to from Sensors test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Battery_health_to_from_SensorsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Battery health to from Sensors test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Battery_health_to_from_Sensors getFixture() {
		return (Battery_health_to_from_Sensors)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EmobilityFactory.eINSTANCE.createBattery_health_to_from_Sensors());
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

} //Battery_health_to_from_SensorsTest
