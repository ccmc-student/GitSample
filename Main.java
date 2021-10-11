public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello Japan!");
        System.out.println("Hello Java!");

        showArgs(args);
    }

    public static void showArgs(String[] args) {
        System.out.println("length: " + args.length);
        
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
