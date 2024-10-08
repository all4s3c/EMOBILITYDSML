/**
 */
package emobility.provider;

import emobility.util.EmobilityAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EmobilityItemProviderAdapterFactory extends EmobilityAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmobilityItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.CS_operator_sys_to_from_CS_manag_sys} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CS_operator_sys_to_from_CS_manag_sysItemProvider cS_operator_sys_to_from_CS_manag_sysItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.CS_operator_sys_to_from_CS_manag_sys}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCS_operator_sys_to_from_CS_manag_sysAdapter() {
		if (cS_operator_sys_to_from_CS_manag_sysItemProvider == null) {
			cS_operator_sys_to_from_CS_manag_sysItemProvider = new CS_operator_sys_to_from_CS_manag_sysItemProvider(this);
		}

		return cS_operator_sys_to_from_CS_manag_sysItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.App_to_from_Route_Planning} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected App_to_from_Route_PlanningItemProvider app_to_from_Route_PlanningItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.App_to_from_Route_Planning}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApp_to_from_Route_PlanningAdapter() {
		if (app_to_from_Route_PlanningItemProvider == null) {
			app_to_from_Route_PlanningItemProvider = new App_to_from_Route_PlanningItemProvider(this);
		}

		return app_to_from_Route_PlanningItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.CSO} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSOItemProvider csoItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.CSO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCSOAdapter() {
		if (csoItemProvider == null) {
			csoItemProvider = new CSOItemProvider(this);
		}

		return csoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.CS_Controller} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CS_ControllerItemProvider cS_ControllerItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.CS_Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCS_ControllerAdapter() {
		if (cS_ControllerItemProvider == null) {
			cS_ControllerItemProvider = new CS_ControllerItemProvider(this);
		}

		return cS_ControllerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.CSMS} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSMSItemProvider csmsItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.CSMS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCSMSAdapter() {
		if (csmsItemProvider == null) {
			csmsItemProvider = new CSMSItemProvider(this);
		}

		return csmsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.EV_User} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EV_UserItemProvider eV_UserItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.EV_User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEV_UserAdapter() {
		if (eV_UserItemProvider == null) {
			eV_UserItemProvider = new EV_UserItemProvider(this);
		}

		return eV_UserItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.EMobilityArchitecture} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMobilityArchitectureItemProvider eMobilityArchitectureItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.EMobilityArchitecture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEMobilityArchitectureAdapter() {
		if (eMobilityArchitectureItemProvider == null) {
			eMobilityArchitectureItemProvider = new EMobilityArchitectureItemProvider(this);
		}

		return eMobilityArchitectureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.DSO} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSOItemProvider dsoItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.DSO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDSOAdapter() {
		if (dsoItemProvider == null) {
			dsoItemProvider = new DSOItemProvider(this);
		}

		return dsoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.Server} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerItemProvider serverItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.Server}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServerAdapter() {
		if (serverItemProvider == null) {
			serverItemProvider = new ServerItemProvider(this);
		}

		return serverItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.EVSE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EVSEItemProvider evseItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.EVSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEVSEAdapter() {
		if (evseItemProvider == null) {
			evseItemProvider = new EVSEItemProvider(this);
		}

		return evseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.Energy_Supplier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Energy_SupplierItemProvider energy_SupplierItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.Energy_Supplier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnergy_SupplierAdapter() {
		if (energy_SupplierItemProvider == null) {
			energy_SupplierItemProvider = new Energy_SupplierItemProvider(this);
		}

		return energy_SupplierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.Laptop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaptopItemProvider laptopItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.Laptop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLaptopAdapter() {
		if (laptopItemProvider == null) {
			laptopItemProvider = new LaptopItemProvider(this);
		}

		return laptopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.App_to_from_CS_operator_system} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected App_to_from_CS_operator_systemItemProvider app_to_from_CS_operator_systemItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.App_to_from_CS_operator_system}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApp_to_from_CS_operator_systemAdapter() {
		if (app_to_from_CS_operator_systemItemProvider == null) {
			app_to_from_CS_operator_systemItemProvider = new App_to_from_CS_operator_systemItemProvider(this);
		}

		return app_to_from_CS_operator_systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.Browser} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowserItemProvider browserItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.Browser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBrowserAdapter() {
		if (browserItemProvider == null) {
			browserItemProvider = new BrowserItemProvider(this);
		}

		return browserItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.App_to_Energy_information} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected App_to_Energy_informationItemProvider app_to_Energy_informationItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.App_to_Energy_information}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApp_to_Energy_informationAdapter() {
		if (app_to_Energy_informationItemProvider == null) {
			app_to_Energy_informationItemProvider = new App_to_Energy_informationItemProvider(this);
		}

		return app_to_Energy_informationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.Battery_health_to_from_Sensors} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Battery_health_to_from_SensorsItemProvider battery_health_to_from_SensorsItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.Battery_health_to_from_Sensors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBattery_health_to_from_SensorsAdapter() {
		if (battery_health_to_from_SensorsItemProvider == null) {
			battery_health_to_from_SensorsItemProvider = new Battery_health_to_from_SensorsItemProvider(this);
		}

		return battery_health_to_from_SensorsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.Service_API} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Service_APIItemProvider service_APIItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.Service_API}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createService_APIAdapter() {
		if (service_APIItemProvider == null) {
			service_APIItemProvider = new Service_APIItemProvider(this);
		}

		return service_APIItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.Electric_Vehicule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Electric_VehiculeItemProvider electric_VehiculeItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.Electric_Vehicule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElectric_VehiculeAdapter() {
		if (electric_VehiculeItemProvider == null) {
			electric_VehiculeItemProvider = new Electric_VehiculeItemProvider(this);
		}

		return electric_VehiculeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.Mobile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobileItemProvider mobileItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.Mobile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobileAdapter() {
		if (mobileItemProvider == null) {
			mobileItemProvider = new MobileItemProvider(this);
		}

		return mobileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.Clearing_House} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Clearing_HouseItemProvider clearing_HouseItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.Clearing_House}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClearing_HouseAdapter() {
		if (clearing_HouseItemProvider == null) {
			clearing_HouseItemProvider = new Clearing_HouseItemProvider(this);
		}

		return clearing_HouseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.eMSP} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected eMSPItemProvider eMSPItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.eMSP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createeMSPAdapter() {
		if (eMSPItemProvider == null) {
			eMSPItemProvider = new eMSPItemProvider(this);
		}

		return eMSPItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.APK} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APKItemProvider apkItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.APK}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAPKAdapter() {
		if (apkItemProvider == null) {
			apkItemProvider = new APKItemProvider(this);
		}

		return apkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.App_to_from_Battery_health} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected App_to_from_Battery_healthItemProvider app_to_from_Battery_healthItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.App_to_from_Battery_health}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApp_to_from_Battery_healthAdapter() {
		if (app_to_from_Battery_healthItemProvider == null) {
			app_to_from_Battery_healthItemProvider = new App_to_from_Battery_healthItemProvider(this);
		}

		return app_to_from_Battery_healthItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.CS_manag_sys_to_from_CS_Controller} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CS_manag_sys_to_from_CS_ControllerItemProvider cS_manag_sys_to_from_CS_ControllerItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.CS_manag_sys_to_from_CS_Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCS_manag_sys_to_from_CS_ControllerAdapter() {
		if (cS_manag_sys_to_from_CS_ControllerItemProvider == null) {
			cS_manag_sys_to_from_CS_ControllerItemProvider = new CS_manag_sys_to_from_CS_ControllerItemProvider(this);
		}

		return cS_manag_sys_to_from_CS_ControllerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.Web_Application} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Web_ApplicationItemProvider web_ApplicationItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.Web_Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWeb_ApplicationAdapter() {
		if (web_ApplicationItemProvider == null) {
			web_ApplicationItemProvider = new Web_ApplicationItemProvider(this);
		}

		return web_ApplicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.Administrator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministratorItemProvider administratorItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.Administrator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdministratorAdapter() {
		if (administratorItemProvider == null) {
			administratorItemProvider = new AdministratorItemProvider(this);
		}

		return administratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.Communication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationItemProvider communicationItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.Communication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommunicationAdapter() {
		if (communicationItemProvider == null) {
			communicationItemProvider = new CommunicationItemProvider(this);
		}

		return communicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.Domain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainItemProvider domainItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.Domain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainAdapter() {
		if (domainItemProvider == null) {
			domainItemProvider = new DomainItemProvider(this);
		}

		return domainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.SecurityControl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityControlItemProvider securityControlItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.SecurityControl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecurityControlAdapter() {
		if (securityControlItemProvider == null) {
			securityControlItemProvider = new SecurityControlItemProvider(this);
		}

		return securityControlItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.Threat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatItemProvider threatItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.Threat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThreatAdapter() {
		if (threatItemProvider == null) {
			threatItemProvider = new ThreatItemProvider(this);
		}

		return threatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.Asset} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetItemProvider assetItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssetAdapter() {
		if (assetItemProvider == null) {
			assetItemProvider = new AssetItemProvider(this);
		}

		return assetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.Vulnerability} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VulnerabilityItemProvider vulnerabilityItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.Vulnerability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVulnerabilityAdapter() {
		if (vulnerabilityItemProvider == null) {
			vulnerabilityItemProvider = new VulnerabilityItemProvider(this);
		}

		return vulnerabilityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link emobility.Risk} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskItemProvider riskItemProvider;

	/**
	 * This creates an adapter for a {@link emobility.Risk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRiskAdapter() {
		if (riskItemProvider == null) {
			riskItemProvider = new RiskItemProvider(this);
		}

		return riskItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (cS_operator_sys_to_from_CS_manag_sysItemProvider != null) cS_operator_sys_to_from_CS_manag_sysItemProvider.dispose();
		if (app_to_from_Route_PlanningItemProvider != null) app_to_from_Route_PlanningItemProvider.dispose();
		if (csoItemProvider != null) csoItemProvider.dispose();
		if (cS_ControllerItemProvider != null) cS_ControllerItemProvider.dispose();
		if (csmsItemProvider != null) csmsItemProvider.dispose();
		if (eV_UserItemProvider != null) eV_UserItemProvider.dispose();
		if (eMobilityArchitectureItemProvider != null) eMobilityArchitectureItemProvider.dispose();
		if (dsoItemProvider != null) dsoItemProvider.dispose();
		if (serverItemProvider != null) serverItemProvider.dispose();
		if (evseItemProvider != null) evseItemProvider.dispose();
		if (energy_SupplierItemProvider != null) energy_SupplierItemProvider.dispose();
		if (laptopItemProvider != null) laptopItemProvider.dispose();
		if (app_to_from_CS_operator_systemItemProvider != null) app_to_from_CS_operator_systemItemProvider.dispose();
		if (browserItemProvider != null) browserItemProvider.dispose();
		if (app_to_Energy_informationItemProvider != null) app_to_Energy_informationItemProvider.dispose();
		if (battery_health_to_from_SensorsItemProvider != null) battery_health_to_from_SensorsItemProvider.dispose();
		if (service_APIItemProvider != null) service_APIItemProvider.dispose();
		if (electric_VehiculeItemProvider != null) electric_VehiculeItemProvider.dispose();
		if (mobileItemProvider != null) mobileItemProvider.dispose();
		if (clearing_HouseItemProvider != null) clearing_HouseItemProvider.dispose();
		if (eMSPItemProvider != null) eMSPItemProvider.dispose();
		if (apkItemProvider != null) apkItemProvider.dispose();
		if (app_to_from_Battery_healthItemProvider != null) app_to_from_Battery_healthItemProvider.dispose();
		if (cS_manag_sys_to_from_CS_ControllerItemProvider != null) cS_manag_sys_to_from_CS_ControllerItemProvider.dispose();
		if (web_ApplicationItemProvider != null) web_ApplicationItemProvider.dispose();
		if (administratorItemProvider != null) administratorItemProvider.dispose();
		if (communicationItemProvider != null) communicationItemProvider.dispose();
		if (domainItemProvider != null) domainItemProvider.dispose();
		if (securityControlItemProvider != null) securityControlItemProvider.dispose();
		if (threatItemProvider != null) threatItemProvider.dispose();
		if (assetItemProvider != null) assetItemProvider.dispose();
		if (vulnerabilityItemProvider != null) vulnerabilityItemProvider.dispose();
		if (riskItemProvider != null) riskItemProvider.dispose();
	}

}
