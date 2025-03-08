package lesson_44.cats;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CatsWriterReader {

    public static void main(String[] args) {

        List<Cat> cats = List.of(
                new Cat("Cat", 9, true),
                new Cat("John", 2, true),
                new Cat("Maria", 7, false),
                new Cat("Boris", 4, true),
                new Cat("Catty", 2, false),
                new Cat("Manna", 6, false),
                new Cat("Sebastian Junior", 1, true
        ));

        File path = new File("src/lesson_44/cats/files");
        path.mkdirs();

        File file = new File(path, "cats.txt");

        writeCatsToFile(cats, file);

        List<Cat> newCats = readCatsFromFile(file);

        System.out.println("\n===================");
        newCats.forEach(System.out::println);

    }

    private static List<Cat> readCatsFromFile(File file) {

        List<Cat> cats = new ArrayList<>(List.of());

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;


            while ((line = bufferedReader.readLine()) != null) {
               Cat cat = parseCatFromStringLine(line);
               cats.add(cat);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return cats;
    }

    private static Cat parseCatFromStringLine(String line) {

        //System.out.println("line: " + line);
        String[] parts = line.split("\\|");
        //System.out.println("arrayElements: " + Arrays.toString(parts));

        return new Cat(parts[0], Integer.parseInt(parts[1]), Boolean.parseBoolean(parts[2]));
    }

    private static void writeCatsToFile(List<Cat> cats, File file) {

        if (file.exists()) file.delete();

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Cat cat : cats) {

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {

                String toWrite = cat.getName() + "|" + cat.getAge() + "|" + cat.isMale();
                bufferedWriter.write(toWrite);
                bufferedWriter.newLine();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Запись в файл завершена!");

    }
}
