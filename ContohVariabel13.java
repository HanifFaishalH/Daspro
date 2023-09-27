public class ContohVariabel13 {
    public static void main(String[] args) {
        String SalahSatuHobiSayaAdalah = "bermain petak umpet";
        boolean IsPandai = true;
        char JenisKelamin = 'L';
        byte UmurSayaSekarang = 20;
        double IPK =3.24, Tinggi = 1.78;
        
        System.out.println("salah satu hoby saya adalah " + SalahSatuHobiSayaAdalah);
        System.out.println("Apakah saya pandai? " + IsPandai);
        System.out.println("jenis kelamin : " + JenisKelamin);
        System.out.println("umurku saat ini : " + UmurSayaSekarang);
        System.out.println(String.format("saya berIPK %s, dengan tinggi badan %s", IPK, Tinggi ));
    }
}