/*Name:-Gadhavi Devi VinodBhai
Roll Number:-12008117
MCA Semester-1
Practical-19 */


class Generics{
    public static<E> void printArray(E[] elements)
    {
        for (E element : elements)
        {
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main (String s[]) {
        Integer[] intArray={10,20,30};
        Character[] charArray={'J','A','V','A'};
        System.out.println("Print Integer Array");
        printArray (intArray);
        System.out.println("Print CharacterAyyay");
        printArray(charArray);
    }
}