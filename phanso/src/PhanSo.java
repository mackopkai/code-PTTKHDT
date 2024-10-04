public class PhanSo {
    private int tu,mau;
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public PhanSo() {}

    public int getMau() {
        return mau;
    }

    public int getTu() {
        return tu;
    }

    private static int UCLN(int a,int b){
        int r = a%b;
        while (r!=0){
            a=b;
            b=r;
            r=a%b;
        }
        return b;
    }

    public void Rutgon(){
        int t = UCLN(this.tu,this.mau);
        this.tu /= t;
        this.mau /= t;
    }

    public PhanSo Tong(PhanSo a, PhanSo b){
        PhanSo c = new PhanSo();
        c.tu = a.tu*b.mau + a.mau*b.tu;
        c.mau = a.mau*b.mau;
        return c;
    }
    public void Tong(PhanSo a){
        this.tu = a.tu*this.mau + this.tu*a.mau;
        this.mau = a.mau*this.mau;
    }

    public PhanSo Hieu(PhanSo a,PhanSo b){
        PhanSo c = new PhanSo();
        c.tu = a.tu*b.mau - a.mau*b.tu;
        c.mau = a.mau*b.mau;
        return c;
    }
    public void Hieu(PhanSo a){
        this.tu = a.tu*this.mau - this.tu*a.mau;
        this.mau = a.mau*this.mau;
    }

    public PhanSo Tich(PhanSo a,PhanSo b){
        PhanSo c = new PhanSo();
        c.tu = a.tu*b.tu;
        c.mau = a.mau*b.mau;
        return c;
    }
    public void Tich(PhanSo a){
        this.tu = a.tu*this.tu;
        this.mau = a.mau*this.mau;
    }

    public PhanSo Thuong(PhanSo a,PhanSo b){
        PhanSo c = new PhanSo();
        c.tu = a.tu*b.mau;
        c.mau = a.mau*b.tu;
        return c;
    }
    public void Thuong(PhanSo a){
        this.tu = a.mau*this.tu;
        this.mau = a.tu*this.mau;
    }

    @Override
    public String toString() {
        return "{" + this.tu +
                "/" + this.mau +
                '}';
    }
}
