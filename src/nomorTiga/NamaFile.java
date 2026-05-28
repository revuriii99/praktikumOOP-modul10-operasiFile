package nomorTiga;

import java.io.File;

public class NamaFile {
    public static void main(String[] args) {
        var folder = new File("C:\\Users\\stefa\\Downloads\\CODING\\Intellij"); //sesuaikan dengan path folder user
        var daftarFile = folder.list();

        for (var i : daftarFile) {
            System.out.println(i);
        }
    }
}
