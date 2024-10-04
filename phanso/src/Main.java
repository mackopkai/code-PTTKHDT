import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhanSo[] ps = new PhanSo[10000];
        int length = scanner.nextInt();
        MangPhanSo mps = new MangPhanSo(ps,length);
        mps.input();
//        mps.Sort();
        int vitri = 1;
        PhanSo ps1 = new PhanSo(1,2);
        PhanSo ps2 = mps.timkiemPs(vitri);
        System.out.println(ps2.toString());
    }
}
/*
5
5 7
6 13
9 11
7 16
8 3
* */