
package admin.company.modifycompany;

import mobilestoremanagementsystem.Input;


public class ModifyCompanyChoices 
{
      public void editCompantChoies(String companyName)
     {
             Input input = new Input();
              try
               {
                          String temp = "";
                          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
                          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
                          System.out.println("+++++++++++++ A  :  Update Company Country +++++++++++++++");
                          System.out.println("+++++++++++++ B  :  Update Company Email +++++++++++++++++");
                          System.out.println("+++++++++++++ C  :  Update Company Contact Number  +++++++++");
                          System.out.println("+++++++++++++ D  :  Update Company Address  +++++++++++++++");
                          System.out.println("+++++++++++++ E  :  Exit ++++++++++++++++++++++++++++++++");
                          System.out.println("+++++++++++++ Enter your Choice ::: ");
                          String choice =  input.inputString();
                          choice = choice.toUpperCase().trim();
                          if(choice.equals("A"))
                          {
                                 System.out.println("Enter Company Country ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 ModifyCompany company = new ModifyCompany();
                                 company.editCompanyData(companyName, temp, 1);
                                  
                          }
                          else if(choice.equals("B"))
                          {
                                 System.out.println("Enter Company Email ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 ModifyCompany company = new ModifyCompany();
                                 company.editCompanyData(companyName, temp, 2);
                                  
                          }
                          else if(choice.equals("C"))
                          {
                                 System.out.println("Enter Company Contact Number  ::: ");
                                 long countactNumber = input.longBug();
                                 temp = Long.toString(countactNumber);
                                 temp = temp.trim();
                                 ModifyCompany company = new ModifyCompany();
                                 company.editCompanyData(companyName, temp, 3);
                                  
                          }
                          else if(choice.equals("D"))
                          {
                                 System.out.println("Enter Company Address ::: ");
                                 temp = input.inputString();
                                 temp = temp.trim();
                                 ModifyCompany company = new ModifyCompany();
                                 company.editCompanyData(companyName, temp, 4);
                                  
                          }
                          else if(choice.equals("E"))
                          {
                                  
                          }
                          else
                          {
                              System.out.println("Enter the Choice Between the given Choices .......................");
                              editCompantChoies(choice);
                          }
                          
          }
          catch (Exception e) {
          }
          
     }
}
