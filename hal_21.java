import java.util.*; // Untuk mengimpor kelas Scanner

public class hal_21 {
    public static void main(String[] args) {
        String nama;
        String kelas;
        int umur;
        String alamat;
        boolean kondisi;

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Perkenalan diri ---");
        System.out.print("Siapa Nama Mu? ");
        nama = input.nextLine();
        
        System.out.print("Sekarang Anda Kelas Berapa? ");
        kelas = input.nextLine();
        
        System.out.print("Berapa Usia Anda Sekarang? ");
        umur = input.nextInt();
        input.nextLine(); 
        
        System.out.print("Dimana Tempat Tinggal Mu? ");
        alamat = input.nextLine();
        
        System.out.print("Apakah Anda Waras? (True/False) ");
        kondisi = input.nextBoolean();
        
        System.out.println("\n--- Hasil Perkenalan Diri ---");
        System.out.println("Halo, nama saya " + nama + ".");
        System.out.println("Saya duduk di kelas " + kelas + ".");
        System.out.println("Saat ini, saya berusia " + umur + " tahun.");
        System.out.println("Saya tinggal di " + alamat + ".");
        System.out.println("Kondisi Mental Mu Saat Ini : " + (kondisi ? "Waras" : "Tidak Waras") + ".");

        input.close();
    }
}
