package dk.klevang.ui.hover

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider

class MyHoverClass extends DefaultEObjectHoverProvider {
	
	override getFirstLine(EObject o)
	{
		return "Hej med dig!"
	}
	
}