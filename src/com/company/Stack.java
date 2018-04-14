package com.company;

import java.util.Arrays;

public class Stack {
    private int top;
    private Object[] data;
    private int max;

    Stack(int n) {
        this.data = new Object[n];
        this.top = -1;
        this.max = n;
    }

    Stack(Stack example){
        this.max = example.getMax();
        this.top = example.getTop();
        this.data = new Object[max];
        for (int i = 0; i < top; i++){
            data[i] = example.top();
            example.pop();
        }
    }

    void push(Object value) {
        try {
            data[++top] = value;
        } catch (Exception e) {
            System.out.println("OwerFlow " + e.toString());
        }
    }

    void pop() {
        try {
            top--;
        } catch (Exception e) {
            System.out.println("Unable to delete element in zero stack " + e.toString());
        }
    }

    String getData() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < top + 1; i++) {
            if (i == top)
                sb.append(data[i]);
            else
                sb.append(data[i]).append(", ");
        }
        return sb.toString();
    }

    boolean isFull() {
        return top == max - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    Object top(){
        return data[top];
    }

    int getMax(){
        return max;
    }

    int getTop(){
        return top;
    }
}
