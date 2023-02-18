package com.hillel.shabrin.homeworks.homework5.runGame.participants;

public class Cat extends Participant {

    public Cat(String name) {
        super(name, 300, 2);
    }

    @Override
    public int getMaxRunDistance() {
        return super.getMaxRunDistance();
    }

    @Override
    public int getMaxJumpHeight() {
        return super.getMaxJumpHeight();
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
