
package homepage;

import admin.adminlogin.AdminLogin;
import customer.customerinfo.CustomerChoices;
import customer.customerinfo.CustomerInformation;
import customerlogin.CustomerLogin;
import mobilestoremanagementsystem.Input;
public class FrontPage
{
      public void designed()
      {
          Input input = new  Input();
          System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
          System.out.println("--------------------------------------------------------------------------------------------");
          System.out.println(">>>>>>>>>MOBILE STORE INFORMATION SYSTEM<<<<<<<<<<<<");
          System.out.println("--------------------------------------------------------------------------------------------");
          System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
          System.out.println(">>>>>>>>>>>>>>>>>>A : ADMIN LOGIN <<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>B : USER LOGIN    <<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>C : CREATE USER <<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>E : EXIT    <<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>ENTER YOUR CHOICE  ::::: ");
          String str = input.inputString();
          str = str.toUpperCase().trim();
          if(str.equals("A"))
          {
              AdminLogin adminLogin = new AdminLogin();
              adminLogin.adminLogin();;
          }
          else if(str.equals("B"))
          {
               AfterLoginChoices afterLoginChoices = new AfterLoginChoices();
               afterLoginChoices.afterLoginChoices();
          }
          else if(str.equals("C"))
          {
               CustomerInformation ci = new CustomerInformation();
               ci.createUser();
          }
          else if(str.equals("E"))
          {
              System.exit(0);
          }
          else
          {
              System.out.println("Enter the choice between the Given Value ...................................");
              designed();
          }
      }
    
}
