package ru.netology.domain;

public class Radio {
        private int minStation = 0;
        private int maxStation = 10;
        private int currentStation;
        private int minVolume = 0;
        private int maxVolume = 100;
        private int currentVolume;

    public Radio(int currentStation, int currentVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if(currentStation < minStation){
            return;
        }
        if(currentStation > maxStation){
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if(currentVolume < minVolume){
            return;
        }
        if(currentVolume > maxVolume){
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void nextStation(){
        if (currentStation < maxStation){
            currentStation++;
        }
        else currentStation = minStation;
    }
    public void prevStation(){
        if (currentStation > minStation){
            currentStation--;
        }
        else currentStation = maxStation;
    }
    public void nextVolume(){
        if (currentVolume < maxVolume){
            currentVolume++;
        }
        else currentStation = maxStation;

    }
    public void prevVolume(){
        if (currentVolume > minVolume){
            currentVolume--;
        }
        else currentVolume = minVolume;
    }


}
