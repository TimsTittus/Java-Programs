import java.util.*;

public class matrixmultiplication{
    public static void main(String[] args){
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of 1st matrix : ");
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.println("Enter the order of 2nd matrix : ");
        int r=sc.nextInt();
        int s=sc.nextInt();
        
        int a[][] = new int[p][q];
        int b[][] = new int[r][s];
        int c[][] = new int[p][s];
        
        System.out.println("Enter the elements in the 1st matrix : ");
        for(i=0;i<p;i++){
            for(j=0;j<q;j++){
                a[i][j]=sc.nextInt(); } }

        System.out.println("Enter the elements in the 2nd matrix : ");
        for(i=0;i<r;i++){
            for(j=0;j<s;j++){
                b[i][j]=sc.nextInt(); }}

        if(q!=r){
            System.out.println("Not Possible!");
        }
	else{      
        System.out.println("The product of matrix is : ");
        for(i=0;i<p;i++){
            for(j=0;j<s;j++){
                int prod=0;
                for(k=0;k<p;k++){
                    prod=prod+a[i][k]*b[k][j];
                    c[i][j]=prod;
                }
            System.out.println(c[i][j]+"\t"); }
        System.out.println();}
        }
    }
}