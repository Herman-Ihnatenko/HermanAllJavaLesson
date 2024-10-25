package lesson_06;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = new String("Java");

        System.out.println(str1 + "h" + str2 +"h"+ str3+ "h" +str4);

        boolean b1 = str1 == str2;
        System.out.println(str1 == str4);

        boolean isEquals = str1.equals(str2);
        System.out.println(isEquals);
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));

        System.out.println(str1.equalsIgnoreCase(str4));


    }
}
