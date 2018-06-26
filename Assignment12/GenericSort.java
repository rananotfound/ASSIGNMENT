package movie;

import static java.util.Arrays.sort;

public class GenericSort 
{

    
    static <T> void print(T array[])
    {
        for (T var : array)
        {
            System.out.print(" "+var);
        }
    }
    
    public static void main(String args[])
    {
        Character array1[]={'A','S','H','U','T','O','S','H'};
        Integer array2[]={1,6,2,9,8,7,12,21,13,14};
        Double array3[]={2.3,4.3,5.2,4.8,1.9,2.6};
        
        System.out.println("Character Array before Sorting");
        print(array1);
        System.out.println("\nCharacter Array after Sorting");
        sort(array1);
        print(array1);
        
        
        System.out.println("\nInteger Array before Sorting");
        print(array2);
        System.out.println("\nInteger Array after Sorting");
        sort(array2);
        print(array2);
        
        System.out.println("\nDouble Array before Sorting");
        print(array3);
        System.out.println("\nDouble Array after Sorting");
        sort(array3);
        print(array3);
    }

    
}
