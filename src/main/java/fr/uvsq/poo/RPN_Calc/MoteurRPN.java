package fr.uvsq.poo.RPN_Calc;

import java.util.ArrayList;
import java.util.Stack;

public class MoteurRPN extends Interpreter 
{
    private static Stack<Integer> current = new Stack<Integer>();
    private ArrayList  <String>str;  

    MoteurRPN() 
    {
        super();
        str = new ArrayList<String>(); str.add("autre"); str.add("undo"); str.add("exit");

        super.Expression.put("+", new Addition(current));
        super.Expression.put("-", new Soustraction(current));
        super.Expression.put("*", new Multiplication(current));
        super.Expression.put("/", new Division(current)) ;
        super.Expression.put("autre", new PushChiffre(current)) ;
    }


    public void Add(Integer value) 
    {
        current.push(value);
    }

   
    // throw exception arrete le programme cest relou 
    @Override
    protected void executeCommand (String Nom) 
    {
      
         if ( current.size() < 2 && !str.contains(Nom) && Expression.containsKey(Nom)) 
         {
             System.out.println("Error: current stack doesn't contain enought args for (" + Nom + ") command.");
         }
         else
         {
             if (Expression.containsKey(Nom))
             {
                 Expression.get(Nom).apply();
                 if (Expression.get(Nom) instanceof Undo == false )
                     historique.push((Command) Expression.get(Nom).clone());
                
               
             } 
             else 
             {
                 System.out.println("Erreur  command " + Nom + " not found.");
             }
         }
    }

    public Stack<Integer> getCurrent()
    {
        return current;
    }

    public Integer peek()
    {
        return current.peek();
    }

    public void getAllCommands() 
    {  
        System.out.println("");
       
        System.out.print("Etat stack :");
        for (Integer element : current) 
        {
           System.out.print(" "+element);
        }
        System.out.println("");
        System.out.println("");

    }

    

}
