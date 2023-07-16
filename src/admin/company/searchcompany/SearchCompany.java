 package admin.company.searchcompany;
 
import admin.company.CompanyChoices;
import java.io.BufferedReader;
import java.io.FileReader;
import mobilestoremanagementsystem.CheckCompanyName;
import mobilestoremanagementsystem.Input;

 public class SearchCompany 
 {
       public void displayData(String companyName)
      {
          try
          {
               FileReader fileReader = new FileReader(companyName+".txt");  
               BufferedReader reader = new BufferedReader(fileReader);
               String data =  "";
               int i = 0 ; 
               System.out.println("//////////////////////////////////////////////////////////////////////////////");
               while((data = reader.readLine()) != null)
               {
                     if(i == 0 )
                     {
                         System.out.println("Company Name ::: " +data);
                     }
                     if(i == 1 )
                     {
                         System.out.println("Company Country ::: " +data);
                     }
                     if(i == 2 )
                     {
                         System.out.println("Company Email ::: " +data);
                     }
                     if(i == 3 )
                     {
                         System.out.println("Company Contact Number  ::: " +data);
                     }
                     if(i == 4 )
                     {
                         System.out.println("Company Address ::: " +data);
                     }
                     i++;
               }
               System.out.println("//////////////////////////////////////////////////////////////////////////////");
          }
          catch (Exception e) {
          }
      }
      
      public void displayCompanyData()
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
                 displayData(companyName);
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
                    displayCompanyData();
                }
                else
                {
                     CompanyChoices cc = new CompanyChoices();
                     cc.companyChoices();
                }
                
           }
      }
 }
