package fr.uvsq.poo.RPN_Calc;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author EL HABAR Moussa, SERHAN Wissam
 * Mars 2021
 */

public class SaisieRPN {

    private Scanner scan ;
    private MoteurRPN cal ; 

      public SaisieRPN()
      {

          scan = new Scanner(System.in);
          cal = new MoteurRPN();
      }

      public void saisie()
      {
          String signe;
          System.out.println("Veuillez saisir un nombre  ou un operateur:");
          
                     signe = scan.nextLine();

                     StringTokenizer str = new StringTokenizer(signe);
                      
             while (str.hasMoreTokens())
             {            
                 String chaine = str.nextToken();

                            if (est_un_entier(chaine))
                            {
                                  int d = Integer.parseInt(chaine);
                                  cal.Add(d);
                                  cal.executeCommand("autre");
                            }else if (chaine.equals("+"))
                            {
                                     appelAddition();

                            }else if (chaine.equals("-"))
                            {
                                appelSoustraction();
                            }else if (chaine.equals("*"))
                            {
                                appelMultiplication();
                            }else if (chaine.equals("/"))
                            {
                                appelDivision();
                            }else
                            {
                                    cal.executeCommand(chaine);
                            }
                                
             }

          cal.getAllCommands();
      }


      public static boolean est_un_entier(String chaine)
      {
          if (chaine == null ) return false ; 
          try { 
              Integer.parseInt(chaine); 
            }
            catch (NumberFormatException n)
            {
                return false ; 
            }
            return true ; 
      }

      public void appelSoustraction()
      {
          if (cal.getCurrent().size() >= 2)
          {
              cal.executeCommand("-");
          } 
          else 
          {
              System.out.println("Erreur: Veuillez respecter l'écriture RPN");
          }
      }
      public void appelAddition()
      {
          if (cal.getCurrent().size() >= 2)
          {
              cal.executeCommand("+");
          } 
          else
          {
              System.out.println("Erreur: Veuillez respecter l'écriture RPN ");
          }
      }

      public void appelMultiplication()
      {
          if (cal.getCurrent().size() >= 2)
          {
              cal.executeCommand("*");
          } 
          else
          {
              System.out.println("Erreur: Veuillez respecter l'écriture RPN");
          }
      }
      public void appelDivision()
      {
          if (cal.getCurrent().size() >= 2)
          {
              cal.executeCommand("/");
          } 
          else
          {
              System.out.println("Erreur: Veuillez respecter l'écriture RPN");
          }
      }


}