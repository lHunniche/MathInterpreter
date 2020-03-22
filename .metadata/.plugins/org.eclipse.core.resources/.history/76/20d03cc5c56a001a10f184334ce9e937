package dk.klevang.ui

import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider
import org.eclipse.ui.plugin.AbstractUIPlugin
import dk.klevang.ui.hover.MyHoverClass

class MyHoverUIModule extends AbstractMathInterpreterUiModule {
	
	new(AbstractUIPlugin plugin) {
		super(plugin)
		bindIEObjectHoverProvider()
	}
	
	def Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider()
	{
		MyHoverClass
	}
	
}