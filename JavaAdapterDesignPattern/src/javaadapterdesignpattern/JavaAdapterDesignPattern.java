/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadapterdesignpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList uses iterators. The purpose of this program is demonstrate
 * an adapter used on an ArrayList so that it works with enumerations
 * @author Ben
 */
public class JavaAdapterDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        
        Iterator arrayListIterator = arrayList.iterator();
        
        // Adapter that is of type Enumeration, but is unknowningly calling methods
        // of an ArrayList Iterator.
        EnumerationAdapter enumeration = new EnumerationAdapter(arrayListIterator);
        
        // For ex, has more elements is actually implemented using hasNext() from
        // The iterator
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
        
    }
    
}
