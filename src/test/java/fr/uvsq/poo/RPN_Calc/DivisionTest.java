package fr.uvsq.poo.RPN_Calc;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;

public class DivisionTest {

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
    public void isDivisionWork() {
        MoteurRPN RPN_add = new MoteurRPN();

        RPN_add .Add(20);
        RPN_add.executeCommand("autre");
        RPN_add .Add(5);
        RPN_add.executeCommand("autre");
        RPN_add .executeCommand("/");
        assertTrue(4 == RPN_add.peek());
        
    }


    @Test
    public void isManyDivisionWork() {
        MoteurRPN RPN_add2 = new MoteurRPN();

        RPN_add2 .Add(30);
        RPN_add2.executeCommand("autre");
        RPN_add2 .Add(2);
        RPN_add2.executeCommand("autre");
        RPN_add2 .executeCommand("/");

        assertTrue(15 == RPN_add2.peek());

        RPN_add2 .Add(5);
        RPN_add2.executeCommand("autre");
        RPN_add2 .executeCommand("/");
        assertTrue(3 == RPN_add2 .peek());
    }
}
