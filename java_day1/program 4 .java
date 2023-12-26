 class java1{
    public static void main(String[] args) {
        int[] a = {10, 3, 5, 12, 17, 22};
        System.out.print("Even Array: ");
        for (int i=0;i<a.length;i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i]+ " ");
            }
        }
        System.out.println(); 
        System.out.print("Odd Array: ");
        for (int i=0;i<a.length;i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}