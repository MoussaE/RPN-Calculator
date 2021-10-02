package fr.uvsq.poo.RPN_Calc;

/**
 * @author EL HABAR Moussa, SERHAN Wissam Mars 2021
 */

 
public class Quit  extends Command 
{


    @Override
    public void apply()
    {
       System.out.println("Fin du programme");
       System.exit(0);
    }

    @Override
    public void undo(){

    }
    
   

    

  
    
}
