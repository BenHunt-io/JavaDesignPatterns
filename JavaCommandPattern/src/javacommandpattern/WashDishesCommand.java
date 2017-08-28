/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacommandpattern;

/**
 *
 * @author Ben
 */
public class WashDishesCommand implements Command{

    DishWasher dishWasher; // Receiver
    
    public WashDishesCommand(DishWasher dishWasher){
        this.dishWasher = dishWasher;
    };
    
    @Override
    public void execute() {
        dishWasher.washDishes();
    }
   
    
}
