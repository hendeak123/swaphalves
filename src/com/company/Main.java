package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Queue<String> regularQueue = new LinkedList<>();
        try {
            regularQueue.add("One");
            regularQueue.add("Two");
            regularQueue.add("Three");
            regularQueue.add("Four");
            regularQueue.add("Five");
            regularQueue.add("Six");
            regularQueue.add("Seven");
            regularQueue.add("Eight");
            regularQueue.add("Nine");
            regularQueue.add("Ten");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(regularQueue);
            tradeFirstAndSecondHalf(regularQueue);
        }
    }

    private static void tradeFirstAndSecondHalf(Queue<String> regularQueue) {
        Stack<String> tradedHalves = new Stack<String>();
        int halfCount = regularQueue.size() / 2;
        Stack<String> temp = new Stack<String>();
        Stack<String> finalSwap = new Stack<String>();

        try {
            for (int count = 0; count < halfCount; count++) {
                tradedHalves.add(regularQueue.peek());
                regularQueue.remove();
            }
            while (!tradedHalves.isEmpty()) {
                temp.add(tradedHalves.peek());
                tradedHalves.pop();
            }
            while (!regularQueue.isEmpty()) {
                finalSwap.add(regularQueue.peek());
                regularQueue.remove();
            }
            while (!temp.isEmpty()) {
                finalSwap.add(temp.peek());
                temp.pop();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(finalSwap);
        }
    }
}
