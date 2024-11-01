/**
 */
package emobility.tests;

import emobility.App_to_from_Route_Planning;
import emobility.EmobilityFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>App to from Route Planning</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class App_to_from_Route_PlanningTest extends EMobility_DataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(App_to_from_Route_PlanningTest.class);
	}

	/**
	 * Constructs a new App to from Route Planning test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App_to_from_Route_PlanningTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this App to from Route Planning test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected App_to_from_Route_Planning getFixture() {
		return (App_to_from_Route_Planning)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EmobilityFactory.eINSTANCE.createApp_to_from_Route_Planning());
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

} //App_to_from_Route_PlanningTest
