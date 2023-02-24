package com.hillel.shabrin.homeworks.homework5.runGame.participants;

public class Human extends Participant {

    public Human(String name) {
        super(name, 500, 3);
    }

    @Override
    public void run(int distance) {
        if (distance <= getMaxRunDistance()) {
            System.out.println(getName() + " пробіг " + distance + " метрів.");
        } else {
            System.out.println(getName() + " не зміг пробігти " + distance + " метрів.");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= getMaxJumpHeight()) {
            System.out.println(getName() + " перестрибнув " + height + " метрів.");
        } else {
            System.out.println(getName() + " не зміг перестрибнути " + height + " метрів.");
        }
    }
}




