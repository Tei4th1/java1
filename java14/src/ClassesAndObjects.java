public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 19;
        System.out.println("my name is " + person1.name + "." + " I,m " + person1.age + " old");

        Person person2 = new Person();
        person2.name = "Alex";
        person2.age = 48;
        System.out.println("my name is " + person2.name + "." + " I,m " + person2.age + " old");
    }
}

class Person {
    String name;
    int age;
}