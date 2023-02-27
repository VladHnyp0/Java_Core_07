package ua.lviv.lgs;

public abstract class Plane {
    private int length;
    private int height;
    private int weight;

    public Plane (int length, int height, int weight) {
        this.length = length;
        this.height = height;
        this.weight = weight;
    }

    private PlaneControl planeControl = new PlaneControl();
    public void moveUp() {
        planeControl.moveUp();
    }
    public void moveDown() {
        planeControl.moveDown();
    }
    public void moveRight() {
        planeControl.moveRight();
    }
    public void moveLeft() {
        planeControl.moveLeft();
    }

    void launching() {
        int min = 20;
        int max = 88;
        int t = (int) (Math.random()*(max-min+1)+min);
        System.out.println("Time to launching : " + t + " min");
    }

    void takeOf() {
        double min = 0;
        double max = 1000;
        double w = (Math.random()*(max-min+1)+min);
        System.out.println("Taking of. The plane with full tanks will pass : " + w + " km");
    }

    void landing() {
        System.out.println("Plane is landing");
    }
}
