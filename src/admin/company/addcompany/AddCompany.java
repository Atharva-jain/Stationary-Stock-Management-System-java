
package admin.company.addcompany;

import admin.company.CompanyChoices;
import mobilestoremanagementsystem.CheckCompanyName;
import mobilestoremanagementsystem.Input;

public class AddCompany
{
     public void addCompany()
     {
            Input input = new Input();
            System.out.println("/////////////////////////////////////////////////////////////////////////////////");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Enter Company Name ::: ");
            String companytName =  input.inputString();
            companytName = companytName.toUpperCase().trim();
            CheckCompanyName ccn = new CheckCompanyName();
            boolean check  = ccn.checkCompanyName(companytName);
            if(check)
            {
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Company Country ::: ");
                String companyCoutry =  input.inputString();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Company Email ::: ");
                String companyEmail =  input.inputString();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Company Contact No ::: ");
                long contactNo = input.longBug();
                String companyContactNo =  Long.toString(contactNo);
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Company Address ::: ");
                String companyAddress = input.inputString();
                System.out.println("----------------------------------------------------------------");
                StoreCompanyDetails companyDetails = new StoreCompanyDetails();
                companyDetails.storeCompanyData(companytName, companyCoutry, companyEmail, companyContactNo, companyAddress);
                System.out.println("Company ADDED  !!!.................................");
                CompanyChoices cc = new CompanyChoices();
                cc.companyChoices();
            }
            else
            {
                System.out.println("Company Name is Already Availlable ..............");
                System.out.println("You want to try Again (Yes / No )");
                String str = input.inputString();
                str = str.toUpperCase().trim();
                if(str.equals("YES"))
                {
                    addCompany();
                }
                else
                {
                     CompanyChoices cc = new CompanyChoices();
                     cc.companyChoices();
                }
            }
            System.out.println("//////////////////////////////////////////////////////////////////////////////////");
     }
    
}
