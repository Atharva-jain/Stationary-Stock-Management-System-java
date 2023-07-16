
package admin.company.deletecompany;

import admin.company.CompanyChoices;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import mobilestoremanagementsystem.CheckCompanyName;
import mobilestoremanagementsystem.Input;

public class DeleteCompany
{
         public void replaceData()
     {
         try
         {
               FileReader fileReader = new FileReader("temp.txt");
               BufferedReader reader = new BufferedReader(fileReader);
               FileWriter fileWriter = new FileWriter("CompanyNames.txt", false);
               BufferedWriter writer = new BufferedWriter(fileWriter);
               String data =  "";
               while((data = reader.readLine()) != null)
               {
                      writer.write(data);
                      writer.newLine();
               }
               writer.close();
               reader.close();
         }
         catch (Exception e) 
         {
         }
     } 
    
    
     public void deleteCompanyNameFromFile(String companyName)
     {
         try
         {
               FileReader fileReader = new FileReader("CompanyNames.txt");
               BufferedReader reader = new BufferedReader(fileReader);
               FileWriter fileWriter = new FileWriter("temp.txt", false);
               BufferedWriter writer = new BufferedWriter(fileWriter);
               String data =  "";
               while((data = reader.readLine()) != null)
               {
                      if(data.equals(companyName))
                      {
                          writer.write("");
                      }
                      else
                      {
                         writer.write(data);
                         writer.newLine();
                      }
               }
               writer.close();
               reader.close();
               replaceData();
         } 
         catch (Exception e) {
         }
     }
     public void deleteCompanyFile(String companyName)
     {
            File file = new File(companyName+".txt");
            if(file.delete())
            {
                System.out.println("File Deleted Successfully ...........");
                deleteCompanyNameFromFile(companyName);
                CompanyChoices cc = new CompanyChoices();
                cc.companyChoices();
            }
            else
            {
                System.out.println("File are not Deleted  ...........");  
                CompanyChoices cc = new CompanyChoices();
                cc.companyChoices();
            }
     }
     public void deleteCompany()      
     {
           Input input = new Input();
           System.out.println("//////////////////////////////////////////////////////////////////////////////");
           System.out.println("----------------------------------------------------------------");
           System.out.println("Enter Product Name ::: ");
           String companyName = input.inputString();
           companyName = companyName.toUpperCase().trim();
           CheckCompanyName ccn = new CheckCompanyName();
           boolean check = ccn.checkingCompanyName(companyName);
           if(check)
           {
                 deleteCompanyFile(companyName);
                 CompanyChoices cc = new CompanyChoices();
                 cc.companyChoices();
           }
           else
           {
                System.out.println("Product Name is Not Availlable ..............");
                System.out.println("You want to try Again (Yes / No )");
                String str = input.inputString();
                str = str.toUpperCase().trim();
                if(str.equals("YES"))
                {
                    deleteCompany();
                }
                else
                {
                     CompanyChoices cc = new CompanyChoices();
                     cc.companyChoices();
                }
                
           }
     }
       
}
