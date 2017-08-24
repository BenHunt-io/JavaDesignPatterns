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

// This class is considered the context. Can get what state it is in from this class
public class RidingASkateboard {
    
    SkateboardState currentState;
    
    // Different States that are possible
    // Package-Private Access
    SkateboardState OnSkateboardState ;
    SkateboardState OffSkateboardState ;
    SkateboardState WalkingState ;
    SkateboardState TrickingState ;
    SkateboardState CrashedState ;
    SkateboardState BoardBrokenState ;
    
    public RidingASkateboard(){
    
        OnSkateboardState = new OnSkateboardState(this);
        OffSkateboardState = new OffSkateboardState(this);
        WalkingState = new WalkingState(this);
        TrickingState = new TrickingState(this);
        CrashedState =  new CrashedState(this);
        BoardBrokenState = new BoardBrokenState(this);
    
        currentState = OffSkateboardState; // initial State
    }
    
    
    public SkateboardState getState(){ return currentState;}
    
    public void setState(SkateboardState currentState){
        this.currentState = currentState;
    }
    
    public void getOnSkateboard(){
        currentState.getOnSkateBoard();
    }
    
    public void getOffSkateboard(){
        currentState.getOff();
    }
    
    public void doTrick(String trick){
        currentState.doTrick(trick);
    }
    
    public void push(int speed){
        currentState.push(speed);
    }
    
    public void walk(){
        currentState.walk();
    }
    
    public void getUp(){
        currentState.getUp();
    }
    
    public SkateboardState getOnSkateboardState(){return OnSkateboardState;}
    public SkateboardState getOffSkateboardState(){return OffSkateboardState;}
    public SkateboardState getWalkingState(){return WalkingState;}
    public SkateboardState getTrickingState(){return TrickingState;}
    public SkateboardState getCrashedState(){return CrashedState;}
    public SkateboardState getBrokenBoardState(){return BoardBrokenState;}
    
    
    
    
    
}
