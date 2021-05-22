/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bao.thread.example2;

/**
 *
 * @author Bao
 */
public class Main {
    
    public static void main(String[] args) {
        Data objData = new Data();
        Thread t1 = new Thread(new Thread1(objData)); 
        Thread t2 = new Thread(new Thread2(objData)); 
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setName("Luồng 1");
        t2.setName("Luồng 2");
        
        t1.start();
        t2.start();
    }
}
