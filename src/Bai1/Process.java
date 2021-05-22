/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author TAID
 */
public class Process {
     public static void main(String[] args) {
        DuLieu objData = new DuLieu();

        Thread1 t1 = new Thread1(objData);
        Thread2 t2 = new Thread2(objData);

        t1.start();
        t2.start();
    }
    
}
