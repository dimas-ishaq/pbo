package pbo2_java;

public class Main {
    public static void main(String[] args) {
        pesawatTelepon a = new pesawatTelepon();
        hewan b = new hewan();
        Manusia c = new Manusia();

        System.out.println("Manusia: ");
        System.out.println("Bermain: " + c.bermain("CSO, POINT BLANK"));
        System.out.println("Makan: " + c.makan("Gado - Gado"));
        c.tidur(true);
        System.out.println("Bekerja: " + c.bekerja("Karyawan"));
        System.out.println("Memasak: " + c.memasak("Makanan"));
        System.out.println("Mencuci: " + c.mencuci("Pakaian"));

        System.out.println("Hewan: ");
        System.out.println("Bermain: " + b.bermain("Lari - Lari"));
        System.out.println("Makan: " + b.makan("Daging"));
        b.tidur(true);

        System.out.println("Telepon: ");
        System.out.println("Menerima Panggilan: " + a.terimaPanggilan("Halo"));
        System.out.println("Melakukan Panggilan: " + a.melakukan_Panggilan("Hallo"));

    }

}
