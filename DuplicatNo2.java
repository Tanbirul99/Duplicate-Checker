import java.util.*;
public class DuplicatNo2 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner (System.in);
        System.out.println("please type the length");
        int n=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;){
            System.out.println("please type a number");
            int num=sc.nextInt();
            boolean boooool=true;
            for(int j=0;j<i;j++){
                if(a[j]==num){
                    boooool=false;
                    break;
                }
            }
            if(boooool==false){
                System.out.println("Duplicate found.please type another number");
            }
            if(boooool==true){
                a[i]=num;
                i++;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
}
        
