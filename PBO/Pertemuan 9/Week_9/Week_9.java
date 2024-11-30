package Week_9;

 class Karyawan {
    String NamaLengkap;
    String Pendidikan;
    String Status;
    int ThnMasuk;

    public Karyawan(){
        //Kosong Seperti Hati Saya
    }

    public Karyawan(String N, String P, String S, int T){
        this.NamaLengkap=N;
        this.Pendidikan=P;
        this.Pendidikan=P;
        this.Status=S;
        this.ThnMasuk=T;
    }

    public void ubah(String N){
        NamaLengkap=N;
    }

    public void ubah(String N, String P){
        NamaLengkap=N;
        Pendidikan=P;
    }
}
public class Week_9{

    public static void main(String[] args){
        Karyawan k1=new Karyawan();
        Karyawan k2=new Karyawan("Ani Maya", "S1", "Kontrak", 2015);
        System.out.println("Nama: "+ k2.NamaLengkap);
        k2.ubah("Sana");

        System.out.println("Nama: "+ k2.NamaLengkap);
        System.out.println("Pendidikan: "+ k2.Pendidikan);
        System.out.println("Status: "+ k2.Status);
        System.out.println("Tahun Masuk: "+ k2.ThnMasuk);

        k2.ubah("Mona", "S3");
        System.out.println("Nama: "+ k2.NamaLengkap);
        System.out.println("Pendidikan: "+ k2.Pendidikan);
        System.out.println("Status: "+ k2.Status);
        System.out.println("Tahun Masuk: "+ k2.ThnMasuk);

    }
}
