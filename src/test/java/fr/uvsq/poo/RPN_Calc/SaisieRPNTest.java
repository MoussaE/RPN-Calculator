package fr.uvsq.poo.RPN_Calc;

import org.junit.Test;

public class SaisieRPNTest {

    @Test
    public void createScannerWork() {
        SaisieRPN Scan = new SaisieRPN();
        assert(Scan != null);
    }
}
