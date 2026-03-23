/**
 * @author Deepti Jana
 * @version 3.0
 *@since UC1
 */

public class Hello {
    public static void main(String[] args) {
        String name="World"; //Default name

        if (args.length > 0) {
            name = args[0];
        } 
        System.out.println("Hello " + name+"!");
    }
}