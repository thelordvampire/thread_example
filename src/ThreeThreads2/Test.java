/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeThreads2;

/**
 *
 * @author TAID
 *      Đề bài:Đọc từ file.txt 1 số,kiểm tra số đó là nguyên tố hay ko và hiển thị ra màn hình
 */
public class Test {
    public static void main(String[] args)
    {
        Data data=new Data();
        Thread1 t1=new Thread1(data);
        Thread2 t2=new Thread2(data);
        Thread3 t3=new Thread3(data);
        t1.start();
        t2.start();
        t3.start();
    }
    
    
}
