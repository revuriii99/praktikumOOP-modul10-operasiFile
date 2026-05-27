package nomorDua;

import java.io.File;

public class UkuranFile {
    public static void main(String[] args) {
        var file = new File("test.txt");
        var ukuranBytes = file.length();

        var satu_mb = 1024 * 1024;

        if (ukuranBytes < satu_mb) {
            var ukuranKB = (double) ukuranBytes / 1024;
            System.out.printf("Ukuran file: %.2f KB", ukuranKB);
        } else {
            var ukuranMB = (double) ukuranBytes / (1024 * 1024);
            System.out.printf("Ukuran file: %.2f MB", ukuranMB);
        }
    }
}
