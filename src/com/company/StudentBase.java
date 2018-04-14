package com.company;

import java.util.Scanner;

public class StudentBase {
    private Stack base;
    private int size;
    private int cells;

    StudentBase(int size, int cells) {
        base = new Stack(size);
        this.size = size;
        this.cells = cells;
    }

    void fillKeyBoard() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("\tstudent " + i + 1);
            this.add();
        }
    }

    void add() {
        Scanner scanner = new Scanner(System.in);
        Stack student = new Stack(cells);
        for (int j = 0; j < cells; j++) {
            System.out.print("cell№" + (j + 1) + "\t");
            student.push(scanner.next());
        }
        base.push(student);
    }

    String getData() {
        StringBuilder sb = new StringBuilder();
        Stack temp = base;
        for (int i = 0; i < size; i++) {
            Stack tempStudent = (Stack) temp.top();
            sb.append("Student ").append(i + 1).append(": ").append(tempStudent.getData()).append("\n");
            temp.pop();
        }
        return sb.toString();
    }
}
