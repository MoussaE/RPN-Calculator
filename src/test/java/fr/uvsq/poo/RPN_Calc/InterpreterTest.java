package fr.uvsq.poo.RPN_Calc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class InterpreterTest {

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
    public void isErrorPrintOnWrongEntries() {
        String Nom ="exot";
        try {
            Interpreter I = new Interpreter();
            I.executeCommand(Nom);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Erreur no command " + Nom + " found.");
        }
    }

    /*@Test
    public void isQuitWork () {
        String Nom ="exit";
        try {
            Interpreter I = new Interpreter();
            I.executeCommand(Nom);
        } catch (Exception e) {
            assertNotEquals(e.getMessage(), "Erreur no command " + Nom + " found.");
        }
    }*/


}
