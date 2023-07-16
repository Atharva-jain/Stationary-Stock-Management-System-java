
package admin.company.displaycompany;

import admin.company.CompanyChoices;
import admin.company.searchcompany.SearchCompany;
import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayCompany
{
     public void displayHoleCompanyDetails()
     {
         try
         {
               SearchCompany companyData = new SearchCompany();
               FileReader fileReader = new FileReader("CompanyNames.txt");  
               BufferedReader reader = new BufferedReader(fileReader);
               String data =  "";
               int i = 0 ; 
               System.out.println("//////////////////////////////////////////////////////////////////////////////");
               while((data = reader.readLine()) != null)
               {
                   companyData.displayData(data);
                   
               }  
               CompanyChoices cc = new CompanyChoices();
               cc.companyChoices();
         }
         catch (Exception e) 
         {
         }
     }
}
