a)

import java.util.* ;
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer :");
    int a =sc.nextInt();
    System.out.println("entered integer is :"+a);
    }
}


b)

import java.util.* ;
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two floating numbers :");
    float a =sc.nextFloat();
    float b =sc.nextFloat();
    float average=(a+b)/2;
    System.out.println("overall average is :"+average);
    }
}