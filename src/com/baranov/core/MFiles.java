package com.baranov.core;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;

public class MFiles {
    private static final double THIRTY_PER0CENT = 0.3;

    /*
    4.1
        откройте текстовые файлы, чтобы вы могли читать файл по одной строке за раз.
        прочитайте каждую строку как строку и поместите этот строковый объект в связнный List.
        покрасьте все строки в связанном списке в обратном пор¤дке
     */

    public static void readAndInvert(String Path, String Source) {

        Path file_path = Paths.get(Path, Source);

        Charset charset = Charset.forName("ISO-8859-1");
        try {
            List<String> lines = Files.readAllLines(file_path, charset);

            for (int i = lines.size() - 1; i > -1; i--) {
                System.out.println(lines.get(i));
            }


        } catch (IOException e) {
//            System.out.println(e);
        }

    }
    /*
    4.2
        распечатать список файлов с расширением .txt в указанной папке
    */

    public static void printListFolder(String Path) {
        File myFolder = new File(Path);
        File[] files = myFolder.listFiles();
        assert files != null;
        for (File file : files) {
            if ((file.toString().charAt(file.toString().length() - 1) == 't') && (file.toString().charAt(file.toString().length() - 2) == 'x') && (file.toString().charAt(file.toString().length() - 3) == 't') && (file.toString().charAt(file.toString().length() - 4) == '.'))
                System.out.println(file);
        }

    }

    /*
    4.3
        Copy file
    */

    public static void CopyFile(String Path, String Source, String To) {
        Path file_path = Paths.get(Path, Source);

        Charset charset = Charset.forName("ISO-8859-1");
        try {
            List<String> lines = Files.readAllLines(file_path, charset);


            FileWriter writer = new FileWriter(To);

            for (String line : lines) {
                writer.write(line + System.getProperty("line.separator"));
            }
            writer.close();


        } catch (IOException e) {
            //System.out.println(e);
        }
    }

    /*
    4.4
        разделить один текстовый файл на два разных файла, имеющих 30 and seventy  процентов информации
    */

    public static void DifferentFiles(String Source, String R1, String R2) throws IOException {
        //разделить один текстовый файл на два разных файла, имеющих 30 и 70 процентов информации
        FileInputStream in = new FileInputStream(Source);
        byte[] array = new byte[in.available()];
        String text = new String(array);
        int count = 0;
        for (char ch : text.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                count++;
            }
        }

        int index = (int) (count * THIRTY_PER0CENT);


        try {

            FileWriter writer = new FileWriter(R1);

            for (int i = 0; i < index; i++) {
                writer.write(array[i]);
            }
            writer.close();

            FileWriter writer2 = new FileWriter(R2);

            for (int j = index; j < array.length; j++) {
                writer2.write(array[j]);
            }
            writer2.close();


        } catch (IOException e) {
            //System.out.println(e);
        }

    }

    /*
    4.5
        читать текстовый файл и записывать его в целевой текстовый файл, мен¤¤ все строчные
        буквы на верхний и двойной интервалы текста вывода
     */

    private static Character Upper(Character c) {
        Character result = '7';
        if (c == 'a') result = 'A';
        if (c == 'b') result = 'B';
        if (c == 'c') result = 'C';
        if (c == 'd') result = 'D';
        if (c == 'e') result = 'E';
        return result;
    }

    public static void EdditTextFile(String Source, String Result) throws IOException {
        FileInputStream in = new FileInputStream(Source);
        byte[] array = new byte[in.available()];
        String text = new String(array);
        StringBuilder rexultText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                rexultText.append(' ').append(' ');
            } else if (Upper(text.charAt(i)) != '7') {
                rexultText.append(Upper(text.charAt(i)));
            } else {
                rexultText.append(text.charAt(i));
            }
        }

        FileWriter writer = new FileWriter(Result);

        for (int i = 0; i < rexultText.length(); i++) {
            writer.write(rexultText.charAt(i));
        }
        writer.close();

    }
}
