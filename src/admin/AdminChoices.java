
package admin;

import admin.Product.ProductChoices;
import admin.company.CompanyChoices;
import buydetails.BuyDetails;
import homepage.FrontPage;
import mobilestoremanagementsystem.Input;
import mobilestoremanagementsystem.ProductCheck;


public class AdminChoices 
{
      public void adminChoices()
      {
           Input input = new  Input();
          System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
          System.out.println(">>>>>>>>>>>>>>>>>>A : PRODUCT DETAILS <<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>B : COMPANY DETAILS<<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>C : BUY PRODUCT DETAILS<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>E : EXIT<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>ENTER YOUR CHOICE  ::::: ");
          String str = input.inputString();
          str = str.toUpperCase().trim();
          if(str.equals("A"))
          {
              ProductChoices choices = new ProductChoices();
              choices.productChoices();
          }
          else if(str.equals("B"))
          {
              CompanyChoices cc = new CompanyChoices();
              cc.companyChoices();
          }
          else if(str.equals("C"))
          {
                 BuyDetails d = new BuyDetails();
                 d.buyDetails();
                         
          }
           else if(str.equals("E"))
          {
                 FrontPage  fp = new FrontPage();
                 fp.designed();
          }
          else
          {
              System.out.println("Enter the choice between the Given Value ...................................");
              adminChoices();
          }
      }
}
