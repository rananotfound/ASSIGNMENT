package movie;

public class GenericArray 
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
        Integer array2[]={1,2,3,4,5,6,7,8,9,10,11,13,15};
        
        
        print(array1);
        System.out.println();
        print(array2);
    }
    
}
