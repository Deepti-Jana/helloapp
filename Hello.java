/**
 * @author Deepti Jana
 * @version 5.0
 *@since UC1
 */

public class Hello {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            System.out.print("Hello ");

            for (String name : args) {
                System.out.print(name + " ");
            }

            System.out.println();
        }
    }
}