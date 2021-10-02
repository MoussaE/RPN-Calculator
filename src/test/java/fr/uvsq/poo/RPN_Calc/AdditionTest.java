package fr.uvsq.poo.RPN_Calc;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

public class AdditionTest {

    @Before
    public void executedBeforeEach() {
        MoteurRPN RP = new MoteurRPN();
        while (!RP.getCurrent().empty()) {
            RP.getCurrent().pop();
        }
        while (!RP.getHistory().empty()) {
            RP.getHistory().pop();
        }
    }

    @Test
    public void isAdditionWork() {
        MoteurRPN RPN_add = new MoteurRPN();


        RPN_add .Add(10);
        RPN_add.executeCommand("autre");
        RPN_add .Add(11);
        RPN_add.executeCommand("autre");
        RPN_add .executeCommand("+");
        assertTrue(21 == RPN_add.peek());
    }


    @Test
    public void isManyAdditionWork() {
        MoteurRPN RPN_add2 = new MoteurRPN();

        RPN_add2 .Add(10);
        RPN_add2.executeCommand("autre");
        RPN_add2 .Add(11);
        RPN_add2.executeCommand("autre");
       
        RPN_add2 .executeCommand("+");

        assertTrue(21 == RPN_add2.peek());

        RPN_add2 .Add(9);
        RPN_add2.executeCommand("autre");
        RPN_add2 .executeCommand("+");
        assertTrue(30 == RPN_add2 .peek());
    }
}
