class HelloWorld {

    public HelloWorld() {
        System.out.println("No-arguments constructor called");
    }

    public HelloWorld(String msg) {
        System.out.println("default string: " + msg);
    }

    public HelloWorld(String str, int num) {
        System.out.println("string : " + str + " and integer: " + num);
    }

    public static void main(String[] args) {
        HelloWorld obj1 = new HelloWorld();
        HelloWorld obj2 = new HelloWorld("javaprogramming");
        HelloWorld obj3 = new HelloWorld("javaprogramming", 14);
    }
}
