package lesson_17;

public class Cat {
    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    public void setName(String name){
        if(name == null || name.isEmpty()){
            System.out.println("NOT RIGHT NAME! ");
            return;
        }

        this.name = name;

    }

    public void setAge(int age){
        if (age >= 0 && age < 20) {
            this.age = age;
        }
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getWeight(){
        return weight;
    }

    public void eat(){
        System.out.println("Cat eating: ");
        weight++;
    }

   //private void test(){
   //    System.out.println("Test");
   //}

    public String toString(){
       // test();
        return  "Cat " + name + ", age " +  age + ", weight " + weight;
    }

}
