package dk.klevang.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

@SuppressWarnings("all")
public class MyHoverContent implements IEObjectDocumentationProvider {
  @Override
  public String getDocumentation(final EObject o) {
    return "This is my content part";
  }
}
