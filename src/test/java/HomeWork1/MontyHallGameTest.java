package HomeWork1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Тесты для игры Монти Холла
@DisplayName("Тесты для игры Монти Холла")
public class MontyHallGameTest {

    // Позитивный тест для метода placeCar()
    @DisplayName("Тест метода placeCar()")
    @Test
    public void testPlaceCar() {
        MontyHallGame game = new MontyHallParadox();
        int carDoor = game.placeCar();
        assertTrue(carDoor >= 0 && carDoor <= 2);
    }

    // Позитивный тест для метода openDoor()
    @DisplayName("Тест метода openDoor()")
    @Test
    public void testOpenDoor() {
        MontyHallGame game = new MontyHallParadox();
        int selectedDoor = 1; // Пример выбранной игроком двери
        int carDoor = 0; // Пример двери, за которой находится автомобиль
        int shownDoor = game.openDoor(selectedDoor, carDoor);
        assertNotEquals(selectedDoor, shownDoor);
        assertNotEquals(carDoor, shownDoor);
    }

    // Позитивный тест для метода switchDoor()
    @DisplayName("Тест метода switchDoor()")
    @Test
    public void testSwitchDoor() {
        MontyHallGame game = new MontyHallParadox();
        int selectedDoor = 0; // Пример выбранной игроком двери
        int shownDoor = 2; // Пример открытой двери
        int switchedDoor = game.switchDoor(selectedDoor, shownDoor);
        assertNotEquals(selectedDoor, switchedDoor);
        assertNotEquals(shownDoor, switchedDoor);
    }

    // Негативный тест для метода placeCar()
    @DisplayName("Негативный тест метода placeCar()")
    @Test
    public void testPlaceCarNegative() {
        MontyHallGame game = new MontyHallParadox();
        //У Вас метод placeCar не пробасает Exception
        assertThrows(IllegalArgumentException.class, game::placeCar);
    }

    // Негативный тест для метода openDoor()
    @DisplayName("Негативный тест метода openDoor()")
    @Test
    public void testOpenDoorNegative() {
        MontyHallGame game = new MontyHallParadox();
        //У Вас метод openDoor не пробасает Exception
        assertThrows(IllegalArgumentException.class, () -> game.openDoor(0, 0));
    }

    // Негативный тест для метода switchDoor()
    @DisplayName("Негативный тест метода switchDoor()")
    @Test
    public void testSwitchDoorNegative() {
        MontyHallGame game = new MontyHallParadox();
        //У Вас метод switchDoor не пробасает Exception
        assertThrows(IllegalArgumentException.class, () -> game.switchDoor(0, 0));
    }
}
