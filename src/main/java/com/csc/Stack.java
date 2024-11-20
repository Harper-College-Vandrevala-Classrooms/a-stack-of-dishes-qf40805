package com.csc;

class Dish {
    private String name;

    public Dish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Stack<T> {
    private T[] stack;
    private int top;
    private int maxSize;

    @SuppressWarnings("unchecked")
    public Stack(int size) {
        this.maxSize = size;
        this.stack = (T[]) new Object[maxSize]; 
        this.top = -1; 
    }

    public void push(T item) {
        if (top >= maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + item);
            return;
        }
        stack[++top] = item;
        System.out.println("Pushed: " + item);
    }

    public T pop() {
        if (top < 0) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        T poppedItem = stack[top--];
        System.out.println("Popped: " + poppedItem);
        return poppedItem;
    }

    public T peek() {
        if (top < 0) {
            System.out.println("Stack is empty. Cannot peek.");
            return null;
        }
        return stack[top];
    }

    public int size() {
        return top + 1;
    }
}
