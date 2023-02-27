package ua.lviv.lgs;

public class Main {
    public static void main(String[] args) {
        Su27 su27 = new Su27(15, 5, 8);

        su27.launching(); //Запуск двигуна
        su27.takeOf(); //Зліт
        su27.moveUp(); //Рух вверх
        su27.moveLeft(); //Рух вліво
        su27.moveDown(); //Рух вниз
        su27.moveRight(); //Рух вправо
        su27.stealthTechnology(); //Стелс
        su27.nuclearStrike(); //Ядерний удар
        su27.turboAcceleration(); //Турбоприскореня
        su27.landing(); //Посадка

    }
}
