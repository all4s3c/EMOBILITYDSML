/**
 * generated by Xtext 2.36.0
 */
package emobility.textual.emdsl.formatting2;

import com.google.inject.Inject;
import emobility.Communication;
import emobility.Domain;
import emobility.EMobilityElement;
import emobility.SecurityControl;
import emobility.Vulnerability;
import emobility.textual.emdsl.services.EmDslGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.XbaseGenerated;

@SuppressWarnings("all")
public class EmDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private EmDslGrammarAccess _emDslGrammarAccess;

  protected void _format(final Domain domain, @Extension final IFormattableDocument document) {
    EList<Vulnerability> _vulnerability = domain.getVulnerability();
    for (final Vulnerability vulnerability : _vulnerability) {
      document.<Vulnerability>format(vulnerability);
    }
    EList<EMobilityElement> _emobilityelement = domain.getEmobilityelement();
    for (final EMobilityElement eMobilityElement : _emobilityelement) {
      document.<EMobilityElement>format(eMobilityElement);
    }
    EList<Communication> _communication = domain.getCommunication();
    for (final Communication communication : _communication) {
      document.<Communication>format(communication);
    }
  }

  protected void _format(final SecurityControl securityControl, @Extension final IFormattableDocument document) {
    EList<Vulnerability> _vulnerability = securityControl.getVulnerability();
    for (final Vulnerability vulnerability : _vulnerability) {
      document.<Vulnerability>format(vulnerability);
    }
  }

  @XbaseGenerated
  public void format(final Object domain, final IFormattableDocument document) {
    if (domain instanceof Domain) {
      _format((Domain)domain, document);
      return;
    } else if (domain instanceof SecurityControl) {
      _format((SecurityControl)domain, document);
      return;
    } else if (domain instanceof XtextResource) {
      _format((XtextResource)domain, document);
      return;
    } else if (domain instanceof EObject) {
      _format((EObject)domain, document);
      return;
    } else if (domain == null) {
      _format((Void)null, document);
      return;
    } else if (domain != null) {
      _format(domain, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(domain, document).toString());
    }
  }
}
