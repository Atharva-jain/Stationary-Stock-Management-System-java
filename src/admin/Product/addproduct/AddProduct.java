
package admin.Product.addproduct;

import admin.Product.ProductChoices;
import mobilestoremanagementsystem.CheckCompanyName;
import mobilestoremanagementsystem.Input;
import mobilestoremanagementsystem.ProductCheck;


public class AddProduct
{
          Input input = new Input();
      public void addProduct()
      {
            CheckCompanyName  ccn = new CheckCompanyName();
            System.out.println("//////////////////////////////////////////////////////////////////////////////");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Enter Product Name ::: ");
            String productName =  input.inputString();
            ProductCheck check1 = new ProductCheck();
            productName = productName.toUpperCase().trim();
            boolean ok = check1.checkMedicine(productName);
            if(ok){
            System.out.println("----------------------------------------------------------------");
            System.out.println("Enter Company Name ::: ");
            String companyName = input.inputString();
            companyName = companyName.toUpperCase().trim();
            boolean check = ccn.checkingCompanyName(companyName);
            if(check)
            {
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Product Category ::: ");
                String productCategory = input.inputString();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter Quantity ::: ");
                int quantity = input.integerBug();
                String quantityString  = Integer.toString(quantity);
                System.out.println("----------------------------------------------------------------");
                System.out.println("Price Per Unit ::: ");
                int price = input.integerBug();
                String pricePerUnit = Integer.toString(price);
                System.out.println("----------------------------------------------------------------");
                StoreProductData data = new StoreProductData();
                data.storeMedicianData(productName, companyName, productCategory, quantityString, pricePerUnit);
                System.out.println("Medicine Details are Store !!! ...............................");
                ProductChoices choices = new ProductChoices();
                choices.productChoices();
            }
            else
            {
                System.out.println("Company Name is Not Availlable ..............");
                System.out.println("You want to try Again (Yes / No )");
                String str = input.inputString();
                str = str.toUpperCase().trim();
                if(str.equals("YES"))
                {
                    addProduct();
                }
                else
                {
                    ProductChoices choices = new ProductChoices();
                    choices.productChoices();
                }
            }
            }
            else
            {
                System.out.println("Product Name is Already Availlable ..............");
                System.out.println("You want to try Again (Yes / No )");
                String str = input.inputString();
                str = str.toUpperCase().trim();
                if(str.equals("YES"))
                {
                    addProduct();
                }
                else
                {
                     ProductChoices choices = new ProductChoices();
                     choices.productChoices();
                }
            }
      }    
}
