
/**
 * Date package are present in util and sql package
 * javap java.util.<class_name> to get the all method and return type of that class
 * until java 1.7V classes present in java ( like Calendar, Date, Timezone etc) are not up to the mark with respect to performance.
 * java introduced Joda-Time api in java 8 which is present in java.time package ( efficient , good performance )
 * API organised by Joda.org
 */
public class Date_Time_Demo1 {
    public static void main(String[] args) {
    // we can also import like this 
    java.util.ArrayList al = new java.util.ArrayList();

    java.util.Date dt = new java.util.Date();
    System.out.println(dt); // Tue Apr 04 22:04:21 IST 2023
    // System.out.println(dt.getTime());
    long timeInMS = dt.getTime();
    System.out.println(timeInMS);

    java.sql.Date dt2 = new java.sql.Date(timeInMS); // must pass value in constructor
    System.out.println(dt2); // 2023-04-04

    }
}
