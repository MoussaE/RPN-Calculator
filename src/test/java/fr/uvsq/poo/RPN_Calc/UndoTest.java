package fr.uvsq.poo.RPN_Calc;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author EL HABAR Moussa, SERHAN Wissam
 * Mars 2021
 */

public class UndoTest {

    @Before
    public void executedBeforeEach()
    {
          MoteurRPN RP = new MoteurRPN();
            while (!RP.getCurrent().empty())
            {
                RP.getCurrent().pop() ; 
            }   
            while (!RP.getHistory().empty())
            {
                RP.getHistory().pop();
            }
    }

    @Test
    public void IsUndoWork() {
        String Nom ="undo";
   
        try {
             Interpreter I = new Interpreter();
             I.executeCommand(Nom);
        } catch (Exception e) {
            assertNotEquals(e.getMessage(), "Erreur no command " + Nom + " found.");
        }
    }


    @Test
    public void IsManyUndoWork() {
        String Nom = "undo";
        Stack<Integer> test = new Stack<Integer>();
        test.push(5);
        try {
            MoteurRPN RP = new MoteurRPN();
            RP.Add(5);
            RP.executeCommand("autre");
            RP.Add(3);
            RP.executeCommand("autre");
            RP.executeCommand("+");
            RP.executeCommand(Nom);
            RP.executeCommand(Nom);
            assertEquals(test, (RP.getCurrent()));
        } catch (Exception e) {
            assertNotEquals(e.getMessage(), "Erreur no command " + Nom + " found.");
        }
    }


}
