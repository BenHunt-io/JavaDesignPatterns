/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

/**
 *
 * @author Ben
 */
/**
 * Globally available to everybody in the package.
 * @author Ben
 */
public class WarriorSingleton {
    
    private String name;
    private int age;
    private int strength;
    
    // Holds the only object that is created
    private static WarriorSingleton warriorSingleton;
    
    // Cannot be instantiated outside the class
    private WarriorSingleton(String name, int age, int strength){
        this.name = name;
        this.age = age;
        this.strength = strength;
    }
    
    // Thread safe && Lazy initialized
    public static WarriorSingleton getInstance(){
        if(warriorSingleton == null){
            synchronized(WarriorSingleton.class){
                if(warriorSingleton == null){
                    return new WarriorSingleton("Ben", 21, 99);
                }
            }
        }
        
        return warriorSingleton;
    }
    
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
   
    public int getStrength(){
        return strength;
    }
}
