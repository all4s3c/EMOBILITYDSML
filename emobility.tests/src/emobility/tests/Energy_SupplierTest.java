/**
 */
package emobility.tests;

import emobility.EmobilityFactory;
import emobility.Energy_Supplier;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Energy Supplier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Energy_SupplierTest extends Energy_Conversion_ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Energy_SupplierTest.class);
	}

	/**
	 * Constructs a new Energy Supplier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Energy_SupplierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Energy Supplier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Energy_Supplier getFixture() {
		return (Energy_Supplier)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EmobilityFactory.eINSTANCE.createEnergy_Supplier());
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

} //Energy_SupplierTest
