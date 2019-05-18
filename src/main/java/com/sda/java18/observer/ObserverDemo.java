package com.sda.java18.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        System.out.println("Enter Text: ");
        EventSource eventSource = new EventSource();

        eventSource.addObserver(event -> {
            System.out.println("Received response: " + event);
        });

        eventSource.addObserver(new Observer() {
            @Override
            public void update(String event) {
                System.out.println("Wykonuje jakies operacje" + event);
            }
        });

        eventSource.scanSystemIn();
    }

}
