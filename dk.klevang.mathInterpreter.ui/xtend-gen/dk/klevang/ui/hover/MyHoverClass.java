package dk.klevang.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

@SuppressWarnings("all")
public class MyHoverClass extends DefaultEObjectHoverProvider {
  @Override
  public String getFirstLine(final EObject o) {
    return "Hej!";
  }
}
