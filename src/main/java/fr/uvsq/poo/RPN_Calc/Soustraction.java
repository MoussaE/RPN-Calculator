package fr.uvsq.poo.RPN_Calc;

import java.util.Stack;

/**
 * @author EL HABAR Moussa, SERHAN Wissam
 * Mars 2021
 */

public class Soustraction extends Command 
 {

    int gauche;
    int droit;
    Stack<Integer> ptr = new Stack<Integer>();

    public Soustraction(Stack<Integer> current ) 
    {
        ptr = current; 
        
    }

    @Override
    public void apply() {
       droit = ptr.pop();
       gauche = ptr.pop();
       ptr.push( gauche - droit);
    }

    @Override
    public void undo() {
       ptr.pop();
       ptr.push(gauche);
       ptr.push(droit);
    }

   

}
