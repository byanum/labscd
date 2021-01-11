/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsales;

/**
 *
 * @author Anum
 */
public class Discount implements DiscountInterface{
    POS pObj;
    int discounts;
    String disAmount;
    
    public Discount(){}
    
    public Discount(POS parent){
       pObj = parent;
    }

    /**
     *
     */
    @Override
    public void discount(){
         
       int  total =  Integer.parseInt(pObj.jTotal.getText());
       discounts = (int) (total * 0.20); 
       disAmount = String.format("%d", discounts );
     //  return disAmount;
    }
    
}
