package assignment2;

import java.util.Scanner;

class PalindromeExample {

    public static void main(String args[]){
        int r,sum=0,temp;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entert the Number ");
        int n=scanner.nextInt();//It is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}  