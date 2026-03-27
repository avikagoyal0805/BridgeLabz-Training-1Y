package com.gla.thread;

class Activity extends Thread {
    private String activity;
    private int delay;

    public Activity(String activity, int delay) {
        this.activity = activity;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            System.out.println(activity + " state: " + this.getState());
            Thread.sleep(delay);
            System.out.println(activity + " started.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ExamHall {
    public static void main(String[] args) throws Exception {

        Activity entry = new Activity("Student Entry", 0);
        Activity question = new Activity("Question Paper Distribution", 5000);
        Activity attendance = new Activity("Attendance", 10000);
        Activity collection = new Activity("Answer Sheet Collection", 15000);

        question.setPriority(10);
        attendance.setPriority(8);
        collection.setPriority(7);
        entry.setPriority(5);

        entry.start();
        question.start();
        attendance.start();
        collection.start();

        System.out.println("Entry Thread State: " + entry.getState());
    }
}
