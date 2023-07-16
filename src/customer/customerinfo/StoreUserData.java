
package customer.customerinfo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class StoreUserData 
{
       public void storeID(String ID)
      {
          try
          {
                FileWriter writer = new FileWriter("UserIDs.txt",true);
                BufferedWriter buffWriter = new BufferedWriter(writer);
                buffWriter.write(ID);
                buffWriter.newLine();
                buffWriter.close();
          }
          catch (Exception e) 
          {
          }
      }
      public int  getProductID()
     {
         int number = 0 ;
         try
         {
                FileReader fileReader = new FileReader("ProductID.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String data = reader.readLine();
                number = Integer.parseInt(data);
                number = number + 1;
                reader.close();
                FileWriter writer = new FileWriter("ProductID.txt", false);
                BufferedWriter buffWriter = new BufferedWriter(writer);
                buffWriter.write(Integer.toString(number));
                buffWriter.close();
                storeID(Integer.toString(number));
         }
         catch (Exception e) 
         {
         }
         return number;
      }
      public void storeUserData(String username, String password, String name, String email, String contactNumber, String address)
      {
          try
          {
                int ID = getProductID();
                String id = Integer.toString(ID);
                FileWriter fileWriter = new FileWriter(id+".txt");
                BufferedWriter writer = new BufferedWriter(fileWriter);
                writer.write(id);
                writer.newLine();
                writer.write(username);
                writer.newLine();
                writer.write(password);
                writer.newLine();
                writer.write(name);
                writer.newLine();
                writer.write(email);
                writer.newLine();
                writer.write(contactNumber);
                writer.newLine();
                writer.write(address);
                writer.newLine();
                writer.close();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Your ID is "+id);
          }
          catch (Exception e) 
          {
          }
      }
}
