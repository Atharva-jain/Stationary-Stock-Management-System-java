/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilestoremanagementsystem;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author MCT
 */
public class CheckingUserID 
{
       public boolean checkingUserID(String ID)
      {
          boolean check = false;
          try
          {
                FileReader fileReader = new FileReader("UserIDs.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String data = "";
                while((data = reader.readLine()) != null)
                {
                    if(data.equals(ID))
                    {
                        check = true;
                    }
                }
          }
          catch (Exception e) 
          {
          }
          return check;
      }
      
}
