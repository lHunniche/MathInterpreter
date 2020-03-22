package dk.klevang.ui.hover;

import com.google.inject.Inject;
import dk.klevang.generator.MathInterpreterGenerator;
import dk.klevang.mathInterpreter.Exp;
import dk.klevang.mathInterpreter.MathExp;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class MyHoverClass extends DefaultEObjectHoverProvider {
  @Inject
  @Extension
  private MathInterpreterGenerator _mathInterpreterGenerator;
  
  @Override
  public String getHoverInfoAsHtml(final EObject o) {
    String _switchResult = null;
    boolean _matched = false;
    if (o instanceof Exp) {
      _matched=true;
      _switchResult = this.handleExp(((Exp)o));
    }
    if (!_matched) {
      return super.getHoverInfoAsHtml(o);
    }
    return _switchResult;
  }
  
  public String handleExp(final Exp exp) {
    String _expVar = exp.getExpVar();
    boolean _tripleEquals = (_expVar == null);
    if (_tripleEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<p>");
      _builder.newLine();
      _builder.append("type: <b>int</b> <br>");
      _builder.newLine();
      _builder.append("value: <b>");
      int _computeExp = this._mathInterpreterGenerator.computeExp(exp, null);
      _builder.append(_computeExp);
      _builder.append("</b");
      _builder.newLineIfNotEmpty();
      _builder.append("</p>");
      _builder.newLine();
      return _builder.toString();
    } else {
      try {
        EObject _eContainer = exp.eContainer();
        MathExp math = ((MathExp) _eContainer);
        while ((math.eContainer() != null)) {
          EObject _eContainer_1 = math.eContainer();
          math = ((MathExp) _eContainer_1);
        }
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<p>");
        _builder_1.newLine();
        _builder_1.append("type: <b>int</b> <br>");
        _builder_1.newLine();
        _builder_1.append("value: <b>");
        int _compute = this._mathInterpreterGenerator.compute(math);
        _builder_1.append(_compute);
        _builder_1.append("</b");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("</p>");
        _builder_1.newLine();
        return _builder_1.toString();
      } catch (final Throwable _t) {
        if (_t instanceof ClassCastException) {
          StringConcatenation _builder_2 = new StringConcatenation();
          return _builder_2.toString();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
  }
}
