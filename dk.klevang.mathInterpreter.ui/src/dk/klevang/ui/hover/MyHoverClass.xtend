//package dk.klevang.ui.hover
//
//import org.eclipse.emf.ecore.EObject
//import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
//
//class MyHoverClass extends DefaultEObjectHoverProvider {
//	
//	override getFirstLine(EObject o)
//	{
//		System.out.println("Something!")
//		return "Hej med dig!"
//	}
//	
//}



package dk.klevang.ui.hover

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import dk.klevang.mathInterpreter.Exp
import com.google.inject.Inject
import dk.klevang.generator.MathInterpreterGenerator
import dk.klevang.mathInterpreter.MathExp

class MyHoverClass extends DefaultEObjectHoverProvider {
	
	@Inject extension MathInterpreterGenerator
	override getHoverInfoAsHtml(EObject o) {
		switch o {
			Exp: handleExp(o)
			default: return super.getHoverInfoAsHtml(o)
		}
	}
	
	def handleExp(Exp exp)
	{
		if (exp.getExpVar === null)
		{	
			return '''
			<p>
			type: <b>int</b> <br>
			value: <b>�exp.computeExp(null)�</b
			</p>
			'''
		}
		else
		{
			try
			{
				var math = exp.eContainer as MathExp
				while (math.eContainer !== null)
				{
					math = math.eContainer as MathExp
				}
				return '''
				<p>
				type: <b>int</b> <br>
				value: <b>�math.compute�</b
				</p>
				'''
			}
			catch (ClassCastException exception)
			{
				return '''
				'''
			}
	
		}
		
	}
}

