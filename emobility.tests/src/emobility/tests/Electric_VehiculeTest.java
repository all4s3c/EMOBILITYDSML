/**
 */
package emobility.tests;

import emobility.Electric_Vehicule;
import emobility.EmobilityFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Electric Vehicule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Electric_VehiculeTest extends EMobilityElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Electric_VehiculeTest.class);
	}

	/**
	 * Constructs a new Electric Vehicule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Electric_VehiculeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Electric Vehicule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Electric_Vehicule getFixture() {
		return (Electric_Vehicule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EmobilityFactory.eINSTANCE.createElectric_Vehicule());
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

} //Electric_VehiculeTest
