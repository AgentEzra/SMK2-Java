public class hal_28 {
    public static void main(String[] args)
    {
        int nilaiUlangan = 99;

        if (nilaiUlangan >= 0 && nilaiUlangan <= 100)
        {
            if (nilaiUlangan > 75)
            {
                System.out.println("Diatas kkm");
            }
            else
            {
                System.out.println("dibawah kkm bot");
            }
        }
        else
        {
            System.out.println("Format jawaban error");
        }
    }
}