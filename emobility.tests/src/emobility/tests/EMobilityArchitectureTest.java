/**
 */
package emobility.tests;

import emobility.EMobilityArchitecture;
import emobility.EmobilityFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EMobility Architecture</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMobilityArchitectureTest extends TestCase {

	/**
	 * The fixture for this EMobility Architecture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMobilityArchitecture fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EMobilityArchitectureTest.class);
	}

	/**
	 * Constructs a new EMobility Architecture test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMobilityArchitectureTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this EMobility Architecture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EMobilityArchitecture fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this EMobility Architecture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMobilityArchitecture getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EmobilityFactory.eINSTANCE.createEMobilityArchitecture());
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

} //EMobilityArchitectureTest
