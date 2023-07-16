
package customer.customerinfo;

import homepage.FrontPage;
import mobilestoremanagementsystem.Input;


public class CustomerInformation 
{
       public void createUser()
      {
            Input input = new Input();
            System.out.println("/////////////////////////////////////////////////////////////////////////////////");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Enter Username :::: ");
            String username = input.inputString();
            System.out.println("Enter Password :::: ");
            String password = input.inputString();
            System.out.println("Enter Name :::: ");
            String name = input.inputString();
            System.out.println("Enter Email :::: ");
            String email = input.inputString();
            System.out.println("Enter Contact Number :::: ");
            long contactNO= input.longBug();
            String contactNumber = Long.toString(contactNO);
            System.out.println("Enter Address :::: ");
            String address = input.inputString();
            StoreUserData data = new StoreUserData();
            data.storeUserData(username, password, name, email, contactNumber, address);
            System.out.println("User Created !!!!................................");
            System.out.println("/////////////////////////////////////////////////////////////////////////////////");
            System.out.println("----------------------------------------------------------------");
            FrontPage fp = new FrontPage();
            fp.designed();
      }
}  
