package nomorEmpat;

import java.io.File;

public class Delete {
    public static void main(String[] args) {
        var folder = new File("testFolder");

        var daftarFile = folder.listFiles();
        for (var i : daftarFile) {
            i.delete();
        }

        folder.delete();
    }
}
