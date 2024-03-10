package HomeWork1;

import java.util.Random;

// Абстрактный класс для игры Монти Холла
public abstract class MontyHallGame {
    private Random random = new Random();

    // Метод для размещения автомобиля за одной из дверей
    public abstract int placeCar();

    // Метод для открытия одной из дверей, кроме выбранной игроком и содержащей автомобиль
    public abstract int openDoor(int selectedDoor, int carDoor);

    // Метод для смены выбора игрока после открытия одной из дверей
    public abstract int switchDoor(int selectedDoor, int shownDoor);

    // Метод для запуска игры один раз
    public boolean playGame() {
        int carDoor = placeCar();
        int selectedDoor = random.nextInt(3);
        int shownDoor = openDoor(selectedDoor, carDoor);
        int switchedDoor = switchDoor(selectedDoor, shownDoor);
        return switchedDoor == carDoor;
    }
}
