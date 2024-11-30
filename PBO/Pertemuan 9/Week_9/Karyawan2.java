package Week_9;

public class Karyawan2 {
    String NamaLengkap;
    String Pendidikan;
    String Status;
    int ThnMasuk;

    public Karyawan2(String N, String P, String S, int T){
        this.NamaLengkap=N;
        this.Pendidikan=P;
        this.Status=S;
        this.ThnMasuk=T;
    }

    protected int HitungMasaKerja(int T){
        return (2017-T);
    }

    public double GajiPokok(String S){
        double GaPok=0;

        if(S.equals("Tetap"))
        GaPok=3500000;
        else if(S.equals("Kontrak"))
        GaPok=5000000;
        return GaPok;
    }

}
