package lesson_09;

public class MethodsExample {
    public static void main(String[] args) {

        sayHello();
        sayHello();
        sayHello();


        String string = "Pair";

        System.out.println("=============\n");
        printChars(string);
        System.out.println("=============\n");
        printChars("Python!!!");

        System.out.println("=============\n");
        char ch = 'A';
        printDecimalCodeOfChar(ch);
        printDecimalCodeOfChar('d');
        printDecimalCodeOfChar('C');

        System.out.println("=============\n");
        int[] array = {1, 45, 76, 54, 89, 452, 0, 45};
        printArray(array);
        array[3] = 100001;
        array[0] = -100000000;
        printArray(array);

        int[] array2 = {1, 2, 3, 4, 681, 6544};
        printArray(array2);

        System.out.println("=============\n");

        String[] strings = {"Pair", "Python", "Hello", "World"};
        printArray(strings);
        System.out.println("=============\n");

        printNumbers(6);

        printNumbers(3, 8);

        printNumbers("Pair", 3);
        printNumbers(100, "Pair");
        System.out.println("=============\n");

        int temp = 55;
        changeMe(temp);
        System.out.println(temp);

        int[] arr = {1, 2, 3, 4, 5};
        changeMe(arr);
        printArray(arr);

        String java = "Pair";
        changeMe(java);
        System.out.println(java);
        






    }// метод area

    public static void changeMe(String str){
        str = str + "!!!";
    }
    public static void changeMe(int[] array){
        array[0] = 100000000;
    }
    public static void changeMe(int x){
        x = 100;
    }

    public static void  printNumbers(String str, int x){
        System.out.println("Option 2!!!");
    }

    public static void  printNumbers(int x, String str){
        System.out.println("Option 1!!!");
    }
    public static void printNumbers(int x, int y){
        int i = x;
        while (i <= y){
            System.out.print(i + ", ");
            i++;
        }
        System.out.println();
    }
    public static void printNumbers(int number){
        int i = 1;
        while (i <= number){
            System.out.println(i + ", ");
            i++;
        }
        System.out.println();
    }

    public static void printArray(String[] strings){
        System.out.print("[");
        int i = 0;
        while (i < strings.length){
            System.out.print(strings[i] + (i < strings.length -1 ? ", " : "]\n"));
            i++;
        }
    }

    public static void printArray(int[] array){
        System.out.print("[");
        int i = 0;
        while (i < array.length){
            System.out.print(array[i] + (i < array.length -1 ? ", " : "]\n"));
            i++;
        }
    }
    public static void printDecimalCodeOfChar(char ch){
        System.out.println((int) ch);
    }
    public static void printChars(String str){
        int i = 0;
        System.out.println(str);
        while (i < str.length()){
            char ch = str.charAt(i);
            System.out.println(ch);
            i++;
        }
    }
    public  static void sayHello(){
        //тело метода
        System.out.println("Hello, World!");

    }

}// End class
