// Which Java method is used to convert an object to string?
// ans toString()

class Person {
    String name;
    int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person { name='" + name + "',age='" + age + "}";
    }
}
public class ML1 {
    public static void main(String[] args) {
        Person p = new Person("Aman", 21);
        System.out.println(p.toString());
        System.out.println("person "+p);
    }   
}
