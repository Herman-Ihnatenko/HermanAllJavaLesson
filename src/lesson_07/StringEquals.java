package lesson_07;

public class StringEquals {
    public static void main(String[] args) {

        int x = 10;
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "JAVA";

        System.out.println(str1 + "h" + str2 +"h"+ str3);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);

        System.out.println("========= Equals ================ ");
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));

        System.out.println(str1.equalsIgnoreCase(str4));

        //boolean b1 = str1 == str2;



        //boolean isEquals = str1.equals(str2);
        //System.out.println(isEquals);
        //System.out.println(str1.equals(str3));
        //System.out.println(str1.equals(str4));




    }
}
