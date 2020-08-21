import javax.swing.JOptionPane;

public class konstanta {

    public static void main(String args[]) {

        // deklarasi konstanta
        final double PI = 3.14159;

        // deklarasi variabel jari-jari dan luas
        int jari2;
        double luas;

        // memberikan nilai awal ke variabel jari-jari
        jari2 = 7;

        // menghitung luaas lingkaran
        luas = PI * jari2 * jari2;

        // menampilkan hasil di kotak dialog
        JOptionPane.showMessageDialog(null, "Jari-jari lingkaran = " + jari2 + "\nLuas lingkaran =" + luas,
                "Menghitung Luas", JOptionPane.INFORMATION_MESSAGE);

        // mengakhiri program yang menampilkan GUI
        System.exit(0);
    }
}