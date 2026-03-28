package com.example;
import java.util.Scanner;

class Calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int result,op;
        System.out.print("Enter number 1:");
        int a1=sc.nextInt();
        System.out.print("Enter number 2:");
        int a2=sc.nextInt();

        System.out.print("Enter 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");
        op=sc.nextInt();

        if (op==1)
            result=add(a1,a2);
        else if (op==2)
            result=sub(a1,a2);
        else if (op==3)
            result=mul(a1,a2);
        else if (op==4)
            result=div(a1,a2);
        else{
            System.out.println("Invalid Input");
            sc.close();
            return;
        }
        System.out.println("Result = " + result);
        sc.close();

    }

   public static int add(int a,int b)
   {
    return a+b;
   }

    public static  int sub(int a,int b)
   {
    return a-b;
   }

    public static int mul(int a,int b)
   {
    return a*b;
   }

    public static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero not possible");
            return 0;
        }
        return a / b;
    }
    
}