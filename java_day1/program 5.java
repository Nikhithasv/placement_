import java.util.Scanner;

class java1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder c1 = new StringBuilder();
        char curr1 = input.charAt(0);
        int cnt1 = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == curr1) {
                cnt1++;
            } else {
                c1.append(curr1);
                if (cnt1 > 1) {
                    c1.append(cnt1);
                }
                curr1 = input.charAt(i);
                cnt1 = 1;
            }
        }
        c1.append(curr1);
        if (cnt1 > 1) {
            c1.append(cnt1);
        }

        System.out.println("Input: " + input);
        System.out.println("Output: " + c1);
    }
}