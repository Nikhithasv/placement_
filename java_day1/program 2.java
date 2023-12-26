
import java.util.* ;
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two numbers :");
    int a =sc.nextInt();
    int b =sc.nextInt();
    

    System.out.println("enter the operation need to be performed:");
    
    String op=sc.next();
    switch(op)
    {
        case "+":
            int add=a+b;
            System.out.print("added:"+add);
            break;
        case "-":
            int sub=a-b;
            System.out.print("subracted:"+sub);
            break;
        case "*":
            int mul=a*b;
            System.out.print("multiplied:"+mul);
            break;
        case "/":
            
             if(b==0)
    {
        System.out.print(" division cannot be performed ");
    }
    else
    {
            int div=a/b;
            System.out.print("divided:"+div);
            break;
    }
    
     default:
                System.out.println("Error: Invalid operator.");
                System.exit(1);
        
    }
   
    }
}