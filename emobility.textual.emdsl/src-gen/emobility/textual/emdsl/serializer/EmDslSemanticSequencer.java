/*
 * generated by Xtext 2.36.0
 */
package emobility.textual.emdsl.serializer;

import com.google.inject.Inject;
import emobility.APK;
import emobility.Administrator;
import emobility.App_to_Energy_information;
import emobility.App_to_from_Battery_health;
import emobility.App_to_from_CS_operator_system;
import emobility.App_to_from_Route_Planning;
import emobility.Asset;
import emobility.Battery_health_to_from_Sensors;
import emobility.Browser;
import emobility.CSMS;
import emobility.CSO;
import emobility.CS_Controller;
import emobility.CS_manag_sys_to_from_CS_Controller;
import emobility.CS_operator_sys_to_from_CS_manag_sys;
import emobility.Clearing_House;
import emobility.Communication;
import emobility.DSO;
import emobility.Domain;
import emobility.EVSE;
import emobility.EV_User;
import emobility.Electric_Vehicule;
import emobility.EmobilityPackage;
import emobility.Energy_Supplier;
import emobility.Laptop;
import emobility.Mobile;
import emobility.Risk;
import emobility.SecurityControl;
import emobility.Server;
import emobility.Service_API;
import emobility.Threat;
import emobility.Vulnerability;
import emobility.Web_Application;
import emobility.eMSP;
import emobility.textual.emdsl.services.EmDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class EmDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EmDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EmobilityPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EmobilityPackage.APK:
				sequence_APK(context, (APK) semanticObject); 
				return; 
			case EmobilityPackage.ADMINISTRATOR:
				sequence_Administrator(context, (Administrator) semanticObject); 
				return; 
			case EmobilityPackage.APP_TO_ENERGY_INFORMATION:
				sequence_App_to_Energy_information(context, (App_to_Energy_information) semanticObject); 
				return; 
			case EmobilityPackage.APP_TO_FROM_BATTERY_HEALTH:
				sequence_App_to_from_Battery_health(context, (App_to_from_Battery_health) semanticObject); 
				return; 
			case EmobilityPackage.APP_TO_FROM_CS_OPERATOR_SYSTEM:
				sequence_App_to_from_CS_operator_system(context, (App_to_from_CS_operator_system) semanticObject); 
				return; 
			case EmobilityPackage.APP_TO_FROM_ROUTE_PLANNING:
				sequence_App_to_from_Route_Planning(context, (App_to_from_Route_Planning) semanticObject); 
				return; 
			case EmobilityPackage.ASSET:
				sequence_Asset_Impl(context, (Asset) semanticObject); 
				return; 
			case EmobilityPackage.BATTERY_HEALTH_TO_FROM_SENSORS:
				sequence_Battery_health_to_from_Sensors(context, (Battery_health_to_from_Sensors) semanticObject); 
				return; 
			case EmobilityPackage.BROWSER:
				sequence_Browser(context, (Browser) semanticObject); 
				return; 
			case EmobilityPackage.CSMS:
				sequence_CSMS(context, (CSMS) semanticObject); 
				return; 
			case EmobilityPackage.CSO:
				sequence_CSO(context, (CSO) semanticObject); 
				return; 
			case EmobilityPackage.CS_CONTROLLER:
				sequence_CS_Controller(context, (CS_Controller) semanticObject); 
				return; 
			case EmobilityPackage.CS_MANAG_SYS_TO_FROM_CS_CONTROLLER:
				sequence_CS_manag_sys_to_from_CS_Controller(context, (CS_manag_sys_to_from_CS_Controller) semanticObject); 
				return; 
			case EmobilityPackage.CS_OPERATOR_SYS_TO_FROM_CS_MANAG_SYS:
				sequence_CS_operator_sys_to_from_CS_manag_sys(context, (CS_operator_sys_to_from_CS_manag_sys) semanticObject); 
				return; 
			case EmobilityPackage.CLEARING_HOUSE:
				sequence_Clearing_House(context, (Clearing_House) semanticObject); 
				return; 
			case EmobilityPackage.COMMUNICATION:
				sequence_Communication(context, (Communication) semanticObject); 
				return; 
			case EmobilityPackage.DSO:
				sequence_DSO(context, (DSO) semanticObject); 
				return; 
			case EmobilityPackage.DOMAIN:
				sequence_Domain(context, (Domain) semanticObject); 
				return; 
			case EmobilityPackage.EVSE:
				sequence_EVSE(context, (EVSE) semanticObject); 
				return; 
			case EmobilityPackage.EV_USER:
				sequence_EV_User(context, (EV_User) semanticObject); 
				return; 
			case EmobilityPackage.ELECTRIC_VEHICULE:
				sequence_Electric_Vehicule(context, (Electric_Vehicule) semanticObject); 
				return; 
			case EmobilityPackage.ENERGY_SUPPLIER:
				sequence_Energy_Supplier(context, (Energy_Supplier) semanticObject); 
				return; 
			case EmobilityPackage.LAPTOP:
				sequence_Laptop(context, (Laptop) semanticObject); 
				return; 
			case EmobilityPackage.MOBILE:
				sequence_Mobile(context, (Mobile) semanticObject); 
				return; 
			case EmobilityPackage.RISK:
				sequence_Risk(context, (Risk) semanticObject); 
				return; 
			case EmobilityPackage.SECURITY_CONTROL:
				sequence_SecurityControl(context, (SecurityControl) semanticObject); 
				return; 
			case EmobilityPackage.SERVER:
				sequence_Server(context, (Server) semanticObject); 
				return; 
			case EmobilityPackage.SERVICE_API:
				sequence_Service_API(context, (Service_API) semanticObject); 
				return; 
			case EmobilityPackage.THREAT:
				sequence_Threat(context, (Threat) semanticObject); 
				return; 
			case EmobilityPackage.VULNERABILITY:
				sequence_Vulnerability(context, (Vulnerability) semanticObject); 
				return; 
			case EmobilityPackage.WEB_APPLICATION:
				sequence_Web_Application(context, (Web_Application) semanticObject); 
				return; 
			case EmobilityPackage.EMSP:
				sequence_eMSP(context, (eMSP) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns APK
	 *     Asset returns APK
	 *     APK returns APK
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_APK(ISerializationContext context, APK semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns Administrator
	 *     Asset returns Administrator
	 *     Administrator returns Administrator
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         csms=[CSMS|EString]? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Administrator(ISerializationContext context, Administrator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns App_to_Energy_information
	 *     EMobility_Data returns App_to_Energy_information
	 *     Asset returns App_to_Energy_information
	 *     App_to_Energy_information returns App_to_Energy_information
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         data_type=App_to_from_Energy_information_Cat? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_App_to_Energy_information(ISerializationContext context, App_to_Energy_information semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns App_to_from_Battery_health
	 *     EMobility_Data returns App_to_from_Battery_health
	 *     Asset returns App_to_from_Battery_health
	 *     App_to_from_Battery_health returns App_to_from_Battery_health
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         data_type=App_to_Battery_health_Cat? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_App_to_from_Battery_health(ISerializationContext context, App_to_from_Battery_health semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns App_to_from_CS_operator_system
	 *     EMobility_Data returns App_to_from_CS_operator_system
	 *     Asset returns App_to_from_CS_operator_system
	 *     App_to_from_CS_operator_system returns App_to_from_CS_operator_system
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         data_type=App_to_from_CS_operator_system_Cat? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_App_to_from_CS_operator_system(ISerializationContext context, App_to_from_CS_operator_system semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns App_to_from_Route_Planning
	 *     EMobility_Data returns App_to_from_Route_Planning
	 *     Asset returns App_to_from_Route_Planning
	 *     App_to_from_Route_Planning returns App_to_from_Route_Planning
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         data_type=App_to_from_from_Route_Planning_Cat? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_App_to_from_Route_Planning(ISerializationContext context, App_to_from_Route_Planning semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Asset returns Asset
	 *     Asset_Impl returns Asset
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Asset_Impl(ISerializationContext context, Asset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns Battery_health_to_from_Sensors
	 *     EMobility_Data returns Battery_health_to_from_Sensors
	 *     Asset returns Battery_health_to_from_Sensors
	 *     Battery_health_to_from_Sensors returns Battery_health_to_from_Sensors
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         data_type=Battery_health_to_from_Sensors_Cat? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Battery_health_to_from_Sensors(ISerializationContext context, Battery_health_to_from_Sensors semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns Browser
	 *     Asset returns Browser
	 *     Browser returns Browser
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         description=String0? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Browser(ISerializationContext context, Browser semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns CSMS
	 *     Asset returns CSMS
	 *     CSMS returns CSMS
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (cs_controller+=[CS_Controller|EString] cs_controller+=[CS_Controller|EString]*)? 
	 *         server=[Server|EString]? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_CSMS(ISerializationContext context, CSMS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns CSO
	 *     Asset returns CSO
	 *     CSO returns CSO
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         emsp=[eMSP|EString]? 
	 *         clearing_house=[Clearing_House|EString]? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_CSO(ISerializationContext context, CSO semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns CS_Controller
	 *     Asset returns CS_Controller
	 *     CS_Controller returns CS_Controller
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (evse+=[EVSE|EString] evse+=[EVSE|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_CS_Controller(ISerializationContext context, CS_Controller semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns CS_manag_sys_to_from_CS_Controller
	 *     EMobility_Data returns CS_manag_sys_to_from_CS_Controller
	 *     Asset returns CS_manag_sys_to_from_CS_Controller
	 *     CS_manag_sys_to_from_CS_Controller returns CS_manag_sys_to_from_CS_Controller
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         data_type=CS_manag_sys_to_from_CS_Controller_Cat? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_CS_manag_sys_to_from_CS_Controller(ISerializationContext context, CS_manag_sys_to_from_CS_Controller semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns CS_operator_sys_to_from_CS_manag_sys
	 *     EMobility_Data returns CS_operator_sys_to_from_CS_manag_sys
	 *     Asset returns CS_operator_sys_to_from_CS_manag_sys
	 *     CS_operator_sys_to_from_CS_manag_sys returns CS_operator_sys_to_from_CS_manag_sys
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         data_type=CS_operator_sys_to_from_CS_manag_sys_Cat? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_CS_operator_sys_to_from_CS_manag_sys(ISerializationContext context, CS_operator_sys_to_from_CS_manag_sys semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns Clearing_House
	 *     Asset returns Clearing_House
	 *     Clearing_House returns Clearing_House
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         emsp=[eMSP|EString]? 
	 *         cso=[CSO|EString]? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Clearing_House(ISerializationContext context, Clearing_House semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns Communication
	 *     Asset returns Communication
	 *     Communication returns Communication
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         info_protocol=Information_Protocol? 
	 *         comm_protocol=Communication_Protocol? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         source=[EMobilityElement|EString]? 
	 *         destination=[EMobilityElement|EString]? 
	 *         (emobility_data+=[EMobility_Data|EString] emobility_data+=[EMobility_Data|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Communication(ISerializationContext context, Communication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns DSO
	 *     Asset returns DSO
	 *     DSO returns DSO
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_DSO(ISerializationContext context, DSO semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Domain returns Domain
	 *     EMobilityElement returns Domain
	 *     Asset returns Domain
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         description=EString? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)? 
	 *         (emobilityelement+=EMobilityElement emobilityelement+=EMobilityElement*)? 
	 *         (communication+=Communication communication+=Communication*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Domain(ISerializationContext context, Domain semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns EVSE
	 *     Asset returns EVSE
	 *     EVSE returns EVSE
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         description=EString? 
	 *         isExposed=Boolean? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         electric_vehicule=[Electric_Vehicule|EString]? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_EVSE(ISerializationContext context, EVSE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns EV_User
	 *     Asset returns EV_User
	 *     EV_User returns EV_User
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         description=String0? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         laptop=[Laptop|EString]? 
	 *         mobile=[Mobile|EString]? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_EV_User(ISerializationContext context, EV_User semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns Electric_Vehicule
	 *     Asset returns Electric_Vehicule
	 *     Electric_Vehicule returns Electric_Vehicule
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         description=String0? 
	 *         vendor=Vendor_Type? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         evse=[EVSE|EString]? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Electric_Vehicule(ISerializationContext context, Electric_Vehicule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns Energy_Supplier
	 *     Asset returns Energy_Supplier
	 *     Energy_Supplier returns Energy_Supplier
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Energy_Supplier(ISerializationContext context, Energy_Supplier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns Laptop
	 *     Asset returns Laptop
	 *     Laptop returns Laptop
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         description=String0? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)? 
	 *         (browser+=Browser browser+=Browser*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Laptop(ISerializationContext context, Laptop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns Mobile
	 *     Asset returns Mobile
	 *     Mobile returns Mobile
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         description=String0? 
	 *         OS=mOS_type? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)? 
	 *         (apk+=APK apk+=APK*)? 
	 *         (browser+=Browser browser+=Browser*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Mobile(ISerializationContext context, Mobile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns Risk
	 *     Asset returns Risk
	 *     Risk returns Risk
	 *
	 * Constraint:
	 *     (
	 *         name=EString? 
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         description=EString? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)? 
	 *         (threat+=Threat threat+=Threat*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Risk(ISerializationContext context, Risk semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns SecurityControl
	 *     Asset returns SecurityControl
	 *     SecurityControl returns SecurityControl
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         type=SecurityControlType? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_SecurityControl(ISerializationContext context, SecurityControl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns Server
	 *     Asset returns Server
	 *     Server returns Server
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         os_type=OS_Type? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Server(ISerializationContext context, Server semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns Service_API
	 *     Asset returns Service_API
	 *     Service_API returns Service_API
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Service_API(ISerializationContext context, Service_API semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns Threat
	 *     Asset returns Threat
	 *     Threat returns Threat
	 *
	 * Constraint:
	 *     (
	 *         name=EString? 
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         description=String0? 
	 *         id=String0? 
	 *         likelihood=Likelihood_Level? 
	 *         risk_level=Likelihood_Level? 
	 *         threat_category=Threat_Category? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         asset=[Asset|EString]? 
	 *         (exploits+=[Vulnerability|EString] exploits+=[Vulnerability|EString]*)? 
	 *         (implemented_security_controls+=[SecurityControl|EString] implemented_security_controls+=[SecurityControl|EString]*)? 
	 *         (mitigations+=[SecurityControl|EString] mitigations+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Threat(ISerializationContext context, Threat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Vulnerability returns Vulnerability
	 *
	 * Constraint:
	 *     (id=EString? description=EString?)
	 * </pre>
	 */
	protected void sequence_Vulnerability(ISerializationContext context, Vulnerability semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns Web_Application
	 *     Asset returns Web_Application
	 *     Web_Application returns Web_Application
	 *
	 * Constraint:
	 *     (
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         name=String0? 
	 *         description=String0? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Web_Application(ISerializationContext context, Web_Application semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EMobilityElement returns eMSP
	 *     Asset returns eMSP
	 *     eMSP returns eMSP
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         Availability=CIA_Level? 
	 *         Integrity=CIA_Level? 
	 *         Confidentiality=CIA_Level? 
	 *         description=String0? 
	 *         (securitycontrol+=[SecurityControl|EString] securitycontrol+=[SecurityControl|EString]*)? 
	 *         cso=[CSO|EString]? 
	 *         service_api=[Service_API|EString]? 
	 *         web_application=[Web_Application|EString]? 
	 *         clearing_house=[Clearing_House|EString]? 
	 *         (vulnerability+=Vulnerability vulnerability+=Vulnerability*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_eMSP(ISerializationContext context, eMSP semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
