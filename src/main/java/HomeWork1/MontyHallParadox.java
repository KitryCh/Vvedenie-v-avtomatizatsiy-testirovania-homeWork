package HomeWork1;

import java.util.Random;

// Основной класс приложения для демонстрации парадокса Монти Холла
public class MontyHallParadox extends MontyHallGame {

    @Override
    public int placeCar() {
        Random random = new Random();
        return random.nextInt(3);
    }

    @Override
    public int openDoor(int selectedDoor, int carDoor) {
        Random random = new Random();
        int shownDoor;
        do {
            shownDoor = random.nextInt(3);
        } while (shownDoor == selectedDoor || shownDoor == carDoor);
        return shownDoor;
    }

    @Override
    public int switchDoor(int selectedDoor, int shownDoor) {
        Random random = new Random();
        int newDoor;
        do {
            newDoor = random.nextInt(3);
        } while (newDoor == selectedDoor || newDoor == shownDoor);
        return newDoor;
    }

    public static void main(String[] args) {
        MontyHallParadox game = new MontyHallParadox();

        int numGames = 1000;
        int numWins = 0;

        // Запуск игры в цикле на 1000 раз
        for (int i = 0; i < numGames; i++) {
            if (game.playGame()) {
                numWins++;
            }
        }

        // Вывод итогового счета
        System.out.println("Wins: " + numWins);
        System.out.println("Losses: " + (numGames - numWins));
    }
}
