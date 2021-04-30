/*Name:-Gadhavi Devi VinodBhai
Roll Number:-12008117
MCA Semester-1
Practical-20 */


class GenericsAlgo{
    public static <T extends Comparable<T>> T max(T... elements) {
    T max = elements[0];
    for (T element : elements) {
        if (element.compareTo(max) > 0) {
            max = element;
        }
    }
    return max;
}
    public static void main(String s[]) {
       System.out.println("Integer Max: " + max(Integer.valueOf(32), Integer.valueOf(56), Integer.valueOf(89), Integer.valueOf(3), Integer.valueOf(456), Integer.valueOf(78), Integer.valueOf(45)));
       System.out.println("Double Max: " + max(Double.valueOf(5.6), Double.valueOf(7.8), Double.valueOf(2.9), Double.valueOf(18.6), Double.valueOf(10.25), Double.valueOf(18.6001)));
       System.out.println("String Max: " + max("Strawberry", "Mango", "Apple", "Pomegranate", "Guava", "Blackberry", "Cherry", "Orange", "Date"));
       System.out.println("Character Max :" + max("J","A","V","A"));
   }
}