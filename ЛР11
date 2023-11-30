import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class UdalenieDublirovaniya {
    public static void main(String[] args) {
        String inputFile = "input.txt"; // имя входного файла
        String outputFile = "output.txt"; // имя выходного файла

        Set<String> unikalnieStroki = new HashSet<>(); // множество для хранения уникальных строк
        int kolichestvoUdalennihStrok = 0; // счетчик удаленных строк

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String stroka;
            while ((stroka = reader.readLine()) != null) {
                if (unikalnieStroki.contains(stroka)) {
                    kolichestvoUdalennihStrok++; // увеличение счетчика удаленных строк
                } else {
                    unikalnieStroki.add(stroka); // добавление строки в множество
                    writer.write(stroka + "\n"); // запись строки в выходной файл
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Количество удаленных дублирующихся строк: " + kolichestvoUdalennihStrok);
    }
}
