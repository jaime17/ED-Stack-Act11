/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaact11;

/**
 *
 * @author emiaj
 */
public class PilaAct11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Stack  pila = new Stack();
        pila.push(5);
        pila.push(30);
        pila.pop();
        pila.push(12);
        pila.pop();
        pila.push(8);
        pila.push(142);
        pila.showStack();
    }
    
}
