package CoreLesson1;

public class Robot implements Barrier {
    int maxSpeed;
    int maxHeight;

    public Robot(int maxSpeed, int maxHeight) {

        this.maxSpeed = maxSpeed;
        this.maxHeight = maxHeight;
    }

    public boolean run(RunningTrack track1){
        if (maxSpeed > track1.speed) {
            System.out.println("Робот пробежал " + track1.speed + "м");
            return true;
        } else {
            System.out.println("Робот не смог пробежать " + track1.speed + "м");
            return false;
        }
    }
    public boolean jump(Wall wall){
        if (maxHeight > wall.height) {
            System.out.println("Робот прыгнул через стену " + wall.height + "м");
            return true;
        } else {
            System.out.println("Робот не смог перепрыгнуть через стену " + wall.height + "м");
            return false;
        }
    }

}
