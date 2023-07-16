
package admin.Product.displayproduct;

import admin.Product.ProductChoices;
import admin.SearchProduct.SearchProduct;
import customer.customerinfo.CustomerChoices;
import java.io.BufferedReader;
import java.io.FileReader;


public class DisplayProduct 
{
      public void displayProduct(String userID, int index)
      {
            try
           {
               SearchProduct details = new SearchProduct();
               FileReader fileReader = new FileReader("ProductNames.txt");  
               BufferedReader reader = new BufferedReader(fileReader);
               String data =  "";
               int i = 0 ; 
               System.out.println("//////////////////////////////////////////////////////////////////////////////");
               while((data = reader.readLine()) != null)
               {
                     details.displayDetails(data);
               }  
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
         catch (Exception e) 
         {
         }
      }
     
    
}
