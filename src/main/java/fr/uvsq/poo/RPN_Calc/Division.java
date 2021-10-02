package fr.uvsq.poo.RPN_Calc;

import java.util.Stack;

/**
 * @author EL HABAR Moussa, SERHAN Wissam Mars 2021
 */

public class Division extends Command 
{

    int gauche;
    int droit;
    Stack<Integer> ptr = new Stack<Integer>();

    public Division(Stack<Integer> current ) 
    {
        ptr = current; 
        
    }



    @Override
    public void apply()
    {
        droit = ptr.pop();
        gauche = ptr.pop();
        try {
            ptr.push(gauche / droit);
        } catch (ArithmeticException e)
        {
            ptr.push(gauche );
            System.out.println("Error: It is not possible to divide by 0");
        }
    }

    @Override
    public void undo() 
    {
        ptr.pop();
        ptr.push(gauche);
        ptr.push(droit);
    }

    
}
