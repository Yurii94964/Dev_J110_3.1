/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlisted;

/**
 *
 * @author Юрий
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedListed linklist = new LinkedListed();
        
        linklist.addFirst(10);
        linklist.addFirst(20);
        linklist.addFirst(30);
        
        linklist.addLast(50);
        linklist.addLast(60);
        linklist.addLast(70);
        
       
        
       
        linklist.extractValueFirst();
        linklist.extractValueTail();
       linklist.extractValueFirstFromDelete();
       linklist.extractValueTailFromDelete1();
       linklist.printLinkedList();
        
         System.out.println("");
        
        linklist.printLinkedList();
       
        System.out.println(linklist.get(60));
        
       
        
    }
    
}
