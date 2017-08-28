/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacommandpattern;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Dynamically switches method invocation with the use of polymorphism. This
 * pattern is known as the Command Pattern. At the same time, this method invocation
 * is encapsulated. The button listener only knows that there's a class that implements
 * the Command interface and that it has an execute method. It does not know the receiver
 * doing the action or how the action is done (Defined). The method definition 
 * and method execution are decoupled. Can change the method definition without
 * changing the method invocation!
 * @author Ben
 */
public class Client {

    private static JFrame jFrame;
    private static JPanel jPanel;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        onStart();
        
        Controller controller = new Controller(jPanel); // Our remote controller
        
        jFrame.add(jPanel);
        jFrame.setVisible(true);
         
        DishWasher dishWasher = new DishWasher(); // reciever
        WashDishesCommand washDishesCommand = new WashDishesCommand(dishWasher);
        // Pass a class that implements the Command Interface
        controller.setCommand(washDishesCommand); 
        
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Dynamically changes what method is being executed in the button listener
        // without any if statements. Also without the button listener even knowing
        // what is really being executed. It just knows it can call execute
        DryDishesCommand dryDishesCommand = new DryDishesCommand(dishWasher);
        controller.setCommand(dryDishesCommand);
        
        
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // A command consisting of other commands
        MacroCommand macroCommand = new MacroCommand(new Command[]{washDishesCommand, dryDishesCommand});
        controller.setCommand(macroCommand);
        
        
    }
    
    
    public static void onStart(){
        jFrame = new JFrame();
        jPanel = new JPanel();
        jPanel.setPreferredSize(new Dimension(300,300));
        jFrame.setSize(500, 500);
        
        jFrame.setVisible(true);
       
    }
    
}
