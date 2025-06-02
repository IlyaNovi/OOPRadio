package org.work.radioTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.work.radio.Radio;

public class RadioTest {

    @Test
    public void shouldGetStation() {
        Radio radio = new Radio();

        radio.setNumberStation(5);
        int expected = 5;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetLessZero() {
        Radio radio = new Radio();

        radio.setNumberStation(-1);
        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetOverMax() {
        Radio radio = new Radio();

        radio.setNumberStation(11);
        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation() {
        Radio radio = new Radio();

        radio.setIncreaseStation(8);

        int expected = 9;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreasesStation() {

        Radio radio = new Radio();
        radio.setDecreasesStation(0);

        int expected = 9;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolume() {
        Radio radio = new Radio();
        radio.setVolume(97);

        int expected = 97;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreasesVolume() {
        Radio radio = new Radio();
        radio.setIncreasesVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreasesVolume() {
        Radio radio = new Radio();
        radio.setDecreasesVolume(1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}
