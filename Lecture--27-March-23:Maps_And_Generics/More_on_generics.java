import java.util.*;

class Gen<T> {
    private T obj;

    public Gen(T obj) {
        this.obj = obj;
    }

    void disp() {
        System.out.println("The type is: "+ obj.getClass().getName());
    }
}

public class More_on_generics {
    public static void main(String[] args) {
        Gen<Integer> g1 = new Gen<Integer>(10);
        g1.disp();
        Gen<String> g2 = new Gen<String>("10");
        g2.disp();

        // ****************************
        // parent type reference is allowed
        ArrayList<String> al = new ArrayList<String>();
        List<String> al2 = new ArrayList<String>();
        Collection<String> al3 = new ArrayList<String>();
        // **********ERROR**************
        // ArrayList<int> al4 = new ArrayList<int>();
        // type parent not allowed
        // List<Object> al5 = new ArrayList<Integer>(); 
        
    }
}
