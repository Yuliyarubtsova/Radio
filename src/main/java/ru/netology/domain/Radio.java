package ru.netology.domain;

public class Radio {
    private int minStation = 0;
    private int maxStation = 10;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio(int currentStation, int currentVolume, int maxStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
        this.maxStation = maxStation;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else currentStation = minStation;
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation--;
        } else currentStation = maxStation;
    }

    public void nextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else currentStation = maxStation;

    }

    public void prevVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else currentVolume = minVolume;
    }


}
