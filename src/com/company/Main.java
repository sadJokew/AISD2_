package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Main().run();
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        int n, s;
        System.out.println("cells: ");
        n = scanner.nextInt();
        System.out.println("count: ");
        s = scanner.nextInt();
        StudentBase base = new StudentBase(s, n);
        base.fillKeyBoard();
        System.out.println(base.getData());
    }
}
