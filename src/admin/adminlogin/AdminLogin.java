
package admin.adminlogin;

import admin.AdminChoices;
import homepage.FrontPage;
import mobilestoremanagementsystem.Input;

public class AdminLogin
{
    public void adminLogin()
    {
         Input input = new Input();
         System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////");
         System.out.println("---------------------------------------------------------------------------");
         System.out.println("Enter USERNAME :::: ");
         String username =  input.inputString();
         System.out.println("---------------------------------------------------------------------------");
         System.out.println("Enter PASSWORD ::::: ");
         String password =  input.inputString();
         if(username.equals("admin") && password.equals("admin"))
         {
             System.out.println("LOGIN SUCCESSFULLY !!!!......................");
             AdminChoices  ac = new AdminChoices();
             ac.adminChoices();
         }
         else
         {
                System.out.println("Invalid Username / Password !!!!!..................");
                System.out.println("You want to try Again (Yes / No )");
                String str = input.inputString();
                str = str.toUpperCase().trim();
                if(str.equals("YES"))
                {
                    adminLogin();
                }
                else
                {
                     FrontPage fp = new FrontPage();
                     fp.designed();
                }
         }
    }
    
}
