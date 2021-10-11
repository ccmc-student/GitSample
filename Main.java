public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello Japan!");
        System.out.println("Hello Java!");

        showArgs(args);
    }

    public static void showArgs(String[] args) {
        System.out.println("length: " + args.length);
        
        for(String str : args) {
            System.out.println(str);
        }
    }
}
