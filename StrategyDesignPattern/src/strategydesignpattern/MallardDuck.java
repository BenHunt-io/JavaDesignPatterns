/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategydesignpattern;

/**
 *
 * @author Ben
 */
public class MallardDuck extends Duck{

    
    public MallardDuck(){
       flyBehavior = new FlyWithWings();
       quackBehavior = new Quack();
       
    }
    
    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
    
}
