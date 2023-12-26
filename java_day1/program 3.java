
import java.util.* ;
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a  number :");
    int n =sc.nextInt();
   
        int slow = n, fast = n;

        do {
            slow = sum(slow);
            fast = sum(sum(fast));
        } while (slow != fast);

        System.out.println(slow == 1);  
    }

    static int sum( int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
   
    }
}