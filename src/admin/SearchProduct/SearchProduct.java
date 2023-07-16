
package admin.SearchProduct;

import admin.Product.ProductChoices;
import customer.customerinfo.CustomerChoices;
import java.io.BufferedReader;
import java.io.FileReader;
import mobilestoremanagementsystem.CheckCompanyName;
import mobilestoremanagementsystem.Input;
import mobilestoremanagementsystem.ProductCheck;


public class SearchProduct
{
    public void displayDetails(String productName)
      {
           try
          {
               FileReader fileReader = new FileReader(productName+".txt");  
               BufferedReader reader = new BufferedReader(fileReader);
               String data =  "";
               int i = 0 ; 
               System.out.println("//////////////////////////////////////////////////////////////////////////////");
               while((data = reader.readLine()) != null)
               {
                     if(i == 0 )
                     {
                         System.out.println("Product Name ::: " +data);
                     }
                     if(i == 1 )
                     {
                         System.out.println("Company Name ::: " +data);
                     }
                     if(i == 2 )
                     {
                         System.out.println("Product Category ::: " +data);
                     }
                     if(i == 3 )
                     {
                         System.out.println("Product Quantity  ::: " +data);
                     }
                     if(i == 4 )
                     {
                         System.out.println("Product Price ::: " +data);
                     }
                     i++;
               }
               System.out.println("//////////////////////////////////////////////////////////////////////////////");
          }
          catch (Exception e) {
          }
      }
    
      public void productDisplayDetails(String userID ,int index)
      {
           Input input = new Input();
           System.out.println("//////////////////////////////////////////////////////////////////////////////");
           System.out.println("----------------------------------------------------------------");
           System.out.println("Enter Product Name ::: ");
           String companyName = input.inputString();
           companyName = companyName.toUpperCase().trim();
           ProductCheck check = new ProductCheck();
           boolean check1 = check.checkingMedicine(companyName);
           if(check1)
           {
                  displayDetails(companyName);
                  if(index == 0)
                      {
                          ProductChoices choices = new ProductChoices();
                          choices.productChoices();
                      }
                      if(index == 1)
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
                    productDisplayDetails(userID,index);
                }
                else
                {
                     if(index == 0)
                      {
                          ProductChoices choices = new ProductChoices();
                          choices.productChoices();
                      }
                      if(index == 1)
                      {
                          CustomerChoices cc = new CustomerChoices();
                          cc.customerChoices(userID);
                      }
                }
                
           }
      }
}
