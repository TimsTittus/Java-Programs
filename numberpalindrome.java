import java.util.*;

public class numberpalindrome {
    public static void main(String[] args){
        int i=0,num,rem,rev=0,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        num = sc.nextInt();
        temp=num;
        while(i<num){
            rem=num%10;
            num=num/10;
            rev=(rev*10)+rem;
        }
        if(temp==rev){
            System.out.println(temp+" is a palindrome");
        }
        else {
            System.out.println(temp+" is not a palindrome");
        }
    }
}