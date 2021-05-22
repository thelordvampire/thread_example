/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TwoThreads3;

/**
 *
 * @author C0907I1030
 */
public class Animal {
    private String[] arr1={"cho","bo","trau","ga","meo"};
    private String[] arr2={"xuong","co","co","thoc","ca"};
    private int trangthai=1;
    private int index;

    public String getArr1(int i)
    {
        return arr1[i];
    }
    public String getArr2(int i)
    {
        return arr2[i];
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public Animal() {
    }

    
}
