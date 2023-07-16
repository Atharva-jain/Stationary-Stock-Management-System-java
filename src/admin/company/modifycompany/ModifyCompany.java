
package admin.company.modifycompany;

import admin.company.CompanyChoices;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import mobilestoremanagementsystem.CheckCompanyName;
import mobilestoremanagementsystem.Input;


public class ModifyCompany 
{
       public void replaceData(String companyName)
       {
        try
        {
            FileReader fileReader = new FileReader("temp.txt");
            FileWriter fileWriter = new FileWriter(companyName+".txt", false);
            BufferedReader reader= new BufferedReader(fileReader);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            String data = "";
            int i =0;
            while((data = reader.readLine()) != null)
            {
                writer.write(data);
                writer.newLine();
                i++;
            }
            writer.close();
            reader.close();
         }
         catch (Exception e) 
         {
           
         }
       }
       public void editCompanyData(String compantName, String valueToChanged, int index)
       {
             try 
             {
                   try
                   {
                         FileReader fileReader = new FileReader(compantName+".txt");
                         FileWriter fileWriter = new FileWriter("temp.txt", false);
                         BufferedReader reader = new BufferedReader(fileReader);
                         BufferedWriter writer = new BufferedWriter(fileWriter);
                         String data =  "";
                         int i = 0 ; 
                         while((data = reader.readLine()) != null)
                         {
                             if(index == i)
                             {
                                  String changed = data.replaceAll(data, valueToChanged);
                                   
                                  writer.write(changed);
                                  writer.newLine();
                             }
                             else
                             {
                                  writer.write(data);
                                  writer.newLine();
                                   
                             }
                             i++;
                         }
                        
                        writer.close();
                        reader.close();
                        replaceData(compantName);
                    }
                   catch (Exception e) 
                   {
                   }
              }
               catch (Exception e) 
              {
              }
       }
       public void updateCompany()
       {
           Input input = new Input();
           System.out.println("//////////////////////////////////////////////////////////////////////////////");
           System.out.println("----------------------------------------------------------------");
           System.out.println("Enter Company Name ::: ");
           String companyName = input.inputString();
           companyName = companyName.toUpperCase().trim();
           CheckCompanyName ccn = new CheckCompanyName();
           boolean check = ccn.checkingCompanyName(companyName);
           if(check)
           {
                ModifyCompanyChoices choices = new ModifyCompanyChoices();
                choices.editCompantChoies(companyName);
                System.out.println("Update Successfully Done !!!...................");
                CompanyChoices cc = new CompanyChoices();
                cc.companyChoices();
           }
           else
           {
                System.out.println("Company Name is Not Availlable ..............");
                System.out.println("You want to try Again (Yes / No )");
                String str = input.inputString();
                str = str.toUpperCase().trim();
                if(str.equals("YES"))
                {
                    updateCompany();
                }
                else
                {
                     CompanyChoices cc = new CompanyChoices();
                     cc.companyChoices();
                }
                
           }
       }
    
}
