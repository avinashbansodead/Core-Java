package interview.coding_1;

public class SwapWithTemp
{
    public static void main(String[] args) 
    {
        int x = 10;
        int y = 20;

        System.out.println("Before Swap:");
        System.out.println("x = " + x + ", y = " + y);

        // Swapping using a temp variable
        int temp = x;
        x = y;
        y = temp;

        System.out.println("After Swap (with temp):");
        System.out.println("x = " + x + ", y = " + y);
    }
}

