import java.util.Scanner;

public class RemoveDuplicatesInPlace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        if (size == 0) {
            System.out.println("0");
        } else {
            int count = 1; 
            for (int i = 1; i < size; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[count] = nums[i];
                   count++;
                }
            }

            System.out.println(count);
           
        }
    }
}
