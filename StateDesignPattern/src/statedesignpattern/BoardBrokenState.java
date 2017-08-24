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
public class BoardBrokenState implements SkateboardState {

    public BoardBrokenState(RidingASkateboard aThis) {
    }

    @Override
    public void getOnSkateBoard() {
        System.out.println("Board is broken can't get back on it");
    }

    @Override
    public void doTrick(String trick) {
       System.out.println("Board is broken can't do " + trick);
    }

    @Override
    public void push(int speed) {
        System.out.println("Board is broken can't do push at speed " + speed);
    }

    @Override
    public void getUp() {
        System.out.println("Board is broken, shouldn't have fallen");
    }

    @Override
    public void walk() {
        System.out.println("Walking while holding my broken board");
    }

    @Override
    public void getOff() {
       System.out.println("I'm already off, my board is broken");
    }

    
}
