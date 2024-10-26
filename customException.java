import java.util.*;

class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);
    }
}
public class CustomExceptionAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        
        try {
            if(age<18) {
                throw new AgeException("You cannot vote !");
            }
            else {
                System.out.println("You can vote !");
            }
        }
        catch(AgeException e) {
                System.out.println(e.getMessage());
            }
        }
}