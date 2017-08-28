/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacommandpattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ben
 */
public class Controller {
    
    Command command; // store encapsulated method here
    private JPanel jPanel;
    
    public Controller(JPanel jPanel){
        this.jPanel = jPanel;
        JButton jButton = new JButton("Execute Command");
        jButton.addActionListener(new MyButtonListener()); 
        jPanel.add(jButton);
    }
    
    
    public void setCommand(Command command){
        this.command = command;
    }
    
    // When button is clicked it executes the command. It doesn't know what the
    // command is or what the command does, it just knows it can call the execute
    // method as specified by the interface. The defenition and the invocation are
    // decoupled.
    public class MyButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            command.execute();
        }
        
    }
    
}
