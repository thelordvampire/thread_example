/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TwoThreads2;

/**
 *
 * @author C0907I1030
 */
public class Data {
    private int[] listSo={2,3,4,5,6,7,8};
    private String[] listNgay={"Thu 2","Thu 3","Thu 4","Thu 5","Thu 6","Thu 7","Chu Nhat"};
    private int index,trangthai=1;

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
    public String getNgay()
    {
        return listNgay[index];

    }
    public int getSo()
    {
        return listSo[index];
    }
    

}
