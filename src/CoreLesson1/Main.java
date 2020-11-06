package CoreLesson1;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        ArrayList<Barrier> playersList = new ArrayList<>();
        playersList.add(new Human(5,7));
        playersList.add(new Cat(10,9));
        playersList.add(new Robot(25,5));
        ArrayList<Object> barrierList = new ArrayList<>();
        barrierList.add(new RunningTrack(20));
        barrierList.add(new Wall(6));

        for (Barrier bar : playersList) { // тип интерфейс
            for (Object pla: barrierList) {
                boolean result; // результат тру или нет
                if (pla instanceof Wall) { //

                    result = bar.jump((Wall) pla);
                } else {

                    result = bar.run((RunningTrack) pla);

                }
                if (!result) {
                    break;
                }

            }
            
        }

    }

}
