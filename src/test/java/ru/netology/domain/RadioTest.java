package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
   public void setCurrentStationAndVolume() {
        Radio radio = new Radio(
                5,
                50
        );
        assertEquals(5,radio.getCurrentStation());
        assertEquals(50,radio.getCurrentVolume());
    }

    @Test
    void setCurrentStationAndVolumeMax() {
        Radio radio = new Radio(
                11,
                101
                );
        assertEquals(0,radio.getCurrentStation());
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    void setCurrentStationAndVolumeMin() {
        Radio radio = new Radio(
                -1,
                -1
        );
        assertEquals(0,radio.getCurrentStation());
        assertEquals(0,radio.getCurrentVolume());
    }

   @Test
    void nextStationAndVolume() {
        Radio radio = new Radio(
                5,
                10
        );
        radio.nextStation();
        radio.nextVolume();
        assertEquals(6,radio.getCurrentStation());
       assertEquals(11,radio.getCurrentVolume());
    }

    @Test
    void nextStationMax() {
        Radio radio = new Radio(
                10,
                100
        );
        radio.nextStation();
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void nextVolumeMax() {
        Radio radio = new Radio(
                10,
                100
        );
        radio.nextVolume();
        assertEquals(100,radio.getCurrentVolume());
    }
    @Test
    void prevStationAndVolume() {
        Radio radio = new Radio(
                7,
                40
        );
        radio.prevStation();
        radio.prevVolume();
        assertEquals(6,radio.getCurrentStation());
        assertEquals(39,radio.getCurrentVolume());
    }

    @Test
    void prevStationAndVolumeMin() {
        Radio radio = new Radio(
                0,
                0
        );
        radio.prevStation();
        radio.prevVolume();
        assertEquals(10,radio.getCurrentStation());
        assertEquals(0,radio.getCurrentVolume());
    }
}