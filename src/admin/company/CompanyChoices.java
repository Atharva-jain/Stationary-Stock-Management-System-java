
package admin.company;

import admin.AdminChoices;
import admin.company.addcompany.AddCompany;
import admin.company.deletecompany.DeleteCompany;
import admin.company.displaycompany.DisplayCompany;
import admin.company.modifycompany.ModifyCompany;
import admin.company.searchcompany.SearchCompany;
import mobilestoremanagementsystem.Input;

public class CompanyChoices 
{
       public void companyChoices()
       {
               Input input = new  Input();
          System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
          System.out.println(">>>>>>>>>>>>>>>>>>A : ADD COMPANY <<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>B : UPDATE COMPANY <<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>C : SEARCH COMPANY <<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>D : DISPLAY COMPANY <<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>E : DELETE COMPANY <<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>X : EXIT <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>ENTER YOUR CHOICE  ::::: ");
          String str = input.inputString();
          str = str.toUpperCase().trim();
          if(str.equals("A"))
          {
                AddCompany ac = new AddCompany();
                ac.addCompany();
          }
          else if(str.equals("B"))
          {
                 ModifyCompany company = new ModifyCompany();
                 company.updateCompany();
          }
          else if(str.equals("C"))
          {
                 SearchCompany company = new SearchCompany();
                 company.displayCompanyData();
          }
          else if(str.equals("D"))
          {
                DisplayCompany company = new DisplayCompany();
                company.displayHoleCompanyDetails();
          }
          else if(str.equals("E"))
          {
                DeleteCompany company = new DeleteCompany();
                company.deleteCompany();
          }
          else if(str.equals("X"))
          {
               AdminChoices ac = new AdminChoices();
               ac.adminChoices();
          }
          else
          {
              System.out.println("Enter the choice between the Given Value ...................................");
              companyChoices();
          }
       }
    
}
