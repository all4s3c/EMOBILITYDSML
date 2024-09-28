/**
 */
package emobility;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emobility.Threat#getId <em>Id</em>}</li>
 *   <li>{@link emobility.Threat#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link emobility.Threat#getAsset <em>Asset</em>}</li>
 *   <li>{@link emobility.Threat#getRisk_level <em>Risk level</em>}</li>
 *   <li>{@link emobility.Threat#getExploits <em>Exploits</em>}</li>
 *   <li>{@link emobility.Threat#getImplemented_security_controls <em>Implemented security controls</em>}</li>
 *   <li>{@link emobility.Threat#getMitigations <em>Mitigations</em>}</li>
 *   <li>{@link emobility.Threat#getThreat_category <em>Threat category</em>}</li>
 * </ul>
 *
 * @see emobility.EmobilityPackage#getThreat()
 * @model
 * @generated
 */
public interface Threat extends EMobilityElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see emobility.EmobilityPackage#getThreat_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link emobility.Threat#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Likelihood</b></em>' attribute.
	 * The literals are from the enumeration {@link emobility.Likelihood_Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likelihood</em>' attribute.
	 * @see emobility.Likelihood_Level
	 * @see #setLikelihood(Likelihood_Level)
	 * @see emobility.EmobilityPackage#getThreat_Likelihood()
	 * @model
	 * @generated
	 */
	Likelihood_Level getLikelihood();

	/**
	 * Sets the value of the '{@link emobility.Threat#getLikelihood <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Likelihood</em>' attribute.
	 * @see emobility.Likelihood_Level
	 * @see #getLikelihood()
	 * @generated
	 */
	void setLikelihood(Likelihood_Level value);

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(Asset)
	 * @see emobility.EmobilityPackage#getThreat_Asset()
	 * @model
	 * @generated
	 */
	Asset getAsset();

	/**
	 * Sets the value of the '{@link emobility.Threat#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(Asset value);

	/**
	 * Returns the value of the '<em><b>Risk level</b></em>' attribute.
	 * The literals are from the enumeration {@link emobility.Likelihood_Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk level</em>' attribute.
	 * @see emobility.Likelihood_Level
	 * @see #setRisk_level(Likelihood_Level)
	 * @see emobility.EmobilityPackage#getThreat_Risk_level()
	 * @model
	 * @generated
	 */
	Likelihood_Level getRisk_level();

	/**
	 * Sets the value of the '{@link emobility.Threat#getRisk_level <em>Risk level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk level</em>' attribute.
	 * @see emobility.Likelihood_Level
	 * @see #getRisk_level()
	 * @generated
	 */
	void setRisk_level(Likelihood_Level value);

	/**
	 * Returns the value of the '<em><b>Exploits</b></em>' reference list.
	 * The list contents are of type {@link emobility.Vulnerability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exploits</em>' reference list.
	 * @see emobility.EmobilityPackage#getThreat_Exploits()
	 * @model
	 * @generated
	 */
	EList<Vulnerability> getExploits();

	/**
	 * Returns the value of the '<em><b>Implemented security controls</b></em>' reference list.
	 * The list contents are of type {@link emobility.SecurityControl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented security controls</em>' reference list.
	 * @see emobility.EmobilityPackage#getThreat_Implemented_security_controls()
	 * @model
	 * @generated
	 */
	EList<SecurityControl> getImplemented_security_controls();

	/**
	 * Returns the value of the '<em><b>Mitigations</b></em>' reference list.
	 * The list contents are of type {@link emobility.SecurityControl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigations</em>' reference list.
	 * @see emobility.EmobilityPackage#getThreat_Mitigations()
	 * @model
	 * @generated
	 */
	EList<SecurityControl> getMitigations();

	/**
	 * Returns the value of the '<em><b>Threat category</b></em>' attribute.
	 * The literals are from the enumeration {@link emobility.Threat_Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat category</em>' attribute.
	 * @see emobility.Threat_Category
	 * @see #setThreat_category(Threat_Category)
	 * @see emobility.EmobilityPackage#getThreat_Threat_category()
	 * @model
	 * @generated
	 */
	Threat_Category getThreat_category();

	/**
	 * Sets the value of the '{@link emobility.Threat#getThreat_category <em>Threat category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threat category</em>' attribute.
	 * @see emobility.Threat_Category
	 * @see #getThreat_category()
	 * @generated
	 */
	void setThreat_category(Threat_Category value);

} // Threat
