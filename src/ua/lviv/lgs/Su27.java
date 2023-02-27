package ua.lviv.lgs;

public class Su27 extends Plane implements TurboAcceleration, NuclearStrike, StealthTechnology{
    int maxSpeed = 300;
    String color = "blue";

    public Su27(int length, int height, int weight) {
        super(length, height, weight);
    }

    @Override
    public void nuclearStrike() {
        int min = 1;
        int max = 10;
        int r = (int) (Math.random()*(max-min+1)+min);
        System.out.println("Dropping " + r + " nuclear rockets");
    }

    @Override
    public void stealthTechnology() {
        int min = 1;
        int max = 30;
        int i = (int) (Math.random()*(max-min+1)+min);
        System.out.println("Plane is  invisible for " + i + " minutes");
    }

    @Override
    public void turboAcceleration() {
        int max = 600;
        int t = (int) (Math.random()*(max-this.maxSpeed+1)+this.maxSpeed);
        System.out.println("Turbo boosted " + t + " km/h");
    }
}
