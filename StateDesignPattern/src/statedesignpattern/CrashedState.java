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
public class CrashedState implements SkateboardState {
    
    RidingASkateboard skateboardContext;

    public CrashedState(RidingASkateboard aThis) {
    }

    @Override
    public void getOnSkateBoard() {
        System.out.println("Getting back on skateboard");
        skateboardContext.setState(skateboardContext.getOnSkateboardState());
        
    }

    @Override
    public void doTrick(String trick) {
        System.out.println("Can't do trick board is broken:  " + trick);
    }

    @Override
    public void push(int speed) {
        System.out.println("Can't push at speed " + speed + " Board broke");
    }

    @Override
    public void getUp() {
        System.out.println("Can't get up Board broke");
    }

    @Override
    public void walk() {
        System.out.println("Can't walk up Board broke");
    }

    @Override
    public void getOff() {
        System.out.println("Already off board");
    }
        
 }
    

