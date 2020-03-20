package dk.klevang.ui;

import dk.klevang.ui.AbstractMathInterpreterUiModule;
import dk.klevang.ui.hover.MyHoverClass;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;

@SuppressWarnings("all")
public class MyHoverUIModule extends AbstractMathInterpreterUiModule {
  public MyHoverUIModule(final AbstractUIPlugin plugin) {
    super(plugin);
    this.bindIEObjectHoverProvider();
  }
  
  public Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
    return MyHoverClass.class;
  }
}
