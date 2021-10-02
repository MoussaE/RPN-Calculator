package fr.uvsq.poo.RPN_Calc;

/**
 * @author EL HABAR Moussa, SERHAN Wissam
 * Mars 2021
 */

public abstract class  Command implements Cloneable
 {


    protected abstract  void apply();

    protected abstract  void undo();

    protected  Object clone()
    {
        Command  a = null;
        try 
        {
            a = (Command) super.clone();
        } catch (CloneNotSupportedException cnse)
        {
            cnse.printStackTrace(System.err);
        }

        return a;
    }

}



