class Employee {
    private int empId;
    private String name;

    public Employee(String name,int empId) {
        this.name = name;
        this.empId = empId;
    }

    public String toString() {
        return empId + "";
    }

    public void finalize() {
        System.out.println("clean up work by GC before de allocating memory from heap");
    }
}

public class HashMap_vs_WeakHashMap {
    public static void main(String[] args) {
        Employee e = new Employee("Aman",123);

        e = null; // eligible for garbage collection

        System.gc(); //invoke garbage collector
        // gc internally takes help from finalize method to deallocate memory from heap

        System.out.println(e);

        System.out.println("last line");
    }    
}
