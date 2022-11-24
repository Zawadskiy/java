package com.walking.counterAggregation;

public class Counter {
    private final String name;
    private final String unit;
    private int counter;

    public Counter(String name, String unit) {
        this.unit = unit;
        this.name = name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }
}
