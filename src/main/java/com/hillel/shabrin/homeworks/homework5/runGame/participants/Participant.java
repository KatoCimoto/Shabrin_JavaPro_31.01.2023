package com.hillel.shabrin.homeworks.homework5.runGame.participants;

public abstract class Participant {
    private final String name;
    private final int maxRunDistance;
    private final int maxJumpHeight;


    public Participant(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }


    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public abstract void run(int distance);

    public abstract void jump(int height);

    public String getName() {
        return name;
    }
}
