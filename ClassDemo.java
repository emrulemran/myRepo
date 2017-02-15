package javabasics;

class Person{

    String name;
    int age;
}

public class ClassDemo{

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John Doe";
        person1.age = 23;


        Person person2 = new Person();
        person2.name = "Jane Dew";
        person2.age = 32;

        System.out.println(person1.name);
        System.out.println(person1.age);

        System.out.println(person2.name);
        System.out.println(person2.age);


    }

}