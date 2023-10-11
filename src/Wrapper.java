public class Wrapper {
    public static void main(String[] args) {
        String str = null, binaireString = null, hexaString = null, doubleString = null, caractereString = null;
        String s = null, strEntier = null;
        double d = 0;
        double doubleinString = 3.14;
        char newCaractere = 0;
        int entier = 0;

        System.out.println("La longuer de 'byte' est " + Byte.BYTES + " octet" + " (" + Byte.SIZE + " bits" + ");" + " son type est " + Byte.class.getTypeName());
        System.out.println("La longuer de 'short' est " + Short.BYTES + " octets" + " (" + Short.SIZE + " bits" + ");" + " son type est " + Short.class.getTypeName());
        System.out.println("La longuer de 'char' est " + Character.BYTES + " octets" + " (" + Character.SIZE + " bits" + ");" + " son type est " + Character.class.getTypeName());
        System.out.println("La longuer de 'int' est " + Integer.BYTES + " octets"+ " (" + Integer.SIZE + " bits" + ");" + " son type est " + Integer.class.getTypeName());
        System.out.println("La longuer de 'float' est " + Float.BYTES + " octets" + " (" + Float.SIZE + " bits" + ");" + " son type est " + Float.class.getTypeName());
        System.out.println("La longuer de 'long' est " + Long.BYTES + " octets" + " (" + Long.SIZE + " bits" + ");" + " son type est " + Long.class.getTypeName());
        System.out.println("La longuer de 'double' est " + Double.BYTES + " octets" + " (" + Double.SIZE + " bits" + ");" + " son type est " + Double.class.getTypeName());

        str = new String("  10.2  ");
        d = Double.parseDouble(str);
        Double d2 = Double.valueOf(str);

        System.out.println("La valeur avec 'parseDouble': " + d);
        System.out.print("La valeur avec 'valueOf': ");
        System.out.println(d2);

        System.out.println("La valeur de 12 de base 10 en binaire: " + Integer.toBinaryString(12));
        System.out.println("La valeur de 12 de base 10 en hexa: " + Integer.toHexString(12));

        doubleString = Double.toString(doubleinString);
        System.out.println(doubleString);

        newCaractere = '6';
        caractereString = Character.toString(newCaractere);
        System.out.println(caractereString);

        s = "300";
        System.out.println(Integer.parseInt(s));
        s = "100";
        System.out.println(Integer.parseInt(s));
        System.out.println(Integer.toBinaryString(Integer.parseInt(s)));

        entier = 20;
        strEntier = Integer.toString(entier);
        System.out.println(strEntier);
        System.out.println(Integer.toHexString(Integer.parseInt(Integer.toString(entier))));

        System.out.println(Integer.bitCount(255));
        System.out.println(Integer.bitCount(254));


        System.out.println(Integer.highestOneBit(1024));
        System.out.println(Integer.highestOneBit(1023));

        System.out.println(Integer.toBinaryString(328));

        System.out.println("Base 10\t\t\tHexa\t\t\tBinaire");
        for (int i = 0; i <= 20; i++) {
            if (i <= 1) {
                System.out.println("0" + i + "\t\t\t\t" + "0" + Integer.toHexString(i) + "\t\t\t\t" + "000000" + Integer.toBinaryString(i));
            }
            if (i == 2 || i == 3) {
                System.out.println("0" + i + "\t\t\t\t" + "0" + Integer.toHexString(i) + "\t\t\t\t" + "00000" + Integer.toBinaryString(i));
            }
            if (i <= 7 && i >= 4) {
                System.out.println("0" + i + "\t\t\t\t" + "0" + Integer.toHexString(i) + "\t\t\t\t" + "0000" + Integer.toBinaryString(i));
            }
            if (i <= 14 && i >= 8) {
                System.out.println("0" + i + "\t\t\t\t" + "0" + Integer.toHexString(i) + "\t\t\t\t" + "000" + Integer.toBinaryString(i));
            }
        }
    }
}
