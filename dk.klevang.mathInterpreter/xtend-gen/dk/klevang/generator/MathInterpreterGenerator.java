/**
 * generated by Xtext 2.20.0
 */
package dk.klevang.generator;

import com.google.common.collect.Iterators;
import dk.klevang.mathInterpreter.Div;
import dk.klevang.mathInterpreter.Exp;
import dk.klevang.mathInterpreter.MathExp;
import dk.klevang.mathInterpreter.Minus;
import dk.klevang.mathInterpreter.Mult;
import dk.klevang.mathInterpreter.Plus;
import java.util.HashMap;
import javax.swing.JOptionPane;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MathInterpreterGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final MathExp math = Iterators.<MathExp>filter(resource.getAllContents(), MathExp.class).next();
    final int result = this.compute(math);
    JOptionPane.showMessageDialog(null, ("result = " + Integer.valueOf(result)), "Math Language", JOptionPane.INFORMATION_MESSAGE);
  }
  
  public int compute(final MathExp math) {
    int _xblockexpression = (int) 0;
    {
      final HashMap<String, Integer> var_list = CollectionLiterals.<String, Integer>newHashMap();
      int _xifexpression = (int) 0;
      Exp _exp = math.getExp();
      boolean _tripleEquals = (_exp == null);
      if (_tripleEquals) {
        int _xblockexpression_1 = (int) 0;
        {
          final int left = this.compute(math.getLeft());
          var_list.put(math.getLeft().getMathVar().getExpVar(), Integer.valueOf(left));
          String _expVar = math.getLeft().getMathVar().getExpVar();
          String _plus = (_expVar + " = ");
          String _plus_1 = (_plus + Integer.valueOf(left));
          InputOutput.<String>println(_plus_1);
          _xblockexpression_1 = this.computeExp(math.getRight(), var_list);
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = this.computeExp(math.getExp(), null);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public int computeExp(final Exp exp, final HashMap<String, Integer> vars) {
    int _xblockexpression = (int) 0;
    {
      Exp _exp = exp.getExp();
      boolean _tripleNotEquals = (_exp != null);
      if (_tripleNotEquals) {
        return this.computeExp(exp.getExp(), vars);
      } else {
        MathExp _mathExp = exp.getMathExp();
        boolean _tripleNotEquals_1 = (_mathExp != null);
        if (_tripleNotEquals_1) {
          return this.compute(exp.getMathExp());
        }
      }
      final int right = this.computeBranch(exp.getRight(), vars);
      int _switchResult = (int) 0;
      boolean _matched = false;
      if (exp instanceof Plus) {
        _matched=true;
        int _computeExp = this.computeExp(((Plus)exp).getLeft(), vars);
        _switchResult = (_computeExp + right);
      }
      if (!_matched) {
        if (exp instanceof Minus) {
          _matched=true;
          int _computeExp = this.computeExp(((Minus)exp).getLeft(), vars);
          _switchResult = (_computeExp - right);
        }
      }
      if (!_matched) {
        if (exp instanceof Mult) {
          _matched=true;
          int _computeExp = this.computeExp(((Mult)exp).getLeft(), vars);
          _switchResult = (_computeExp * right);
        }
      }
      if (!_matched) {
        if (exp instanceof Div) {
          _matched=true;
          int _computeExp = this.computeExp(((Div)exp).getLeft(), vars);
          _switchResult = (_computeExp / right);
        }
      }
      if (!_matched) {
        _switchResult = this.computeBranch(exp, vars);
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public int computeBranch(final Exp exp, final HashMap<String, Integer> vars) {
    if ((exp != null)) {
      boolean _matched = false;
      if (exp instanceof Plus) {
        _matched=true;
        return this.computeExp(exp, vars);
      }
      if (!_matched) {
        if (exp instanceof Minus) {
          _matched=true;
          return this.computeExp(exp, vars);
        }
      }
      if (!_matched) {
        if (exp instanceof Mult) {
          _matched=true;
          return this.computeExp(exp, vars);
        }
      }
      if (!_matched) {
        if (exp instanceof Div) {
          _matched=true;
          return this.computeExp(exp, vars);
        }
      }
      return this.handleVariable(exp, vars);
    }
    return (-1000);
  }
  
  public int handleVariable(final Exp exp, final HashMap<String, Integer> vars) {
    String _expVar = exp.getExpVar();
    boolean _tripleEquals = (_expVar == null);
    if (_tripleEquals) {
      return exp.getValue();
    } else {
      final Integer variable = vars.get(exp.getExpVar());
      return (variable).intValue();
    }
  }
  
  public CharSequence display(final MathExp math) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Math[");
    CharSequence _displayExp2 = this.displayExp2(math.getExp());
    _builder.append(_displayExp2);
    _builder.append("]");
    return _builder;
  }
  
  public CharSequence displayFactor(final Exp primary) {
    return "?";
  }
  
  public int displayPrim(final Exp parent, final Exp child) {
    int _xifexpression = (int) 0;
    if ((child == null)) {
      _xifexpression = parent.getValue();
    } else {
      _xifexpression = child.getValue();
    }
    return _xifexpression;
  }
  
  public String displayOp(final Exp exp) {
    String _switchResult = null;
    boolean _matched = false;
    if (exp instanceof Plus) {
      _matched=true;
      _switchResult = "+";
    }
    if (!_matched) {
      if (exp instanceof Minus) {
        _matched=true;
        _switchResult = "-";
      }
    }
    if (!_matched) {
      if (exp instanceof Mult) {
        _matched=true;
        _switchResult = "*";
      }
    }
    if (!_matched) {
      if (exp instanceof Div) {
        _matched=true;
        _switchResult = "/";
      }
    }
    return _switchResult;
  }
  
  public CharSequence displayExp2(final Exp exp) {
    Exp _exp = exp.getExp();
    boolean _tripleEquals = (_exp == null);
    if (_tripleEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Exp[");
      Exp _left = exp.getLeft();
      CharSequence _displayExp2 = null;
      if (_left!=null) {
        _displayExp2=this.displayExp2(_left);
      }
      _builder.append(_displayExp2);
      _builder.append(",");
      String _displayOp = null;
      if (exp!=null) {
        _displayOp=this.displayOp(exp);
      }
      _builder.append(_displayOp);
      _builder.append(",");
      int _displayPrim = 0;
      if (exp!=null) {
        _displayPrim=this.displayPrim(exp, exp.getRight());
      }
      _builder.append(_displayPrim);
      _builder.append("]");
      return _builder;
    } else {
      return this.displayExp2(exp.getExp());
    }
  }
}
