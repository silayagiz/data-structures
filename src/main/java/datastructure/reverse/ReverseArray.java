/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.reverse;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author silayagiz
 */
public class ReverseArray {
    
    public void arrayReverser(String [] reversedArray)
    {
        Stream.of(reversedArray)
            .collect(Collectors.toCollection(LinkedList::new))
            .descendingIterator()
                .forEachRemaining(element -> {System.out.print(element+ " ");});
             
    }
    
    
            
     }
