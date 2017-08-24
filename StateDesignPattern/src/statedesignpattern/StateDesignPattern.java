/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statedesignpattern;

/**
 *
 * @author Ben
 */
public class StateDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RidingASkateboard ridingASkateboard = new RidingASkateboard();
        
        ridingASkateboard.getOnSkateboard();
        ridingASkateboard.doTrick("Ollie");
        ridingASkateboard.doTrick("Kickflip");
   
        ridingASkateboard.getOffSkateboard();
        ridingASkateboard.walk();
        ridingASkateboard.doTrick("Kickflip");
        ridingASkateboard.getOffSkateboard();
    }
    
}
