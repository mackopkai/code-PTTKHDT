import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MangPhanSo {
    private PhanSo[] phanso;
    private int length;
    public MangPhanSo(PhanSo[] phanso, int length) {
        this.phanso = phanso;
        this.length = length;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            int tu = sc.nextInt();
            int ma = sc.nextInt();
            PhanSo ps = new PhanSo(tu, ma);
            phanso[i] = ps;
        }
    }

    public void printPs(){
        for (int i = 0; i < length; i++) {
            System.out.println(phanso[i].toString());
        }
    }
    public void Sort(){
        Arrays.sort(phanso, new Comparator<PhanSo>() {
            @Override
            public int compare(PhanSo p1, PhanSo p2) {
                return p1.getTu()*p2.getMau() > p2.getTu()*p1.getMau() ? 1 : -1;
            }
        });
    }

    public void addingPs(int vitri,PhanSo ps){
        for (int i = 0; i < length; i++) {
            if (i == vitri){
                length++;
                for (int j = length-1; j > i; j--) {
                    phanso[j+1] = phanso[j];
                }
                phanso[i] = ps;
            }
        }
    }

    public void deletePs(int vitri){
        for (int i = 0; i < length; i++) {
            if (i == vitri){
                length--;
                for (int j = i; j < length; j++) {
                    phanso[j] = phanso[j+1];
                }
            }
        }
    }

    public PhanSo timkiemPs(int vitri){
        for (int i = 0; i < length; i++) {
            if (i == vitri){
                return phanso[vitri];
            }
        }
        return null;
    }
}
