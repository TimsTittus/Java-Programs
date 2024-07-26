public class PalindromeWithoutConsole
{
    public static void main(String[] args)
    {
        int i=0,n=121,store,r,s=0;
        store=n;
        while(i<n)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(store==s){
            System.out.println(store+" is a palindrome");
        }
        else
            System.out.println(store+" is not a palindrome");
    }
}