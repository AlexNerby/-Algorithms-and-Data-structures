package ru.algorithms.lesson4;

public class SimpleDeque {
    private User[] queue;
    private int maxSize; // максимальное количество элементов в очереди
    private int nElem;  // текущее количество элементов в очереди
    private int front;
    private int rear;

    public SimpleDeque(int maxSize) {
        this.maxSize = maxSize;
        queue = new User[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }

    public void putBack(User elem) {
        if (rear == maxSize - 1) {  // циклический перенос
            rear = -1;
        }

        queue[++rear] = elem;  //увеличение Rear и вставка
        nElem++;  // увеличение количества элементов в очереди
    }

    public void putFront(User elem) {

        if (front == 0) {  // циклический перенос
            front = maxSize - 1;
        }

        queue[--front] = elem;
        nElem++;  // увеличение количества элементов в очереди
    }

    public User pollFront() {
        User temp = queue[front]; // получаем первый элемент из очереди

        front++;
        if (front == maxSize) { // циклический перенос
            front = 0;
        }
        nElem--; // уменьшаем количество элементов в очереди
        return temp;
    }

    public User pollBack() {
        User temp = queue[rear--];

        if (rear == -1) { // циклический перенос
            rear = maxSize;
        }
        nElem--; // уменьшаем количество элементов в очереди
        return temp;
    }

    public boolean isFull() {
        return (nElem == maxSize - 1);
    }

    public boolean isEmpty() {
        return (nElem == 0);
    }

    public int getSize() {
        return nElem;
    }
}
