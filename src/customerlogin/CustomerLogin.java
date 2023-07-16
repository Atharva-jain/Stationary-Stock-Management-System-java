
package customerlogin;

import customer.customerinfo.CustomerChoices;
import customerforgotpassword.ForgotPassword;
import homepage.AfterLoginChoices;
import homepage.FrontPage;
import java.io.BufferedReader;
import java.io.FileReader;
import mobilestoremanagementsystem.CheckingUserID;
import mobilestoremanagementsystem.Input;


public class CustomerLogin
{
      public boolean checkPassword(String ID, String password)
     {
        
          boolean check = false;
          try
          {
               
                FileReader fileReader = new FileReader(ID+".txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String data = "";
                while((data = reader.readLine()) != null)
                {
                      if(data.equals(password))
                      {
                          check = true;
                      }
                }
          }
          catch (Exception e) 
          {
              
          }
          return check;
     }
     public void userLogin()
     {
           Input input = new Input();
           System.out.println("/////////////////////////////////////////////////////////////////////////////////");
           System.out.println("----------------------------------------------------------------");
           System.out.println("Enter Your ID ::: ");
           int ID = input.integerBug();
           CheckingUserID checkingUserID = new CheckingUserID();
           boolean check = checkingUserID.checkingUserID(Integer.toString(ID));
           if(check)
           {
              String id = Integer.toString(ID);
              System.out.println("----------------------------------------------------------------");
              System.out.println("Enter Username");
              String username = input.inputString();
              username = username.trim();
              ForgotPassword forgotPassword = new ForgotPassword();
              boolean ok = forgotPassword.checkUsername(id, username);
              if(ok)
              {
                  System.out.println("----------------------------------------------------------------");
                  System.out.println("Enter  Password :::: ");
                  String password = input.inputString();
                  password = password.trim();
                  boolean okcool = checkPassword(id, password);
                  if(okcool)
                  {
                      System.out.println("Successfully Login !!!............................... ");
                      CustomerChoices cc  = new CustomerChoices();
                      cc.customerChoices(id);
                  }
                  else
                  {
                        System.out.println("Invalid Password !! ..............");
                        System.out.println("You want to try Again (Yes / No )");
                       String str = input.inputString();
                       str = str.toUpperCase().trim();
                       if(str.equals("YES"))
                      {
                         userLogin();
                      }
                      else
                     {
                           AfterLoginChoices  afterLoginChoices = new AfterLoginChoices();
                           afterLoginChoices.afterLoginChoices();
                     }
                  }
              }
              else
              {
                  System.out.println("Invalid Username !! ..............");
                  System.out.println("You want to try Again (Yes / No )");
                  String str = input.inputString();
                  str = str.toUpperCase().trim();
                  if(str.equals("YES"))
                  {
                      userLogin();
                  }
                  else
                  {
                       AfterLoginChoices  afterLoginChoices = new AfterLoginChoices();
                        afterLoginChoices.afterLoginChoices();
                  }
              }
           }
           else
           {
                  System.out.println("Invalid User ID !! ..............");
                  System.out.println("You want to try Again (Yes / No )");
                  String str = input.inputString();
                  str = str.toUpperCase().trim();
                  if(str.equals("YES"))
                  {
                      userLogin();
                  }
                  else
                  {
                      FrontPage fp = new FrontPage();
                      fp.designed();
                  }
           }
     }
    
}
