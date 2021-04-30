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
public class FacadeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FacadeHotelKeeper keeper=new  FacadeHotelKeeper();
        
        VegRestaurant v=keeper.getVegMenu();
        System.out.println("this is vegitarian");
        NonVegRestaurant nv=keeper.getNonVegMenu();
          System.out.println("this is nonvegitarian");
        VegNonBothRestaurant vnb=keeper.getVegNonMenu();
          System.out.println("this is both vegiterian and non-vegitarian");
    }
    
}
