import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Kalkulator 2 Angka Aritmatika Java ---");
        System.out.println("Masukan Dua Angka Bebas");

        // Input two numbers
        System.out.print("\nInputkan Angka Pertama : ");
        double a1 = scanner.nextDouble();

        System.out.print("Inputkan Angka Kedua : ");
        double a2 = scanner.nextDouble();

        // Choose operation
        System.out.println("\nPilih Operator Aritmatika : (1-4)");
        System.out.println("1. Tambah (+)");
        System.out.println("2. Kurang (-)");
        System.out.println("3. Kali   (*)");
        System.out.println("4. Bagi   (/)");
        System.out.println("Operator Yang Anda Pilih : ");
        int choice = scanner.nextInt();

        double hasil = 0;

        switch (choice) {
            case 1:
                hasil = a1 + a2;
                System.out.println("\nHasil : " + a1 + " + " + a2 + " = " + hasil);
                break;
            case 2:
                hasil = a1 - a2;
                System.out.println("\nHasil : " + a1 + " - " + a2 + " = " + hasil);
                break;
            case 3:
                hasil = a1 * a2;
                System.out.println("\nHasil : " + a1 + " * " + a2 + " = " + hasil);
                break;
            case 4:
                if (a2 == 0) {
                    System.out.println("\nPembagian Dengan 0 Tidak Diperbolehkan");
                } else {
                    hasil = a1 / a2;
                    System.out.println("\nHasil : " + a1 + " / " + a2 + " = " + hasil);
                }
                break;
            default:
                System.out.println("\nPilih 1-4 Goblok, Jgn Yg Laen");
        }

        scanner.close();
    }
}