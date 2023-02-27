package ua.lviv.lgs;

public class PlaneControl extends Distance {

    void moveUp() {
        System.out.println("Moving up to " + generation() + "m");
    }

    void moveDown() {
        System.out.println("Moving down to " + generation() + "m");
    }

    void moveRight() {
        System.out.println("Moving right to " + generation() + "m");
    }

    void moveLeft() {
        System.out.println("Moving left to " + generation() + "m");
    }


}
