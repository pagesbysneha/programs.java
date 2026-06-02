public class command_line_arguments {
    public static void main(String[] args) {
        // args is an array of strings passed from the command line
        System.out.println("Number of arguments: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}