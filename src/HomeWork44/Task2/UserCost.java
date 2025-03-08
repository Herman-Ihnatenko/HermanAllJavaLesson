package HomeWork44.Task2;

/*
Task 2
Дан файл с историей поступлений денег на счета пользователей за некий период времени:

    user1:2050
    user2:1200
    user1:1700
    user3:1800
    user1:1300
    user4:2100
    user2:750

Данные в виде: <имяПользователя>:<суммаПоступления>.

Ваше задание прочитать данные из файла и обработать их.

Результат обработки должен быть записан в два файла:

less.txt список тех, кому в сумме перечисленно меньше 2000
more.txt список тех, кому в сумме перечисленно 2000 и больше
Output:

less.txt

user2:1950
user3:1800

more.txt:

user1:5050
user4:2100
 */

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class UserCost {
    public static void main(String[] args) throws Exception {

        File mainFile = new File("src/HomeWork44/Task2/text.txt");
        File lessFile = new File("src/HomeWork44/Task2/less.txt");
        File moreFile = new File("src/HomeWork44/Task2/more.txt");

        createLessFile(mainFile, lessFile);
        createMoreFile(mainFile, moreFile);

        System.err.println("\n====================== Идет обработка файлов, пожалуйста подождите... ======================");
        Thread.sleep(2000);
        System.err.println("\n======================FirstFileWithPath======================");
        System.err.println("Запуск файла less.txt произошел успешно, спасибо за терпение: " + lessFile.getPath());
        System.err.println("\n======================NextFileWithPath======================");
        System.err.println("Запуск файла more.txt произошел успешно, спасибо за терпение: " + moreFile.getPath());

    }

    private static void createLessFile(File mainFile, File lessFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(mainFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(lessFile))) {
            String line;

            Map<String, Integer> balances = new HashMap<>();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                String user = parts[0];
                int amount = Integer.parseInt(parts[1]);
                balances.put(user, balances.getOrDefault(user, 0) + amount);
            }
            for (Map.Entry<String, Integer> entry : balances.entrySet()) {
                if (entry.getValue() < 2000) {
                    writer.write(entry.getKey() + ": " + entry.getValue());
                    writer.newLine();
                }
            }
        }
    }

    private static void createMoreFile(File mainFile, File moreFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(mainFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(moreFile))) {
            String line;
            Map<String, Integer> balances = new HashMap<>();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                String user = parts[0];
                int amount = Integer.parseInt(parts[1]);
                balances.put(user, balances.getOrDefault(user, 0) + amount);
            }
            for (Map.Entry<String, Integer> entry : balances.entrySet()) {
                if (entry.getValue() >= 2000) {
                    writer.write(entry.getKey() + ": " + entry.getValue());
                    writer.newLine();
                }
            }
        }
    }



}