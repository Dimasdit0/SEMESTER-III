package Week_9;

public class KaryawanTetap extends Karyawan2 {
    private String NIP;
    private int JatahCuti;

    public KaryawanTetap(String N, String P, String S, int T){
        super(N,P,S,T);
        //this.NIP=NIP;
        //this.JatahCuti=JatahCuti;
    }

    public void setNIP(String nip){
        NIP=nip;
    }
    public String getNIP(){
        return NIP;
    }

    public double HitungTunjangan(int T){
        int MK= HitungMasaKerja(T);
        double Tunjangan;

        if(MK>=5)
        Tunjangan=2500000;
        else if(MK>=10)
        Tunjangan=5000000;
        else
        Tunjangan=10000000;

        return Tunjangan;
    }

    public void setJatahCuti(int jatahcuti){
        JatahCuti=jatahcuti;
    }

    public int TampilJatahCuti(){
        return JatahCuti;
    }

}
