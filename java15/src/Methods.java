public class Methods {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 19;
        person1.speak();
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "Alex";
        person2.age = 48;
        person2.speak();

    }
}

class Person {
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 1; i++) {
            System.out.println("My name is " + name + "." + " I'm " + age + " years old");
        }
    }

    void sayHello() {
        System.out.println("hi");
    }
}