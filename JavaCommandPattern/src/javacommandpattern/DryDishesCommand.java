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
public class DryDishesCommand implements Command{

    DishWasher dishWasher; // recevier
    
    public DryDishesCommand(DishWasher dishWasher){
        this.dishWasher = dishWasher;
    }
    
    @Override
    public void execute() {
        dishWasher.dryDishes();
    }
    
}
