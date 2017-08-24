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
public class OffSkateboardState implements SkateboardState {
    
    RidingASkateboard skateboardContext;

    public OffSkateboardState(RidingASkateboard aThis) {
        skateboardContext = aThis;
    }

    @Override
    public void getOnSkateBoard() {
        System.out.println("Getting on board");
        skateboardContext.setState(skateboardContext.getOnSkateboardState());
        
    }

    @Override
    public void doTrick(String trick) {
        System.out.println("Get on board first");
    }

    @Override
    public void push(int speed) {
         System.out.println("Get on board first");
    }

    @Override
    public void getUp() {
        System.out.println("Didn't Crash");
    }

    @Override
    public void walk() {
        System.out.println("Starting Walking");
        skateboardContext.setState(skateboardContext.getWalkingState());
    }

    @Override
    public void getOff() {
        System.out.println("Get on board first");
    }
    
}
