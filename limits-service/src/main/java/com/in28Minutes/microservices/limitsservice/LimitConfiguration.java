package com.in28Minutes.microservices.limitsservice;

public class LimitConfiguration {
    int maximum;
    int minimum;

    public LimitConfiguration() {}

    public LimitConfiguration(int max, int min) {
        this.maximum = max;
        this.minimum = min;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }
}
