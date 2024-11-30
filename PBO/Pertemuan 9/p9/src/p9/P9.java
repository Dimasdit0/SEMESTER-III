package p9;

public class P9 {
    public String NamaLengkap;
    public String Pendidikan;
    public String Status;
    public int ThnMasuk;
    
    public P9(String N, String P, String S, int T){
        this.NamaLengkap=N;
        this.Pendidikan=P;
        this.Status=S;
        this.ThnMasuk=T;
    }
    
    private int HitungMasaKerja(int T){
        return(2017-T);
    }
    public void ubah(String N){
        NamaLengkap=N;
    }
    public void ubah(String N, String P){
        NamaLengkap=N;
        Pendidikan=P;
    }
}

public class DemoKaryawan{
    public static void main(String[] args) {
        Karyawan k1= new Karyawan();
        Karyawan k2= new Karyawan("Ani Maya", "S1", "Kontrak", 2015);
    }
}
