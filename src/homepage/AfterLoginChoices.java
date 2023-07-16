
package homepage;

import admin.adminlogin.AdminLogin;
import customer.customerinfo.CustomerInformation;
import customerforgotpassword.ForgotPassword;
import customerlogin.CustomerLogin;
import mobilestoremanagementsystem.Input;

public class AfterLoginChoices 
{
       public void afterLoginChoices()
       {
           Input input = new  Input();
          System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
          System.out.println(">>>>>>>>>>>>>>>>>>A : LOGIN <<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>B : FORGOT PASSWORD <<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>E : EXIT    <<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>ENTER YOUR CHOICE  ::::: ");
          String str = input.inputString();
          str = str.toUpperCase().trim();
          if(str.equals("A"))
          {
              CustomerLogin cl = new CustomerLogin();
              cl.userLogin();
          }
          else if(str.equals("B"))
          {
               ForgotPassword forgotPassword = new ForgotPassword();
               forgotPassword.forgotPassword();
          }
          else if(str.equals("E"))
          {
             FrontPage fp = new FrontPage();
             fp.designed();
          }
          else
          {
              System.out.println("Enter the choice between the Given Value ...................................");
              afterLoginChoices();
           }
       }
      
}
