/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadapterdesignpattern;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author Ben
 */
public class EnumerationAdapter implements Enumeration{

    Iterator iterator; 
    
    public EnumerationAdapter(Iterator iterator){
        this.iterator = iterator;
    }
    
    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
    
}
