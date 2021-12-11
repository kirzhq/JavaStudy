package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        int multiple = scan.nextInt();
        int sum = 0;
        for (int i = start; i < end; i++){
            start++;
            if (start%multiple == 0) {
                sum = sum + start;
            }
            continue;
        }
        System.out.println(sum);
    }
}
