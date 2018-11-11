import java.util.*;
class genArray
{
  public static <Arr> void printArray(Arr[] inputArray)
  {
    for (Arr element : inputArray)
      System.out.printf("%s ", element);

    System.out.println();
  }

  public static void main(String args[])
  {
    Integer[] integerArray = { 11, 12, 13, 14, 15, 16 };
    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
    Character[] characterArray = { 'C', 'H', 'I', 'T', 'K', 'A', 'R', 'A'};

    System.out.println("Array integer Array contains:");
    printArray(integerArray);
    System.out.println("\nArray double Array contains:");
    printArray(doubleArray);
    System.out.println("\nArray character Array contains:");
    printArray(characterArray);
  }
}