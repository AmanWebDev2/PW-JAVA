// handling vs Duckling

class D {
    void a() throws Exception {
        this.b();
    }

    private void b() throws Exception {
        int num1 = 3;
        int num2 = 0;

        int res = num1/num2;
        System.out.println(res);
    }
}

public class ExceptionDemo5 {
    public static void main(String[] args) {
        D obj = new D();
        try {
            obj.a();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error "+e.getMessage());
        }
    }
}
