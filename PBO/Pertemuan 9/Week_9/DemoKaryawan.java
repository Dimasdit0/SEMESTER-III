package Week_9;

public class DemoKaryawan {
    public static void main(String[] args) {
        KaryawanTetap K1=new KaryawanTetap("Joni", "S1", "Kontrak", 2012);
        KaryawanTetap K2=new KaryawanTetap("Firman", "S2", "Tetap", 2009);

        System.err.println("Karyawan 1");
        System.out.println("Nama: "+ K1.NamaLengkap);
        System.out.println("Pendidikan: "+ K1.Pendidikan);
        System.out.println("Status: "+ K1.Status);
        System.out.println("Tahun Masuk: "+ K1.ThnMasuk);

        System.err.println("Karyawan 2");
        K2.setNIP("10767282");
        System.out.println("Nama: "+ K2.NamaLengkap);
        System.out.println("Pendidikan: "+ K2.Pendidikan);
        System.out.println("Status: "+ K2.Status);
        System.out.println("Tahun Masuk: "+ K2.ThnMasuk);
        System.out.println("NIP: "+ K2.getNIP());
        System.out.println("Gaji Pokok: "+ K2.GajiPokok("Tetap"));
    }

}
