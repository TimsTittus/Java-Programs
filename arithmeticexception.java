import java.util.*;
class arithmeticexception{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("1.Arithmetic Exception");
        System.out.println("2.Array index out of bounds exception");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        
            switch(choice){
                case 1:
                    System.out.print("Enter number : ");
                    int n1 = sc.nextInt();
                    System.out.print("Enter number : ");
                    int n2 = sc.nextInt();
                    try{
                        int x=n1/n2;
                        System.out.println(x);
                    }
                    catch(ArithmeticException e){
                        System.out.println(e);
                    }
                    break;
                    
                case 2:
                    System.out.println("Enter the array size : ");
                    int n = sc.nextInt();
                    int a[] = new int[n];
                    
                    System.out.println("Enter the elements : ");
                    for(int i=0;i<n;i++){
                        a[i] = sc.nextInt();
                    }
                    System.out.println("Enter the index you want to see : ");
                    int pos = sc.nextInt();
                    try{
                        System.out.println(a[pos]);
                    }
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println(e);
                    }
                    break;
                    default:
                        System.out.println("Enter your choice :");
                        break;
            }
    }
}