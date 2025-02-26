import java.util.Scanner;

public class hal_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nInputkan Angka Pertama : ");
        double bil1 = scanner.nextDouble();

        System.out.print("Inputkan Angka Kedua : ");
        double bil2 = scanner.nextDouble();
        boolean hasil;

        // Semua operator sekarang menggunakan bil1 dan bil2
        hasil = bil1 == bil2;
        System.out.println(bil1 + " == " + bil2 + " : " + hasil + "  # Operator Kesamaan");

        hasil = bil1 != bil2;  // Diubah dari 5 != 6
        System.out.println(bil1 + " != " + bil2 + " : " + hasil + "  # Operator Ketidaksamaan");

        hasil = bil1 < bil2;   // Diubah dari 5 < 6
        System.out.println(bil1 + " < " + bil2 + " : " + hasil + "  # Operator Kurang Dari");

        hasil = bil1 > bil2;   // Diubah dari 5 > 6
        System.out.println(bil1 + " > " + bil2 + " : " + hasil + "  # Operator Lebih Dari");

        hasil = bil1 <= bil2;  // Diubah dari 5 <= 6
        System.out.println(bil1 + " <= " + bil2 + " : " + hasil + "  # Operator Kurang Dari atau Sama Dengan");

        hasil = bil1 >= bil2;  // Diubah dari 5 >= 6
        System.out.println(bil1 + " >= " + bil2 + " : " + hasil + "  # Operator Lebih Dari atau Sama Dengan");

        scanner.close();
    }
}