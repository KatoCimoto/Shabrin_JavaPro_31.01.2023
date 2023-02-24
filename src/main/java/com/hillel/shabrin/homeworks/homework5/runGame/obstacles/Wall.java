package com.hillel.shabrin.homeworks.homework5.runGame.obstacles;

import com.hillel.shabrin.homeworks.homework5.runGame.participants.Participant;

public class Wall extends Obstacle{

    private final int heightOfWall;

    public Wall(int height) {
        heightOfWall = 3;
    }

    public int getHeightOfWall() {
        return heightOfWall;
    }

    @Override
    public boolean overcome(Participant participant) {
        int jumpHeight = participant.getMaxJumpHeight();
        if(jumpHeight >= heightOfWall){
            System.out.println(participant.getName() + " перестрибнув стіну висотою " + heightOfWall + "м.");
            return true;
        } else {
            System.out.println(participant.getName() + " не зміг перестрибнути стіну висотою " + heightOfWall + "м.");
            return false;
        }
    }
}
