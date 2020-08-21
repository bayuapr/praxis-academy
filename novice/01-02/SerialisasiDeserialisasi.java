import java.io.FileOutputStream;

class Demo implements java.io.Serializable {
    public int a;
    public String b;

    public Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }
}

class SerialisasiDeserialisasi {

    public static void main(String args[] ){
        Demo object = new Demo (1, "geeksforgeeks");
        String filename = "file.ser";

        //Sentrialization
        try
        {
            //menyimpan objek yang ada didalam file
            FileOutputStream file = new FileOutputStream(filename);
        }
    }
}