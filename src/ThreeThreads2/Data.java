/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeThreads2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TAID
 */
public class Data {
    private List<Integer> nguyento=new ArrayList<>();
    private List<Integer> konguyento=new ArrayList<>();
    private int trangthai=1;
    private int num;

//    public Data() {
//        nguyento=new ArrayList<>();
//        konguyento=new ArrayList<>();
//    }

 
boolean add;
    public void setNguyenTo(int num)
    {
        try
        {
            add = nguyento.add(num);
            
        }
        catch(Exception ex)
        {
            System.out.print(ex.getMessage());
     //       System.out.println(add);
            
        }
        
    }
    
    public void setKoNguyenTo(int num)
    {
        konguyento.add(num);
    }
    
    public int getLengthNguyenTo()
    {
        return nguyento.size();
    }
    
    public int getLengthKoNguyenTo()
    {
        return konguyento.size();
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    
    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
    
}
