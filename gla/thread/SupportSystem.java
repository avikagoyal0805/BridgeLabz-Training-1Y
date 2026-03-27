package com.gla.thread;

import java.util.Random;

class Ticket extends Thread {
    private int id;
    private String type;
    private int priority;

    public Ticket(int id, String type, int priority) {
        this.id = id;
        this.type = type;
        this.priority = priority;
        this.setPriority(priority);
    }

    @Override
    public void run() {
        Random r = new Random();
        int time = r.nextInt(5) + 1;

        long start = System.currentTimeMillis();

        System.out.println("Ticket " + id + " [" + type + "] started by " + getName() +
                " | Priority: " + getPriority());

        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        System.out.println("Ticket " + id + " completed in " + (end - start) / 1000 + " sec");
    }
}

public class SupportSystem {
    public static void main(String[] args) {

        Ticket[] tickets = {
                new Ticket(1, "Critical Bug", 10),
                new Ticket(2, "Feature Request", 4),
                new Ticket(3, "General Query", 2),
                new Ticket(4, "Feedback", 1),
                new Ticket(5, "Critical Bug", 10),
                new Ticket(6, "Feature Request", 4),
                new Ticket(7, "General Query", 2),
                new Ticket(8, "Feedback", 1),
                new Ticket(9, "Critical Bug", 10),
                new Ticket(10, "General Query", 2)
        };

        for (Ticket t : tickets) {
            t.start();
        }
    }
}
