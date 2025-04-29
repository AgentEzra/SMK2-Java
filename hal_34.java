import java.util.Scanner;

public class hal_34 {
    public static void main (String[] args )
    {
        String [] rantang;
        rantang = new String[4];

        Scanner input = new Scanner(System.in);

        for (int x = 0; x < 4; x++)
        {
            System.out.println("Isi Rantang : ");
            rantang[x] = input.nextLine();
        }

        for (int x = 0; x < 4; x++)
        {
            System.out.println(rantang[x]);
        }

        input.close();
    }
    
}
