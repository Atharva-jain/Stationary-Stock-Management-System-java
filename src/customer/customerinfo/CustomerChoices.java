
package customer.customerinfo;

import admin.Product.ProductChoices;
import admin.Product.displayproduct.DisplayProduct;
import admin.SearchProduct.SearchProduct;
import admin.company.CompanyChoices;
import buydetails.BuyDetails;
import customerbuyproduct.CustomerBuyProduct;
import customerviewbuyproduct.ViewProduct;
import homepage.AfterLoginChoices;
import mobilestoremanagementsystem.Input;


public class CustomerChoices
{
      public void customerChoices(String userID)
      {
           Input input = new  Input();
          System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
          System.out.println(">>>>>>>>>>>>>>>>>>A : BUY MOBILE <<<<<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>B : SEARCH MOBILE<<<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>C : DISPLAY MOBILE<<<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>D : VIEW BUY MOBILE<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>E : EXIT<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>ENTER YOUR CHOICE  ::::: ");
          String str = input.inputString();
          str = str.toUpperCase().trim();
          if(str.equals("A"))
          {
               CustomerBuyProduct buy = new CustomerBuyProduct();
               buy.customerBuyProduct(userID);
          }
          else if(str.equals("B"))
          {
               SearchProduct product = new SearchProduct();
               product.productDisplayDetails(userID, 1);
          }
          else if(str.equals("C"))
          {
               DisplayProduct displayProduct = new DisplayProduct();
               displayProduct.displayProduct(userID, 1);
                         
          }
          else if(str.equals("D"))
          {
                ViewProduct product = new ViewProduct();
                product.viewProduct(userID);
          }
          else if(str.equals("E"))
          {
                AfterLoginChoices afterLoginChoices = new AfterLoginChoices();
                afterLoginChoices.afterLoginChoices();
               
          }
          else
          {
              System.out.println("Enter the choice between the Given Value ...................................");
              customerChoices(userID);
          }
      }
    
}
