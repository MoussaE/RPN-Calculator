package fr.uvsq.poo.RPN_Calc;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;

public class MultiplicationTest {


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
    public void isMultiplicationWork() {
        MoteurRPN RPN_add = new MoteurRPN();


        RPN_add .Add(10);
        RPN_add.executeCommand("autre");
        RPN_add .Add(11);
        RPN_add.executeCommand("autre");
        RPN_add .executeCommand("*");
        assertTrue(110 == RPN_add.peek());
    }


    @Test
    public void isManyMultiplicationWork()
    {
        MoteurRPN RPN_add2 = new MoteurRPN();

        RPN_add2 .Add(5);
        RPN_add2.executeCommand("autre");
        RPN_add2 .Add(10);
        RPN_add2.executeCommand("autre");
        RPN_add2 .executeCommand("*");

        assertTrue(50 == RPN_add2.peek());

        RPN_add2 .Add(5);
        RPN_add2.executeCommand("autre");
        RPN_add2 .executeCommand("*");
        assertTrue(250 == RPN_add2 .peek());
    }
}
