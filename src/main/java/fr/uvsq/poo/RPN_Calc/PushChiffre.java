package fr.uvsq.poo.RPN_Calc;

import java.util.Stack;

/**
 * @author EL HABAR Moussa, SERHAN Wissam
 * Mars 2021
 */

public class PushChiffre extends Command 
{

    int val ;
    Stack<Integer> ptr = new Stack<Integer>();

    public PushChiffre(Stack<Integer> current ) 
    {
        ptr = current; 
        
    }

    @Override
    public void apply(){}

    @Override
    public void undo() 
    {
        ptr.pop();
    }


    
}
