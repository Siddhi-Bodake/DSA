
public class asum {
    public static void main(String args[]) {
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15 };
        int sum = 0;
        for (int i : ar)
            sum = sum + i;
        System.out.println("The sum of the given array is : " + sum);

    }
}
