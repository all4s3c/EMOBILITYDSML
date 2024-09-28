/**
 */
package emobility.impl;

import emobility.Asset;
import emobility.EmobilityPackage;
import emobility.Likelihood_Level;
import emobility.SecurityControl;
import emobility.Threat;
import emobility.Threat_Category;
import emobility.Vulnerability;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emobility.impl.ThreatImpl#getId <em>Id</em>}</li>
 *   <li>{@link emobility.impl.ThreatImpl#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link emobility.impl.ThreatImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link emobility.impl.ThreatImpl#getRisk_level <em>Risk level</em>}</li>
 *   <li>{@link emobility.impl.ThreatImpl#getExploits <em>Exploits</em>}</li>
 *   <li>{@link emobility.impl.ThreatImpl#getImplemented_security_controls <em>Implemented security controls</em>}</li>
 *   <li>{@link emobility.impl.ThreatImpl#getMitigations <em>Mitigations</em>}</li>
 *   <li>{@link emobility.impl.ThreatImpl#getThreat_category <em>Threat category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatImpl extends EMobilityElementImpl implements Threat {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected static final Likelihood_Level LIKELIHOOD_EDEFAULT = Likelihood_Level.L3;

	/**
	 * The cached value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected Likelihood_Level likelihood = LIKELIHOOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset asset;

	/**
	 * The default value of the '{@link #getRisk_level() <em>Risk level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk_level()
	 * @generated
	 * @ordered
	 */
	protected static final Likelihood_Level RISK_LEVEL_EDEFAULT = Likelihood_Level.L3;

	/**
	 * The cached value of the '{@link #getRisk_level() <em>Risk level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk_level()
	 * @generated
	 * @ordered
	 */
	protected Likelihood_Level risk_level = RISK_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExploits() <em>Exploits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExploits()
	 * @generated
	 * @ordered
	 */
	protected EList<Vulnerability> exploits;

	/**
	 * The cached value of the '{@link #getImplemented_security_controls() <em>Implemented security controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplemented_security_controls()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityControl> implemented_security_controls;

	/**
	 * The cached value of the '{@link #getMitigations() <em>Mitigations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigations()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityControl> mitigations;

	/**
	 * The default value of the '{@link #getThreat_category() <em>Threat category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreat_category()
	 * @generated
	 * @ordered
	 */
	protected static final Threat_Category THREAT_CATEGORY_EDEFAULT = Threat_Category.SPOOFING;

	/**
	 * The cached value of the '{@link #getThreat_category() <em>Threat category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreat_category()
	 * @generated
	 * @ordered
	 */
	protected Threat_Category threat_category = THREAT_CATEGORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmobilityPackage.Literals.THREAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.THREAT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Likelihood_Level getLikelihood() {
		return likelihood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLikelihood(Likelihood_Level newLikelihood) {
		Likelihood_Level oldLikelihood = likelihood;
		likelihood = newLikelihood == null ? LIKELIHOOD_EDEFAULT : newLikelihood;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.THREAT__LIKELIHOOD, oldLikelihood, likelihood));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset getAsset() {
		if (asset != null && asset.eIsProxy()) {
			InternalEObject oldAsset = (InternalEObject)asset;
			asset = (Asset)eResolveProxy(oldAsset);
			if (asset != oldAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmobilityPackage.THREAT__ASSET, oldAsset, asset));
			}
		}
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetAsset() {
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsset(Asset newAsset) {
		Asset oldAsset = asset;
		asset = newAsset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.THREAT__ASSET, oldAsset, asset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Likelihood_Level getRisk_level() {
		return risk_level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRisk_level(Likelihood_Level newRisk_level) {
		Likelihood_Level oldRisk_level = risk_level;
		risk_level = newRisk_level == null ? RISK_LEVEL_EDEFAULT : newRisk_level;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.THREAT__RISK_LEVEL, oldRisk_level, risk_level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vulnerability> getExploits() {
		if (exploits == null) {
			exploits = new EObjectResolvingEList<Vulnerability>(Vulnerability.class, this, EmobilityPackage.THREAT__EXPLOITS);
		}
		return exploits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityControl> getImplemented_security_controls() {
		if (implemented_security_controls == null) {
			implemented_security_controls = new EObjectResolvingEList<SecurityControl>(SecurityControl.class, this, EmobilityPackage.THREAT__IMPLEMENTED_SECURITY_CONTROLS);
		}
		return implemented_security_controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityControl> getMitigations() {
		if (mitigations == null) {
			mitigations = new EObjectResolvingEList<SecurityControl>(SecurityControl.class, this, EmobilityPackage.THREAT__MITIGATIONS);
		}
		return mitigations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Threat_Category getThreat_category() {
		return threat_category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreat_category(Threat_Category newThreat_category) {
		Threat_Category oldThreat_category = threat_category;
		threat_category = newThreat_category == null ? THREAT_CATEGORY_EDEFAULT : newThreat_category;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmobilityPackage.THREAT__THREAT_CATEGORY, oldThreat_category, threat_category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmobilityPackage.THREAT__ID:
				return getId();
			case EmobilityPackage.THREAT__LIKELIHOOD:
				return getLikelihood();
			case EmobilityPackage.THREAT__ASSET:
				if (resolve) return getAsset();
				return basicGetAsset();
			case EmobilityPackage.THREAT__RISK_LEVEL:
				return getRisk_level();
			case EmobilityPackage.THREAT__EXPLOITS:
				return getExploits();
			case EmobilityPackage.THREAT__IMPLEMENTED_SECURITY_CONTROLS:
				return getImplemented_security_controls();
			case EmobilityPackage.THREAT__MITIGATIONS:
				return getMitigations();
			case EmobilityPackage.THREAT__THREAT_CATEGORY:
				return getThreat_category();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmobilityPackage.THREAT__ID:
				setId((String)newValue);
				return;
			case EmobilityPackage.THREAT__LIKELIHOOD:
				setLikelihood((Likelihood_Level)newValue);
				return;
			case EmobilityPackage.THREAT__ASSET:
				setAsset((Asset)newValue);
				return;
			case EmobilityPackage.THREAT__RISK_LEVEL:
				setRisk_level((Likelihood_Level)newValue);
				return;
			case EmobilityPackage.THREAT__EXPLOITS:
				getExploits().clear();
				getExploits().addAll((Collection<? extends Vulnerability>)newValue);
				return;
			case EmobilityPackage.THREAT__IMPLEMENTED_SECURITY_CONTROLS:
				getImplemented_security_controls().clear();
				getImplemented_security_controls().addAll((Collection<? extends SecurityControl>)newValue);
				return;
			case EmobilityPackage.THREAT__MITIGATIONS:
				getMitigations().clear();
				getMitigations().addAll((Collection<? extends SecurityControl>)newValue);
				return;
			case EmobilityPackage.THREAT__THREAT_CATEGORY:
				setThreat_category((Threat_Category)newValue);
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
			case EmobilityPackage.THREAT__ID:
				setId(ID_EDEFAULT);
				return;
			case EmobilityPackage.THREAT__LIKELIHOOD:
				setLikelihood(LIKELIHOOD_EDEFAULT);
				return;
			case EmobilityPackage.THREAT__ASSET:
				setAsset((Asset)null);
				return;
			case EmobilityPackage.THREAT__RISK_LEVEL:
				setRisk_level(RISK_LEVEL_EDEFAULT);
				return;
			case EmobilityPackage.THREAT__EXPLOITS:
				getExploits().clear();
				return;
			case EmobilityPackage.THREAT__IMPLEMENTED_SECURITY_CONTROLS:
				getImplemented_security_controls().clear();
				return;
			case EmobilityPackage.THREAT__MITIGATIONS:
				getMitigations().clear();
				return;
			case EmobilityPackage.THREAT__THREAT_CATEGORY:
				setThreat_category(THREAT_CATEGORY_EDEFAULT);
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
			case EmobilityPackage.THREAT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EmobilityPackage.THREAT__LIKELIHOOD:
				return likelihood != LIKELIHOOD_EDEFAULT;
			case EmobilityPackage.THREAT__ASSET:
				return asset != null;
			case EmobilityPackage.THREAT__RISK_LEVEL:
				return risk_level != RISK_LEVEL_EDEFAULT;
			case EmobilityPackage.THREAT__EXPLOITS:
				return exploits != null && !exploits.isEmpty();
			case EmobilityPackage.THREAT__IMPLEMENTED_SECURITY_CONTROLS:
				return implemented_security_controls != null && !implemented_security_controls.isEmpty();
			case EmobilityPackage.THREAT__MITIGATIONS:
				return mitigations != null && !mitigations.isEmpty();
			case EmobilityPackage.THREAT__THREAT_CATEGORY:
				return threat_category != THREAT_CATEGORY_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", likelihood: ");
		result.append(likelihood);
		result.append(", risk_level: ");
		result.append(risk_level);
		result.append(", threat_category: ");
		result.append(threat_category);
		result.append(')');
		return result.toString();
	}

} //ThreatImpl
