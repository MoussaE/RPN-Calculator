package fr.uvsq.poo.RPN_Calc;

import java.util.Stack;

/**
 * @author EL HABAR Moussa, SERHAN Wissam
 * Mars 2021
 */

public class Undo  extends Command 
{
    Stack <Command> history ; 
    
    public Undo (Stack<Command> pile)
    {
        history = pile ;      
    }
     
    @Override
    public void apply() 
    {

        if (history.empty() == false )
        {

            history.pop().undo();

        }
        else {System.out.println("vous ne pouvez plus revenir en arriere !");}
    }

    @Override
    public void undo()
    {

    }

    public Stack <Command> get_Undo()
    {
        return history; 
    }

    
}
