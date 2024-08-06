package Aug05;

public class BlocksMain {
    static {
        System.out.println("static block will execute before main");
    }
    //Annonylous block
    {
        System.out.println("Annpnymous block will execute before constructor,");
    }
    public BlocksMain() {
        System.out.println("constructor will execute after creating an object");
    }
    public static void main(String[] args) {
        System.out.println("main");
    }
}
