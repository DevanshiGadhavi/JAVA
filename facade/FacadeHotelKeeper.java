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
public class FacadeHotelKeeper {
    
    public VegRestaurant getVegMenu()
    {
                VegRestaurant v=new VegRestaurant();
                /*VegMenu vegMenu=v.getMenus();*/
                return v;
        
    }
     public NonVegRestaurant getNonVegMenu()
    {
                NonVegRestaurant nv=new NonVegRestaurant();
                return nv;
               /* NonVegMenu NonvegMenu=v.getMenus();
                return NonvegMenu;*/
        
    }
      public VegNonBothRestaurant getVegNonMenu()
    {
                 VegNonBothRestaurant vnb=new VegNonBothRestaurant();
                return vnb;
               /* NonVegMenu NonvegMenu=v.getMenus();
                return NonvegMenu;*/

    }


    
}
