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
public interface SkateboardState {
    
    // different states expected: OnSkateboard, offSkateboard, Walking, Tricking
    // Crashed
    public void getOnSkateBoard();
    public void doTrick(String trick);
    public void push(int speed);
    public void getUp();
    public void walk();
    public void getOff();
    
}
