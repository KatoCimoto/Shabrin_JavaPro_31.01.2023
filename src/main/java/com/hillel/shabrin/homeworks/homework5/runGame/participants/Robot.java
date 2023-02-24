package com.hillel.shabrin.homeworks.homework5.runGame.participants;

public class Robot extends Participant{

    public Robot(String name) {
        super(name, 1000, 10);
    }

    @Override
    public void run(int distance) {
        if (distance <= getMaxRunDistance()) {
            System.out.println(getName() + " пробіг " + distance + "м.");
        } else {
            System.out.println(getName() + " не зміг пробігти " + distance + "м.");
        }

    }

    @Override
    public void jump(int height) {
        if (height <= getMaxJumpHeight()) {
            System.out.println(getName() + " перестрибнув " + height + "м.");
        } else {
            System.out.println(getName() + " не зміг перестрибнути " + height + "м.");
        }
    }
}
