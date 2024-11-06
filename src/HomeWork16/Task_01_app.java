package HomeWork16;

public class Task_01_app {

    public static void main(String[] args) {
        Task_01 task_01 = new Task_01();
        System.out.println(task_01.toString());
        System.out.println(task_01.size());
        task_01.add(100);
        System.out.println("Добавление элемента: "+task_01.toString());
        System.out.println(task_01.size());
        task_01.addAll(200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 2000);
        System.out.println("Добавление нескольких элементов (в качестве аргументов передает последовательность значений): "+task_01.toString());
        System.out.println(task_01.size());
        System.out.println("Удаляет: "+task_01.remove(4));
        System.out.println(task_01.toString());
        System.out.println(task_01.size());
        int[] a = task_01.array;
        int[] b = task_01.array;

        System.out.println("====================");
        System.out.println("indexOf, числа нет в массиве: " + task_01.indexOf(a, 150));
        System.out.println("indexOf: " + task_01.indexOf(a, 300));

        System.out.println("====================");
        System.out.println("VarIndexOf: числа с таким индексом нет в массиве " + task_01.VarIndexOf(b, 20));
        System.out.println("VarIndexOf: " + task_01.VarIndexOf(b, 5));
        System.out.println("====================");
        System.out.println("(Удаляет элемент по значению) "+task_01.remove2(500));

    }
}
