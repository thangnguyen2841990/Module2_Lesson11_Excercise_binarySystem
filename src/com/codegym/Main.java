package com.codegym;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        Stack<String> stackSoDu = new Stack<String>();
        System.out.println("Nhập 1 số nguyên dương từ bàn phím");
        int x = scanner.nextInt();
        while (x > 0) {
            int soDu = x % 2;
            System.out.println(soDu);
            stackSoDu.push(soDu + "");
            x = x / 2;
        }
        System.out.println("Số nhị phân là:");
        int n = stackSoDu.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stackSoDu.pop());
        }
    }
}
