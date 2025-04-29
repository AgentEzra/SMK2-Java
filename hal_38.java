public class hal_38 {
    public static void main(String[] args) 
    {
        int t = 10;
        double volumeTabung;
        volumeTabung = luasLingkaran(3.5) * t;
        System.out.println(volumeTabung);
    }

    public static double luasLingkaran(double r)
    {
        double luas = 3.14 * r * r;
        return luas;
    }
}