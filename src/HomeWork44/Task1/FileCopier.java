package HomeWork44.Task1;

import java.io.*;

/*

Task 1
Дан файл text.txt:

    Lorem ipsum dolor sit amet, consectetur adipisicing.
    Lorem ipsum dolor sit amet.
    Lorem ipsum dolor sit amet, consectetur adipisicing elit.
    Lorem, ipsum dolor.
    Lorem ipsum dolor sit amet consectetur adipisicing elit. Officia.
    Lorem, ipsum.
    Lorem ipsum dolor sit amet consectetur adipisicing elit.
    Lorem ipsum dolor sit.
    Lorem ipsum dolor sit amet consectetur adipisicing elit. Nemo!

Ваша задача используя классы пакета java.io создать файл с именем 'copy.txt' и скопировать в него все данные из файла 'text.txt'

 */
public class FileCopier {
    public static void main(String[] args) {

        File mainFile = new File("src/HomeWork44/Task1/text.txt");
        File copy = new File("src/HomeWork44/Task1/copy.txt");


        try {
            BufferedReader reader = new BufferedReader(new FileReader(mainFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(copy));
            String line = reader.readLine();
            while (line != null) {
                writer.write(line);
                writer.newLine();
                line = reader.readLine();
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
