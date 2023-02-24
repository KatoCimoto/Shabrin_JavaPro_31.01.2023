package com.hillel.shabrin.homeworks.homework5.runGame;

import com.hillel.shabrin.homeworks.homework5.runGame.obstacles.Obstacle;
import com.hillel.shabrin.homeworks.homework5.runGame.obstacles.Racetrack;
import com.hillel.shabrin.homeworks.homework5.runGame.obstacles.Wall;
import com.hillel.shabrin.homeworks.homework5.runGame.participants.Cat;
import com.hillel.shabrin.homeworks.homework5.runGame.participants.Human;
import com.hillel.shabrin.homeworks.homework5.runGame.participants.Participant;
import com.hillel.shabrin.homeworks.homework5.runGame.participants.Robot;


public class Start {


    public void start() {

        System.out.println();

        Participant[] participants = {
                new Human("Джон"),
                new Robot("ZeroOne"),
                new Cat("Томас")
        };

        Obstacle[] obstacles = {
                new Racetrack(350),
                new Wall(5),
        };

        for (Participant participant : participants) {
            boolean isParticipantFinished = true;
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) {
                    isParticipantFinished = false;
                    break;
                }
            }
            if (isParticipantFinished) {
                System.out.println("Учасник " + participant.getName()
                        + " успішно пройшов всі перешкоди." + '\n');
            } else {
                System.out.println("Учасник " + participant.getName()
                        + " не пройшов всі перешкоди і вилетів з перегонів." + '\n');
            }
        }
    }
}



