package fr.uvsq.poo;

import fr.uvsq.poo.RPN_Calc.SaisieRPN;

/**
 * @author EL HABAR Moussa, SERHAN Wissam
 * Mars 2021
 */

public class CalculatriceRPN 
{

    public static void main(String args[]) throws Exception 
    {
        System.out.println("Exemple de saisie 1 1 +   ou   une donnee a chaque fois");
        
        SaisieRPN  saisir = new SaisieRPN();
        while (true) 
        {
            saisir.saisie();
        }

    }
}
