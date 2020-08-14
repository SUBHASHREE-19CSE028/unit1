/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit1;
import java.util.*;
/**
 *
 * @author INTEL
 */
public class question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a[]=new int[5];
        int i;
        System.out.println("Enter the imit:");
        int n=obj.nextInt();
        System.out.println("Enter array elements:");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
           
        }
        System.out.println("The array elements are:");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("The duplicate elements are:");
        for(i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                    System.out.println(a[j]);
            }
        }
        System.out.println("the even numbers are:");
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
                System.out.println(a[i]);
            
        }
        System.out.println("The odd numbers are:");
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
                System.out.println(a[i]);
        }
        System.out.println("the second largest number is:");
        int temp;
        for(i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
          {
             if(a[i]>a[j])
             {
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
             }
             
          }
        }
        System.out.println(a[n-2]);
    }
    
}
