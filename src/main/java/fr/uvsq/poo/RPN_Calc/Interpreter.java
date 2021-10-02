package fr.uvsq.poo.RPN_Calc;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author EL HABAR Moussa, SERHAN Wissam
 * Mars 2021
 */
public class Interpreter
{

   protected static Stack <Command>  historique ; 
   protected  Map<String,Command> Expression;


   public Interpreter()
   {
       historique = new Stack<Command>();
       Expression = new HashMap<String , Command> ();
       Expression.put("undo", new Undo(historique)) ;
       Expression.put ("exit", new Quit());
   }


    protected void executeCommand (String Nom) throws Exception 
    {
        if ( Expression. containsKey (Nom))
        {
            Expression.get (Nom).apply( ) ;
        }
        else 
        {
            throw new Exception("Erreur no command " + Nom + " found.");
        }
    }

    

   public Stack <Command>getHistory(){return historique ; }


  

    
}
