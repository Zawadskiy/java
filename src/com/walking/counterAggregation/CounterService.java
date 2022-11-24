package com.walking.counterAggregation;


public class CounterService {

    private final Counter[] counters;

    CounterService(Counter... counters) {
        this.counters = counters;
    }

    public Counter[] getCounters() {
        return counters;
    }

    public Counter getCounterByName(String name) {
        for (Counter counter : counters) {
            if (counter.getName().equals(name)) return counter;
        }
        System.out.println("Счетчик с таким именем не найден");// Кидаем ексепшен.
        return null;
    }

    public void incrementCounter(Counter counter) {
        int counterValue = counter.getCounter();
        counter.setCounter(++counterValue);
    }

    public void incrementCounterByValue(Counter counter, int value) {
        int counterValue = counter.getCounter();
        counter.setCounter(counterValue + value);
    }

    public void reset(Counter counter) {
        counter.setCounter(0);
    }

    public void incrementCounter(String counterName) {
        Counter counterByName = getCounterByName(counterName);
        if (counterByName != null) {
            int counterValue = counterByName.getCounter();
            counterByName.setCounter(++counterValue);
        }
    }

    public void incrementCounterByValue(String counterName, int value) {
        Counter counterByName = getCounterByName(counterName);
        if (counterByName != null) {
            int counterValue = counterByName.getCounter();
            counterByName.setCounter(counterValue + value);
        }
    }

    public void reset(String counterName) {
        Counter counterByName = getCounterByName(counterName);
        if (counterByName != null) {
            counterByName.setCounter(0);
        }
    }
}
