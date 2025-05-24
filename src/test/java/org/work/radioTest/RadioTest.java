package org.work.radioTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.work.radio.Radio;

public class RadioTest {

    @Test
    public void shouldGetStation(){
        Radio radio = new Radio();

        radio.numberStation = 10;
        int expected = 10;
        int actual = radio.numberStation;

        Assertions.assertEquals(expected, actual);
    }


}
