package top.yxtong.java.basic.Switch;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        System.out.println("Enter year:(e.g.,2012):");
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        System.out.println("Enter month:1-12");
        int m=input.nextInt();
        System.out.println("Enter the day of the month:1-31");
        int q=input.nextInt();
        switch(m){
            case 1:
                m=13;
                year-=1;
                break;
            case 2:
                m=14;
                year=-1;
                break;
        }
        int j=year/100;
        int k=year%100;
        int h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
        switch(h){
            case 0 :System.out.println("Day of the week is Saturday"); break;
            case 1 :System.out.println("Day of the week is Sunday"); break;
            case 2 :System.out.println("Day of the week is Monday"); break;
            case 3 :System.out.println("Day of the week is Tuesday"); break;
            case 4 :System.out.println("Day of the week is Wednesday"); break;
            case 5 :System.out.println("Day of the week is Thursday"); break;
            case 6 :System.out.println("Day of the week is Friday"); break;

        }
    }
}
