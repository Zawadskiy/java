package com.walking.counterAggregation;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter("Газ", "m^3");
        Counter counter2 = new Counter("Горячая вода", "m^3");
        Counter counter3 = new Counter("Холодная вода", "m^3");
        CounterService counterService = new CounterService(counter1,counter2,counter3);

        Counter gas = counterService.getCounterByName("Газ");
        Counter hotWater = counterService.getCounterByName("Горячая вода");

        counterService.incrementCounterByValue(hotWater, 2413);
        counterService.incrementCounter(hotWater);
        counterService.incrementCounterByValue(gas, 4542);
        counterService.incrementCounterByValue("Холодная вода", 5624);

        printCounters(counterService.getCounters());

        counterService.reset("Холодная вода");
        counterService.reset(counter2);

        printCounters(counterService.getCounters());
    }

    private static void printCounters(Counter[] counters) {
        for (Counter counter : counters) {
            if (counter != null) {
                System.out.println(counter.getName() + ": " + counter.getCounter());
            }
        }
    }
}
