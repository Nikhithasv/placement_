import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        
        //int [] a={22,23,23};
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int count=1;
        for(int i=0;i<a.length-1;i++)
        {
            
            if(a[i]!=a[i+1])
            {
                count++;
            }
        }
        System.out.print("count:"+count);
    }
}
