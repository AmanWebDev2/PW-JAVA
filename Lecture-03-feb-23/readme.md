# String Lecture. L-01
- Collection of character that are enclosed in double quotes.
- String -> Object -> Memory Allocation is in Heap.
- if type name start with a capital letter then it is a class, therefore String is a Class that provide many methods.
- Any package we can use without importing then we can consider that package exists inside java.lang.

# Types of String. L-02

## Immutable String (non-changable)
- String.
```
String str1 = "Aman";
str.concat("Dev"); 
System.out.println(str1); // Aman
```
## Mutable String (changable)
- String Buffer.
- String Builder.
```
StringBuilder str2 - new StringBuilder("Aman");
str2.append("DEV");
System.out.println(str2); // AmanDEV
```

# Immutable String and Heap Memory. L-03
### Difference b/w normal and new String()

- If declaration of a string starts without `new` keyword, then memory allocate inside `String Constant Pool` area which is inside heap.
- If not without new Keyword, then memory allocation is outside the `SCP` region.
```
String s1 = "Aman";
String s2 = new String("Rahul");
```
![](./img/ImmutableString.png)

> Example 2
```
String s1 = "Aman";
String s2 = "Aman";

String s3 = new String("AmanDev");
String s4 = new String("AmanDev");

```
![](./img/StringExample.png)

* A copy of s3 and s4 will be generated inside `SCP`, JVM handles it.
* garbage collector will not collect anything inside `SCP`.

### Reference Compare ( == )
```
s1 == s2 // true
s3 == s4 // false
```