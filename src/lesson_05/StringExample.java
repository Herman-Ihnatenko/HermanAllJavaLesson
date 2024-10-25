package lesson_05;

public class StringExample {
    public static void main(String[] args) {
        String string = "привет";
        String string1 = new String("hello");
        System.out.println(string.toUpperCase());
//
        System.out.println(string);
//
        System.out.println(string.length());
//
        String string2 = string.toUpperCase();
        System.out.println(string2);
//
        string2 = string2.toLowerCase();
        System.out.println(string2);
//
        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";
//
        String concatStr = str1 + str2 + str3;
        System.out.println(concatStr);
//
        String concatStr2 = str1.concat(str2);
        concatStr2 = concatStr2.concat(str3);
        System.out.println(concatStr2);
//
        String contactStr4 = String.join(" ", str1, str3);
        System.out.println(contactStr4);
//
        int a = 1;
        String string3 = "hello";
        System.out.println(string3 + a);
//
        String digits = "0123456789";
        String digits2 = "9876543210";
        char firstChar = digits.charAt(0);
        System.out.println(firstChar);
        char firstChar2 = digits2.charAt(0);
        System.out.println(firstChar2);
//
        String subString = digits.substring(2);
        System.out.println(subString);
        System.out.println(digits);
//
        subString = digits.substring(2, 7);
        System.out.println(subString);

//
        String string4 = "AITHelloWorld,AIT";
        String replace = string4.replace("AIT", "32");
        System.out.println(replace);

        replace = string4.replaceFirst("AIT", "32");
        System.out.println(replace);


    }

}
