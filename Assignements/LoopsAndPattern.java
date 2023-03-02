class Pattern {
    int n = 11;
    void patternA() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if( i==(n-1)/4 && j>(n-1)/4 && j<(3*(n-1))/4 || i+j == (n-1)/2 || j-i == (n-1)/2) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void PatternB() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(
                    j==0 ||
                    i==0 && j<(n-1)/2 || 
                    i==(n-1) && j<(n-1)/2 ||
                    j==(n-1)/2 && (i < (n-1)/2 && i>0 || i>(n-1)/2 && i<n-1 )||
                    i==(n-1)/2 && j<(n-1)/2
                ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void patternC() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(
                    j==0 && i>0 && i<(n-1) ||
                    i==0 && j>0 && j<n-1||
                    i== n-1 && j>0 && j<n-1
                ) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void patternD() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(
                    j==0 ||
                    i==0 && j<(n-1)/2 ||
                    i==(n-1) && j<(n-1)/2 ||
                    j==(n-1)/2 && i>0 && i<(n-1)
                ) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void PatternE() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(
                    j==0 || 
                    i==0 ||i==(n-1) || i==(n-1)/2
                ) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void patternF() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(
                    j==0 ||
                    i==0 || i==(n-1)/2
                ) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void patternG() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(
                    i==0 && j>0 ||
                    i==(n-1) && j>0 && j<=(n-1)/2 ||
                    j==0 && i>0 && i<(n-1) ||
                    j==(n-1)/2 && i>=(n-1)/2 ||
                    i==(n-1)/2 && j>=(n-1)/2 ||
                    j==(n-1) && i>=(n-1)/2
                ) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void patternH() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(
                    j==0 || j==(n-1)||
                    i==(n-1)/2
                ) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void triangle() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(
                    i+j ==(n-1)/2 ||
                    j-i ==(n-1)/2 ||
                    i==(n-1)/2
                ) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    void triangle2() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(
                    i==j && j<=(n-1)/2 ||
                    i+j == (n-1) && j<=(n-1)/2 ||
                    j==0
                ) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void PWSKILLS(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(
                    j==0||
                    i==0 && j<(n-1)/2||
                    i==(n-1)/2 && j<(n-1)/2 ||
                    j==(n-1)/2 && i>0 && i<(n-1)/2
                ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            
            System.out.println();
            
        }
    }

    void Q3Pattern() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(
                    i==0 || i==(n-1) || 
                    j==0 || j==(n-1) ||
                    i+j <= (n-1)/2 ||
                    j-i >= (n-1)/2
                ) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class LoopsAndPattern {
    
    public static void main(String[] args) {
        Pattern p = new Pattern();
        // p.patternA();
        // p.PatternB();
        // p.patternC();
        // p.patternD();
        // p.PatternE();
        // p.patternF();
        // p.patternH();
        // p.patternG();
        // p.triangle();
        // p.triangle2();
        // p.PWSKILLS();  //pending
        p.Q3Pattern();
    }
    
}
