
package customerviewbuyproduct;

import customer.customerinfo.CustomerChoices;
import java.io.BufferedReader;
import java.io.FileReader;


public class ViewProduct 
{
        public void viewProduct(String userID)
        {
            try
          {
                FileReader fileReader = new FileReader(userID+"ordered.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String data = "";
                
                for(int i=0 ; (data = reader.readLine()) != null ; i++)
                {
                    
                    if(i == 0)
                    {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("User ID :::: " +data);
                  
                    }
                    
                    if(i == 1)
                    {
                        System.out.println("----------------------------------------------------------");
                        System.out.println("Name  :::: " +data);
                  
                    }
                    if(i == 2)
                    {
                        
                        System.out.println("Product Name :::: " +data);
                     
                    }
                    if(i == 3)
                    {
                        
                        System.out.println("Quantity  :::: " +data);
                       
                    }
                    if(i == 4)
                    {
                      
                        System.out.println("Bill :::: " +data);
                         
                    }
                    if(i == 5)
                    {
                        System.out.println("Data  :::: " +data);
                        System.out.println("----------------------------------------------------------");
                        i = -1;
                    }
                }
                CustomerChoices cc = new CustomerChoices();
                cc.customerChoices(userID);
          }
          catch (Exception e) 
          {
               System.out.println("YOU DID NOT EVEN BUY ANTHING !!!!!!....................");
               CustomerChoices cc = new CustomerChoices();
               cc.customerChoices(userID);
          }
        }
}
