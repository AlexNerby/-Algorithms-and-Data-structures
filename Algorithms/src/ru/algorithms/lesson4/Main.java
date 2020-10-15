package ru.algorithms.lesson4;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        long startTime;
        long endTime;
        /*
        Задание 4.1
        На основе данных объектного списка из задания 3.4 реализуйте простой стек и его базовые методы.
        Оцените время выполнения операций с помощью базового метода System.nanoTime().
        */
        SimpleStack simpleStack = new SimpleStack(10);
        System.out.println("SimpleStack:");

        startTime = System.nanoTime();
        simpleStack.addElement(new User("Jack"));
        endTime = System.nanoTime();
        simpleStack.addElement(new User("Mike"));
        simpleStack.addElement(new User("Max"));

        System.out.println("Время на добавление элемента в стек: " + (endTime - startTime));
        System.out.println(simpleStack.pollElement().toString() + "\n");

        /*
        Задание 4.2
        На основе данных объектного списка из задания 3.4 реализуйте простую очередь и его базовые методы.
        Реализуйте вспомогательные методы.
        Оцените время выполнения операций с помощью базового метода System.nanoTime().
         */
        SimpleQue simpleQue = new SimpleQue(10);
        System.out.println("SimpleQue:");

        startTime = System.nanoTime();
        simpleQue.insert(new User("Jack"));
        endTime = System.nanoTime();
        simpleQue.insert(new User("Mike"));
        simpleStack.addElement(new User("Max"));

        System.out.println("Время на добавление элемента в очередь: " + (endTime - startTime));
        System.out.println(simpleQue.remove().toString() + "\n");

        /*
        Задание 4.3
        На основе данных объектного списка из задания 3.4 реализуйте простой дек и его базовые методы.
        Оцените время выполнения операций с помощью базового метода System.nanoTime().
         */
        SimpleDeque simpleDeque = new SimpleDeque(3);

        startTime = System.nanoTime();
        simpleDeque.putFront(new User("One"));
        endTime = System.nanoTime();
        System.out.println("Время на добавление элемента в дек: " + (endTime - startTime));

        simpleDeque.putBack(new User("Two"));
        System.out.println("pollFront: " + simpleDeque.pollFront().toString());
        System.out.println("getSize: " + simpleDeque.getSize());

        simpleDeque.putBack(new User("Three"));
        simpleDeque.putBack(new User("Fore"));
        System.out.println("pollFront last: " + simpleDeque.pollFront().toString());
        System.out.println("getSize last: " + simpleDeque.getSize() + "\n");

        /*
        Задание 4.4
        Реализуйте приоритетную очередь на основе ссылочных типов данных, например, integer.
        Оцените время выполнения операций с помощью базового метода System.nanoTime().
         */
        PriorityQue priorityQueue = new PriorityQue(10);
        System.out.println("PriorityQue:");

        priorityQueue.addElement(10);
        priorityQueue.addElement(20);
        priorityQueue.addElement(30);
        priorityQueue.addElement(40);

        System.out.println("pollElement: " + priorityQueue.pollElement());
    }
}
