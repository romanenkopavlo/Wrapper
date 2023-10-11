public class Wrapper {
    public static void main(String[] args) {
        System.out.println("Base 10\t\tHexa\t\tBinaire");
        for (int i = 0; i <= 20; i++) {
            if (i < 10) {
                if (i < 2) {
                    System.out.println("0" + i + "\t\t\t" + "0" + Integer.toHexString(i) + "\t\t\t" + "0000" + Integer.toBinaryString(i));
                } else if (i < 4) {
                    System.out.println("0" + i + "\t\t\t" + "0" + Integer.toHexString(i) + "\t\t\t" + "000" + Integer.toBinaryString(i));
                } else if (i < 8) {
                    System.out.println("0" + i + "\t\t\t" + "0" + Integer.toHexString(i) + "\t\t\t" + "00" + Integer.toBinaryString(i));
                } else {
                    System.out.println("0" + i + "\t\t\t" + "0" + Integer.toHexString(i) + "\t\t\t" + "0" + Integer.toBinaryString(i));
                }
            } else if (i < 16) {
                System.out.println(i + "\t\t\t" + "0" + Integer.toHexString(i) + "\t\t\t" + "0" + Integer.toBinaryString(i));
            } else {
                System.out.println(i + "\t\t\t" + Integer.toHexString(i) + "\t\t\t" + Integer.toBinaryString(i));
            }
        }
    }
}