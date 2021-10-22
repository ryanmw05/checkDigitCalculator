package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] barcode = new int[13];
        int[] evenNums = new int[6];
        int[] oddNums = new int[6];
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < 13; i++) {
            if (i == 12) {
                System.out.println("Input the check digit");
                int barNum = input.nextInt();
                barcode[i] = barNum;
            } else {
                System.out.println("Input number " + (i + 1) + " in barcode:");
                int barNum = input.nextInt();
                barcode[i] = barNum;
                int modulus = i % 2;
                if(modulus == 1){
                    System.out.println("Even");
                    evenNums[evenCount] = barNum;
                    evenCount = evenCount + 1;
                }
                else{
                    System.out.println("Odd");
                    oddNums[oddCount] = barNum;
                    oddCount = oddCount + 1;
                }
            }
        }
        int addNumEven = evenNums[0] + evenNums[1] + evenNums[2] + evenNums[3] + evenNums[4] + evenNums[5];
        addNumEven = addNumEven * 3;
        int addNumOdd = oddNums[0] + oddNums[1] + oddNums[2] + oddNums[3] + oddNums[4] + oddNums[5];
        int answer = addNumEven + addNumOdd + barcode[12];
        System.out.println(answer);
    }
}
