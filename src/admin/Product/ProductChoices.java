
package admin.Product;

import admin.AdminChoices;
import admin.Product.addproduct.AddProduct;
import admin.Product.deleteproduct.DeleteProduct;
import admin.Product.displayproduct.DisplayProduct;
import admin.Product.updateProduct.UpdateProduct;
import admin.SearchProduct.SearchProduct;
import mobilestoremanagementsystem.Input;

public class ProductChoices 
{
      public void productChoices()
      {
            Input input = new  Input();
          System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
          System.out.println(">>>>>>>>>>>>>>>>>>A : ADD PORDUCT <<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>B : UPDATE PRODUCT <<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>C : SEARCH PRODUCT <<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>D : DISPLAY PRODUCT <<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>E : DELETE PRODUCT <<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>X : EXIT <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>>>>>>>>>>>>>>>>ENTER YOUR CHOICE  ::::: ");
          String str = input.inputString();
          str = str.toUpperCase().trim();
          if(str.equals("A"))
          {
              AddProduct addProduct = new AddProduct();
              addProduct.addProduct();
          }
          else if(str.equals("B"))
          {
              UpdateProduct product = new UpdateProduct();
              product.updateProducts();
          }
          else if(str.equals("C"))
          {
              SearchProduct product = new SearchProduct();
              product.productDisplayDetails(null, 0);
          }
          else if(str.equals("D"))
          {
               DisplayProduct displayProduct = new DisplayProduct();
               displayProduct.displayProduct(null , 0);
          }
          else if(str.equals("E"))
          {
              DeleteProduct  deleteProduct = new DeleteProduct();
              deleteProduct.deleteProduct();
          }
          else if(str.equals("X"))
          {
              AdminChoices ac = new AdminChoices();
              ac.adminChoices();
          }
          else
          {
              System.out.println("Enter the choice between the Given Value ...................................");
              productChoices();
          }
 
      }
}
