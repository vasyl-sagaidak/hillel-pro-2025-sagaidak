package lesson_09_Generics.homework.fruits_task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    Box <Apple> appleBox;
    Box<Orange> orangeBox;
    Orange[] oranges;
    Apple[] apples;

    @BeforeEach
    public void preparedData() {
        appleBox = new Box<>();
        orangeBox = new Box<>();
        oranges = new Orange[] {new Orange(), new Orange(), new Orange()};
        apples = new Apple[] {new Apple(), new Apple(), new Apple(),
                new Apple(), new Apple()};
    }

    @Test
    void testAddSingleFruit() {
        assertEquals(appleBox.getBox().size(), 0);
        appleBox.add(new Apple());
        assertEquals(appleBox.getBox().size(), 1);
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        assertEquals(appleBox.getBox().size(), 3);

        assertEquals(orangeBox.getBox().size(), 0);
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        assertEquals(orangeBox.getBox().size(), 5);
    }

    @Test
    void testAddArrayOfFruits() {
        appleBox.add(apples);
        assertEquals(appleBox.getBox().size(), 5);

        orangeBox.add(oranges);
        assertEquals(orangeBox.getBox().size(), 3);
    }

    @Test
    void testGetWeightOfTheGivenFruitBox() {
       assertEquals(appleBox.getWeight(), 0.0);
       appleBox.add(apples);
       assertEquals(appleBox.getWeight(), 5.0);

       assertEquals(orangeBox.getWeight(), 0.0);
       orangeBox.add(new Orange());
       assertEquals(orangeBox.getWeight(), 1.5);
       orangeBox.add(new Orange());
       orangeBox.add(new Orange());
       assertEquals(orangeBox.getWeight(), 4.5);
       orangeBox.add(oranges);
       assertEquals(orangeBox.getWeight(), 9.0);

    }

    @Test
    void testCompareTwoBoxesOfTheVariousFruitTypes() {
        Box<Apple> newAppleBox = new Box<>();
        appleBox.add(apples);
        newAppleBox.add(apples);

        assertTrue(appleBox.compare(newAppleBox));
        assertFalse(appleBox.compare(orangeBox));
    }

    @Test
    void testMergeTwoBoxesOfTheSameFruitType() {
        Box<Apple> newAppleBox = new Box<>();
        appleBox.add(apples);
        newAppleBox.add(new Apple());
        appleBox.merge(newAppleBox);
        assertEquals(appleBox.getBox().size(), 6);
        assertThrows(NullPointerException.class, () -> appleBox.merge(null));

    }
}