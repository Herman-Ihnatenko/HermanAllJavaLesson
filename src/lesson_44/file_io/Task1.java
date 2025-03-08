package lesson_44.file_io;

import java.io.*;

public class Task1 {

    /*
    Выберите какуюто папку или создайте новую
    Создайте в папке 10 файлов с именами: test_1.txt...test_10.txt
    В каждый файл запишите соответствующею строку: Java1...Java10
     */

    public static void main(String[] args) {

        File folder = new File("test_folder");
        folder.mkdir();

        for (int i = 1; i <= 10; i++) {
            File file = new File(folder, "test_" + i + ".txt");
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
            }

            try (FileWriter writer = new FileWriter(file)) {
                writer.write("Java" + i);
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        }

        /*
        Нужно найти файл, внутри которого есть строка "Java7"
        Проверте в директории все файлы
        Вывести имя/имена файлов, содержавших "Java7"
         */

        File[] files = folder.listFiles();
        for (File file : files) {

            if (file.isFile()) {

                try(FileReader reader = new FileReader(file)) {
                    BufferedReader bufferedReader = new BufferedReader(reader);

                    String line = bufferedReader.readLine();

                    if (line != null && line.contains("Java7")) {
                        System.out.println("Файл найден: " + file.getName());
                    }


                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }

    }
}
