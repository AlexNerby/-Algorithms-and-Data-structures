package ru.algorithms.lesson4;

public class SimpleStack {
    private int maxSize;
    private User[] stackArray;
    private int top;

    public SimpleStack(int m) {
        this.maxSize = m;
        stackArray = new User[maxSize];
        top = -1;
    }

    public void addElement(User element) {
        stackArray[++top] = element;
    }

    public User pollElement() {
        return stackArray[top--];
    }

    public User readTop() {
        return stackArray[top];

    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}