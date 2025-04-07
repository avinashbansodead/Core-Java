package interview.coding_1;

public class SwapWithoutTemp 
{
    public static void main(String[] args) 
    {
        int x = 10;
        int y = 20;

        System.out.println("Before Swap:");
        System.out.println("x = " + x + ", y = " + y);

        // Swapping without a temp variable
        x = x + y; // x = 30
        y = x - y; // y = 10
        x = x - y; // x = 20

        System.out.println("After Swap (without temp):");
        System.out.println("x = " + x + ", y = " + y);
    }
}
