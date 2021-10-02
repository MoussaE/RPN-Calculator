package fr.uvsq.poo.RPN_Calc;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MoteurRPNTest {

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
    public void tryToCreateMoteurRPN() {
        try
        {
            new MoteurRPN();
        }
        catch (Exception e) {
            assert(e.getMessage().isEmpty());
        }
    }

    @Test
    public void tryNormalExecution() {
        MoteurRPN M = new MoteurRPN();

        M .Add(10);
        M.executeCommand("autre");
        M .Add( 20);
        M.executeCommand("autre");
        M .executeCommand("+");
        M.Add(3);
        M.executeCommand("autre");
        M .executeCommand("-");
        M .Add(2);
        M.executeCommand("autre");
        M .executeCommand("*");
        M .Add(6);
        M.executeCommand("autre");
        M .executeCommand("+");
        M .Add(30);
        M.executeCommand("autre");
        M .executeCommand("/");
        M.getAllCommands();
        assertTrue( M .peek().equals(2));
    }


    @Test
    public void tryAnormalExecution() 
    {
        MoteurRPN M = new MoteurRPN();
        M. executeCommand( "+");
        M. executeCommand("*");
        assertTrue(M.getCurrent().isEmpty());
        M. Add(36);
        M.executeCommand("autre");
        M. executeCommand("-");
        assertTrue(M.peek() == 36 );
    }

    @Test
    public void tryDivisionByZero() {
        MoteurRPN M = new MoteurRPN();
        M. Add(25);
        M.executeCommand("autre");
        M .Add(0);
        M.executeCommand("autre");
        M .executeCommand("/");
    }
}
