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
public class MacroCommand implements Command{

    Command[] commands;
    
    public MacroCommand(Command[] commands){
        this.commands = commands;
    }
    
    @Override
    public void execute() {
        
        for(int i = 0; i < commands.length; i++){
            commands[i].execute();
        }
    }
    
}
