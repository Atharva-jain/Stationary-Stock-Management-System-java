 
package buydetails;

import admin.AdminChoices;
import admin.Product.ProductChoices;
import admin.SearchProduct.SearchProduct;
import java.io.BufferedReader;
import java.io.FileReader;

 
public class BuyDetails 
{
       public void displayOrderDetails(String orderName)
       {
              try
          {
               FileReader fileReader = new FileReader(orderName);  
               BufferedReader reader = new BufferedReader(fileReader);
               String data =  "";
               for(int i = 0 ; (data = reader.readLine()) != null ; i++ )
               {
                     
                     if(i == 0 )
                     {
                         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
                         System.out.println("Customer ID  ::: " +data);
                     }
                     if(i == 1 )
                     {
                         System.out.println("Customer Name ::: " +data);
                     }
                     if(i == 2 )
                     {
                         System.out.println("Product Name ::: " +data);
                     }
                     if(i == 3 )
                     {
                         System.out.println("Quantity   ::: " +data);
                     }
                     if(i == 4 )
                     {
                         System.out.println("BILL  ::: " +data);
                      
                     }
                     if(i == 5 )
                     {
                         System.out.println("Buy Date  ::: " +data);
                         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
                         i = -1;
                     }
              
               }
               
            }
            catch (Exception e) {
           }
       }
       public void buyDetails()
       {
            try
           {
               SearchProduct details = new SearchProduct();
               FileReader fileReader = new FileReader("orders.txt");  
               BufferedReader reader = new BufferedReader(fileReader);
               String data =  "";
               int i = 0 ; 
               while((data = reader.readLine()) != null)
               {
                      System.out.println(""+data);
                      System.out.println("//////////////////////////////////////////////////////////////////////////////");
                      displayOrderDetails(data);
                      System.out.println("//////////////////////////////////////////////////////////////////////////////");
               }  
               AdminChoices  ac = new AdminChoices();
               ac.adminChoices();
          }
         catch (Exception e) 
         {
             System.out.println("You did not even buy anthing !!!!!!!................................");
         }
       }
    
}
