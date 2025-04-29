public class hal_25 {
    public static void main(String[] args) {
        boolean hasil;

        System.out.println("\n--- Operator AND ---");
        hasil = true && true;
        System.out.println("true && true = " + hasil);

        hasil = false && false;
        System.out.println("false && false = " + hasil);

        hasil = true && false;
        System.out.println("true && false = " + hasil);

        System.out.println("\n--- Operator OR ---");
        hasil = true || true;
        System.out.println("true || true = " + hasil);

        hasil = false || false;
        System.out.println("false || false = " + hasil);

        hasil = true || false;
        System.out.println("true || false = " + hasil);
    }
}