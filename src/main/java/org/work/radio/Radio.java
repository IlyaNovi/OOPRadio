package org.work.radio;

public class Radio {

    public int numberStation;

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < 0) {
            return;
        }
        if (newNumberStation > 9) {
            return;
        }
        numberStation = newNumberStation;
    }


    public void setIncreaseStation(int newIncreasesStation) {
        if (newIncreasesStation < 9) {
            numberStation = newIncreasesStation + 1;
        }
    }

    public void setDecreasesStation(int newDecreasesStation) {
        if (newDecreasesStation > 0) {
            numberStation = newDecreasesStation - 1;
        }
        if (newDecreasesStation == 0) {
            numberStation = 9;
        }
    }

    public int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void setIncreasesVolume(int newIncreasesVolume) {
        if (newIncreasesVolume < 100) {
            volume = newIncreasesVolume + 1;
        }
        if (newIncreasesVolume == 100) {
            volume = 100;
        }
    }

    public void setDecreasesVolume(int newDecreasesVolume) {
        if (newDecreasesVolume > 0) {
            volume = newDecreasesVolume - 1;
        }
        if (newDecreasesVolume == 0) {
            volume = 0;
        }
    }
}
