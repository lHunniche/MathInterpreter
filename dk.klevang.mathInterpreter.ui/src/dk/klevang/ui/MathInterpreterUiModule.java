/*
 * generated by Xtext 2.20.0
 */
package dk.klevang.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;

import dk.klevang.ui.hover.MyHoverClass;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
public class MathInterpreterUiModule extends AbstractMathInterpreterUiModule {

	public MathInterpreterUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
		return MyHoverClass.class;
	}
}