package com.hillel.shabrin.homeworks.homework5.runGame.obstacles;
import com.hillel.shabrin.homeworks.homework5.runGame.participants.Participant;

public class Racetrack extends Obstacle{

    private final int length;

    public Racetrack(int length) {
        this.length = length;
    }

    public int getLengthOfRace() {
        return length;
    }

    public boolean overcome(Participant participant) {
        int runDistance = participant.getMaxRunDistance();
        if (runDistance >= length) {
            System.out.printf(participant.getName() +" пробіг бігову доріжку довжиною "
                    + length + "м." + '\n');
            return true;
        } else {
            System.out.printf(participant.getName() + " не зміг пробігти бігову доріжку довжиною "
                    + length + "м." + '\n');
            return false;
        }
    }
}