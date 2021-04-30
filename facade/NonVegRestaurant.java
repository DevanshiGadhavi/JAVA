/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadedesignpattern;

/**
 *
 * @author Dell
 */
public class NonVegRestaurant implements IHotel{
    @Override
    public String getMenus()
    {
        
        NonVegRestaurant nv = new   NonVegRestaurant();  
        return nv; 
        /*System.out.println("this is nonveg");
        return null;*/
     }     
    
}
