
package customerbuyproduct;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;

public class StoreSale 
{
    public boolean checkingorders(String userID)
    {
        boolean check = true;
        try 
        {
              userID = userID+"ordered.txt";
              FileReader fileReader = new FileReader("orders.txt");
              BufferedReader reader = new BufferedReader(fileReader);
              String data = "";
              while((data = reader.readLine()) != null)
              {
                    if(data.equals(userID))
                    {
                        check = false;
                    }
              }
            
        } catch (Exception e) {
        }
         return check;
    }
    public void storeOrders(String userID)
    {
        try
        {
              FileWriter fileWriter =  new FileWriter("orders.txt", true);
              BufferedWriter writer = new BufferedWriter(fileWriter);
              writer.write(userID+"ordered.txt");
              writer.newLine();
              writer.close();
              
        } catch (Exception e) {
        }
    }
    
     public String  getName(String userID)
    {
        String name = "";
        try
        {
                FileReader fileReader = new FileReader(userID+".txt");
               BufferedReader reader = new BufferedReader(fileReader);
               String data = "";
               reader.readLine();
               reader.readLine();
               name = reader.readLine();
               reader.close();
               
        } catch (Exception e) {
        }
        return name;
    }
    
    public String  bill(String productName, int quantity)
    {
          String originalBill = "";
          try 
          {
               FileReader fileReader = new FileReader(productName+".txt");
               BufferedReader reader = new BufferedReader(fileReader);
               String data = "";
               reader.readLine();
               reader.readLine();
               reader.readLine();
               reader.readLine();
               data = reader.readLine();
                
           
               int billData = Integer.parseInt(data);
               
               int billValue =0 ;
               for(int i = 0; i<quantity ; i++ )
               {
                   billValue = billValue + billData;
               }
               originalBill = Integer.toString(billValue);
               
             }
            catch (Exception e) 
           {
            }
            return originalBill;
        }
        public void storeSale(String userID, String productName, int  quantity)
        {
            String bill = bill(productName, quantity);
            String name = getName(userID);
             try
             {
              LocalDate date = LocalDate.now();
              String currentDate = date.toString();
              FileWriter fileWriter =  new FileWriter(userID+"ordered.txt", true);
              BufferedWriter writer = new BufferedWriter(fileWriter);
              writer.write(userID);
              writer.newLine();
              writer.write(name);
              writer.newLine();
              writer.write(productName);
              writer.newLine();
              writer.write(Integer.toString(quantity));
              writer.newLine();
              writer.write(bill);
              writer.newLine();
              writer.write(currentDate);
              writer.newLine();
              writer.close();
              boolean check = checkingorders(userID);
              if(check)
              {
                    storeOrders(userID);
              }
              System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
              System.out.println("Your Bill ::::: " +bill);
              System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        catch (Exception e) {
        }
        }
}
