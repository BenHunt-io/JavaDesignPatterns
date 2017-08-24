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
public abstract class Duck {
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck(){
    }
    
    public abstract void display();
    
    public void performFly() {
        flyBehavior.fly(); // delegate to the behavior class. (Bc behavior varies)
    }
    
    public void performQuack() {
        quackBehavior.quack();
    }
    
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
    
}
