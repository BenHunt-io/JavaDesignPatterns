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
public class WalkingState implements SkateboardState {

    public WalkingState(RidingASkateboard aThis) {
    }

    @Override
    public void getOnSkateBoard() {
        System.out.println("Not supported yet");
    }

    @Override
    public void doTrick(String trick) {
       System.out.println("Not supported yet");
    }

    @Override
    public void push(int speed) {
        System.out.println("Not supported yet");
    }

    @Override
    public void getUp() {
        System.out.println("Not supported yet");
    }

    @Override
    public void walk() {
        System.out.println("Not supported yet");
    }

    @Override
    public void getOff() {
        System.out.println("Not supported yet");
    }
    
}
