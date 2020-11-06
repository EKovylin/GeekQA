package CoreLesson1;

public class Human implements Barrier {
        int maxSpeed;
        int maxHeight;

    public Human(int maxSpeed, int maxHeight) {

        this.maxSpeed = maxSpeed;
        this.maxHeight = maxHeight;
        }

    public boolean run(RunningTrack track1){
        if (maxSpeed > track1.speed) {
            System.out.println("Человек пробежал " + track1.speed + "м");
            return true;
        } else {
            System.out.println("Человек не смог пробежать " + track1.speed + "м");
            return false;
        }
        }
    public boolean jump(Wall wall){
        if (maxHeight > wall.height) {
            System.out.println("Человек прыгнул через стену " + wall.height + "м");
            return true;
        } else {
            System.out.println("Человек не смог перепрыгнуть через стену " + wall.height + "м");
            return false;
        }
    }
}
