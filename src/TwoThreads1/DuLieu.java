/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TwoThreads1;

/**
 *
 * @author C0907I1030
 */
public class DuLieu {
    private String[] ArrName={"An","Dat","Nam","Cuong","Duy"};
    private int index,flag=1;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public String getName()
    {
        return ArrName[index];
    }
    public int getLength()
    {
        return ArrName.length;
    }

    

}
