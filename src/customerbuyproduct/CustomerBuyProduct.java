
package customerbuyproduct;

import admin.SearchProduct.SearchProduct;
import customer.customerinfo.CustomerChoices;
import mobilestoremanagementsystem.Input;
import mobilestoremanagementsystem.ProductCheck;

public class CustomerBuyProduct 
{
        public void customerBuyProduct(String userID)
        {
              Input input = new Input();
              try 
              {
                     System.out.println("//////////////////////////////////////////////////////////////////////////////");
                     System.out.println("----------------------------------------------------------------");
                     System.out.println("Enter Product Name ::: ");
                     String productName = input.inputString();
                     productName = productName.toUpperCase().trim();
                     ProductCheck checkProduct = new ProductCheck();
                     boolean check = checkProduct.checkingMedicine(productName);
                     if(check)
                     {
                           SearchProduct product = new SearchProduct();
                           product.displayDetails(productName);
                           System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                           System.out.println("You want to buy this product (Yes / No) ");
                           String str = input.inputString();
                           str = str.toUpperCase().trim();
                           if(str.equals("YES"))
                           {
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println("Enter Quantity ::: "); 
                                int quantity = input.integerBug();
                                String quantityString  = Integer.toString(quantity);
                                StoreSale sale = new StoreSale();
                                sale.storeSale(userID, productName, quantity);
                                System.out.println("PRODUCT BUY SUCCESSFULLY !!!!............................");
                                CustomerChoices cc = new CustomerChoices();
                                cc.customerChoices(userID);
                           }
                           else
                           {
                               CustomerChoices cc = new CustomerChoices();
                               cc.customerChoices(userID);
                           }
                     }
                     else
                     {
                              System.out.println("Product Name is Not Availlable ..............");
                              System.out.println("You want to try Again (Yes / No )");
                              String str = input.inputString();
                              str = str.toUpperCase().trim();
                              if(str.equals("YES"))
                             {
                                     customerBuyProduct(userID);
                              }
                             else
                              {
                                      CustomerChoices cc = new CustomerChoices();
                                      cc.customerChoices(userID);
                              }
                
                      }    
                     
              }
             catch (Exception e) 
             {
             }
        }
    
}
