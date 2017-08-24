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
public class OnSkateboardState implements SkateboardState {
    
    RidingASkateboard skateboardContext;

    public OnSkateboardState(RidingASkateboard aThis) {
        skateboardContext = aThis;
    }

    @Override
    public void getOnSkateBoard() {
        System.out.println("Already on board");
    }

    @Override
    public void doTrick(String trick) {
        System.out.println("Doing " + trick);
    }

    @Override
    public void push(int speed) {
        System.out.println("Just pushed at speed " + speed);
    }

    @Override
    public void getUp() {
        System.out.println("Get off board first");
    }

    @Override
    public void walk() {
        System.out.println("Get off board first");
    }

    @Override
    public void getOff() {
        System.out.println("Getting off");
        skateboardContext.setState(skateboardContext.getOffSkateboardState());
    }
    
}
