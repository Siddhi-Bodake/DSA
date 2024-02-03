import java.util.Arrays;

public class Demo {
    public static void main(String args[]) {
        int[] My_array1 = {
                1789, 2456, 4869, 9842, 3858, 3656, 8924
        };
        String[] My_array2 = {
                "JAVA", "C++", "Python", "Rust", "PHP"
        };

        System.out.println("Original numeric array : " + Arrays.toString(My_array1));
        Arrays.sort(My_array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(My_array1));

        System.out.println("Original string array : " + Arrays.toString(My_array2));
        Arrays.sort(My_array2);
        System.out.println("Sorted string array : " + Arrays.toString(My_array2));

    }
}