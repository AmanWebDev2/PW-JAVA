class Human { // Super class // Base class // Parent class
    int age;
    void sleep() {
        age = 18;
        System.out.println("Human need good sleep");
        System.out.println(age);
    }
}

class Student extends Human { // Child Class // Derived Class // Sub class

}

// process of acquiring properties and behaviour of other class is called inheritance

class L1 {
    public static void main(String[] args) {
        Student st = new Student();   
        st.sleep(); 
    }
}