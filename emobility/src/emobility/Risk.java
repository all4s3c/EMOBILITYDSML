/**
 */
package emobility;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.Risk#getThreat <em>Threat</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getRisk()
 * @model
 * @generated
 */
public interface Risk extends EMobilityElement {
	/**
	 * Returns the value of the '<em><b>Threat</b></em>' containment reference list.
	 * The list contents are of type {@link emobility.Threat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat</em>' containment reference list.
	 * @see emobility.EmobilityPackage#getRisk_Threat()
	 * @model containment="true"
	 * @generated
	 */
	EList<Threat> getThreat();

} // Risk
