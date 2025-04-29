public class hal_39 {
    public static void main(String[] args) {
        System.out.println(periksaTanggal(35));
    }

    public static boolean periksaTanggal(int t)
    {
        boolean hasil;

        if (t < 1 || t > 31)
        {
            hasil = false;
        }
        else 
        {
            hasil = true;
        }
        return hasil;
    }
    
}
