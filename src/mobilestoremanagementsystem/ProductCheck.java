
package mobilestoremanagementsystem;

import java.io.BufferedReader;
import java.io.FileReader;


public class ProductCheck 
{
     
        public boolean checkMedicine(String productName)
      {
           boolean check = true;
          try
          {
                FileReader fileReader = new FileReader("ProductNames.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String data = "";
                while((data = reader.readLine()) != null)
                {
                    if(data.equals(productName))
                    {
                        check = false;
                    }
                }
          }
          catch (Exception e) 
          {
          }
          return check;
      }
      public boolean checkingMedicine(String productName)
      {
          boolean check = false;
          try
          {
                FileReader fileReader = new FileReader("ProductNames.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String data = "";
                while((data = reader.readLine()) != null)
                {
                    if(data.equals(productName))
                    {
                        check = true;
                    }
                }
          }
          catch (Exception e) 
          {
          }
          return check;
      }
    
      
}
