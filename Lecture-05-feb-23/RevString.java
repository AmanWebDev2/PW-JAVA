import java.sql.ResultSet;

class ReverseString {

    public String case1(String str) {
        // "pwJava" --> "avaJwp"
        // reverse for loop
        String resultStr = "";
        for(int i=str.length()-1; i>=0; i--) {
            resultStr = resultStr + str.charAt(i);
        };
        return resultStr;
    }

    public String case2(String str) {
        // "pwSkill java"  --> "java pwSkill"
        String resultStr = "";
        String[] strArr = str.split(" ");
        for(int i=strArr.length-1; i>=0; i--) {
            resultStr += strArr[i] + " ";
        }
        return resultStr;
    }

    public String case3(String str) {
        // "pwSkill Java"  -->  "avaJ llikSwp"
        // reverse loop;
        String ResultStr = "";
        for(int i=str.length()-1; i>=0; i--) {
            ResultStr+=str.charAt(i);
        }
        return ResultStr;
    }

    public String case4(String str) {
        // "pwSkill Java" --> "llikSpw avaJ";
        // enhanced for loop
        String resultStr = "";
        String[] strArr = str.split(" ");
        for(String elem:strArr) {
            // elem -> pwSkill 
            // elem -> Java
            for(int i=elem.length()-1; i>=0; i--) {
                resultStr += elem.charAt(i);
            }
            resultStr+=" ";
        }
        return resultStr;
    }
}


class RevString {
    public static void main(String[] args) {
        ReverseString rev = new ReverseString();
        String str1 = "pwJava";
        String str2 = "pwSkill Java";

        String res1 = rev.case1(str1);
        String res2 = rev.case2(str2);
        String res3 = rev.case3(str2);
        String res4 = rev.case4(str2);
        System.out.println(str1+"-->"+res1);
        System.out.println(str2+"-->"+res2);
        System.out.println(str2+"-->"+res3);
        System.out.println(str2+"-->"+res4);
    }
}