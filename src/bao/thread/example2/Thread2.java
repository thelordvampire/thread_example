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
public class Thread2 implements Runnable {
    
    private final Data objData;

    public Thread2(Data objData) {
        this.objData = objData;
    }

    @Override
    public void run() {
        while(true)
        {
            int i = objData.getI();
            i++;
            objData.setI(i);
            System.out.println(Thread.currentThread().getName()+" data "+i);
        }
    }
}