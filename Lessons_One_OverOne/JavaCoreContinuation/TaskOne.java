package JavaCoreContinuation;

import java.util.Scanner;

public class TaskOne {
  public void check(){
      Scanner scanner = new Scanner(System.in);
      int numberElements;
      do {
          System.out.println("enter the number of elements");
          numberElements = scanner.nextInt();
      } while (numberElements < 0 || numberElements == 0);
      int [] array = new int[numberElements];


      for (int i = 0; i < array.length; i++) {
          System.out.println("enter one array element");
          array[i]= scanner.nextInt();

      }
      scanner.close();
          for (int j = 1; j < array.length; j++) {
              if (array[j]>array[j-1]){
                  System.out.println("This element is greater than the previous element " + array[j]);
              }

          }





      }

  }

