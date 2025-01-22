package lesson_09_Generics.homework.fruits_task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    Box <Apple> appleBox;
    Box<Orange> orangeBox;
    Orange[] oranges;
    Apple[] apples;

    public static final float ORANGE_WEIGHT = 1.5f;
    public static final float APPLE_WEIGHT = 1.0f;

    @BeforeEach
    public void preparedData() {
        appleBox = new Box<>();
        orangeBox = new Box<>();
        oranges = new Orange[] {
                new Orange(ORANGE_WEIGHT),
                new Orange(ORANGE_WEIGHT),
                new Orange(ORANGE_WEIGHT)};
        apples = new Apple[] {
                new Apple(APPLE_WEIGHT),
                new Apple(APPLE_WEIGHT),
                new Apple(APPLE_WEIGHT),
                new Apple(APPLE_WEIGHT),
                new Apple(APPLE_WEIGHT)};
    }

    @Test
    void testAddSingleFruit() {
        assertEquals(appleBox.getBox().size(), 0);
        appleBox.add(new Apple(APPLE_WEIGHT));
        assertEquals(appleBox.getBox().size(), 1);
        appleBox.add(new Apple(APPLE_WEIGHT));
        appleBox.add(new Apple(APPLE_WEIGHT));
        assertEquals(appleBox.getBox().size(), 3);

        assertEquals(orangeBox.getBox().size(), 0);
        orangeBox.add(new Orange(ORANGE_WEIGHT));
        orangeBox.add(new Orange(ORANGE_WEIGHT));
        orangeBox.add(new Orange(ORANGE_WEIGHT));
        orangeBox.add(new Orange(ORANGE_WEIGHT));
        orangeBox.add(new Orange(ORANGE_WEIGHT));
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
       orangeBox.add(new Orange(ORANGE_WEIGHT));
       assertEquals(orangeBox.getWeight(), 1.5);
       orangeBox.add(new Orange(ORANGE_WEIGHT));
       orangeBox.add(new Orange(ORANGE_WEIGHT));
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
        newAppleBox.add(new Apple(APPLE_WEIGHT));
        appleBox.merge(newAppleBox);
        assertEquals(appleBox.getBox().size(), 6);
        assertThrows(NullPointerException.class, () -> appleBox.merge(null));

    }
}