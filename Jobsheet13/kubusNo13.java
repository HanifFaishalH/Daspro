package Jobsheet13;

public class kubusNo13 {

    private double sisi;

    public kubusNo13(double sisi) {
        this.sisi = sisi;
    
    }
    
    public double Volume() {
        double Volume = Math.pow(sisi, 3);
        return Volume;
    }

    public double LuasPer() {
        double LuasPer = 6 * Math.pow(sisi, 2);
        return LuasPer;
    }

    public static void main(String[] args) {
        double sisiKubus = 5.0;
        KubusNoAbsen kubus = new KubusNoAbsen(sisiKubus);

        double volumeKubus = kubus.hitungVolume();
        double luasPermukaanKubus = kubus.hitungLuasPermukaan();

        System.out.println("Volume kubus dengan sisi " + sisiKubus + " adalah: " + volumeKubus);
        System.out.println("Luas permukaan kubus dengan sisi " + sisiKubus + " adalah: " + luasPermukaanKubus);
    }
}
