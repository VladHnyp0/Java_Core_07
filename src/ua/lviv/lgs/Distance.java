package ua.lviv.lgs;

public class Distance {
    private int min = 10;
    private int max = 200;

    int generation() {
        return (int) (Math.random()*(max-min+1)+min);
    }
}

