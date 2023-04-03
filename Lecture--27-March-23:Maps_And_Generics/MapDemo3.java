import java.util.*;
import java.util.Map.Entry;
class Student {
    private String name;
    private String city;
    private int age;

    public Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    String getName() {
        return name;
    }
    
    int getAge() {
        return age;
    }

    String getCity() {
        return city;
    }

    // we can override toSting method which is in Object class
    public String toSting() {
        return name+" "+age+" "+city;
    }

}

public class MapDemo3 {
    public static void main(String[] args) {
        Student st1 = new Student("aman",21,"Dehradun");
        Student st2 = new Student("biswas",26,"Dehradun");
        Student st3 = new Student("jagjeet",21,"Rajasthan");

        Map hm = new HashMap();
        hm.put(1,st1);
        hm.put(2,st2);
        hm.put(3,st3);

        Set entrySet = hm.entrySet();
        Iterator itr = entrySet.iterator();
        while(itr.hasNext()) {
            Map.Entry data = (Entry)itr.next();
            System.out.println(data.getKey()+" "+data.getValue());
        }

        System.out.println(hm);
        
    }
}
