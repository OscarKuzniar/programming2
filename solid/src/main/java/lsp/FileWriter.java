package lsp;

import java.io.File;

public class FileWriter {


    public void rewriteFile(Data data) {
        File file;
        if (data.getType().equals("PDF")) {
            file = new File("/someUrl");
            saveAsPdf(file, data.getData());
        } else if (data.getType().equals("DOC")) {
            file = new File("someUrl");
            saveAsDoc(file, data.getData());

        }
    }

    void saveAsPdf(File file, byte[] data) {
        System.out.println("saving file as pdf");
    }

    void saveAsDoc(File file, byte[] data) {
        System.out.println("saving file as doc");
    }
}
