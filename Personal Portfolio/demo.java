// import java.lang.reflect.Array;


public class demo
{
    public static void main(String[] args) {
        int i , j, k=0;
        i=5;
        j=0;
        int arr[] = {1 , 2, 9,2 ,4,2};  
        
        int k1;     
        try
        {
            k=i/j;
           
            k1 = arr[9];
        }
        catch(Exception e){
            System.out.println(e);
        }
        catch( ArithmeticException e){
            System.out.println(e);
        }

        
    }
}