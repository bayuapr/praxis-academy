import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Demo implements java.io.Serializable {
    public int a;
    public String b;

    public Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }
}

class SerialisasiDeserialisasi {

    public static void main(String args[]) {
        Demo object = new Demo(1, "geeksforgeeks");
        String filename = "file.ser";

        // Sentrialization
        try {
            // menyimpan objek yang ada didalam file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // method untuk serialisasi
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object hes been serialized");
        }

        catch (IOException ex) {
            System.out.println("IOException is caught");
        }
        Demo object1 = null;

        // Deserialization
        try {
            // membaca objek yang ada dari file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // method untuk Deserialisasi
            object1 = (Demo) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        }

        catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}