
package admin.company.addcompany;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class StoreCompanyDetails 
{
   
           public void insertCompanyName(String companyName)
           {
           try
           {
                 FileWriter fileWriter = new FileWriter("CompanyNames.txt", true);
                 BufferedWriter writer = new BufferedWriter(fileWriter);
                 writer.write(companyName);
                 writer.newLine();
                 writer.close();
           }
           catch (Exception e) 
           {
           }
       }
       public void storeCompanyData(String name, String country, String email, String contactNo, String address)
       {
           try
           {
                 name = name.toUpperCase().trim();
                 FileWriter fileWriter = new FileWriter(name+".txt");
                 BufferedWriter writer = new BufferedWriter(fileWriter);
                 writer.write(name);
                 writer.newLine();
                 writer.write(country);
                 writer.newLine();
                 writer.write(email);
                 writer.newLine();
                 writer.write(contactNo);
                 writer.newLine();
                 writer.write(address);
                 writer.newLine();
                 writer.close();
                 insertCompanyName(name);
           }
           catch (Exception e) 
           {
           }
       }
}
