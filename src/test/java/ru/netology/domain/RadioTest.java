package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentStation() {
        Radio radio = new Radio();
        assertEquals(0,radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);
        assertEquals(5,radio.getCurrentStation());
    }

    @Test
    void setCurrentStationMax() {
        Radio radio = new Radio();
        assertEquals(0,radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(12);
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void setCurrentStationMin() {
        Radio radio = new Radio();
        assertEquals(0,radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(-1);
        assertEquals(0,radio.getCurrentStation());
    }

   @Test
    void setCurrentVolume() {
        Radio radio = new Radio();
        assertEquals(0,radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(7);
        assertEquals(7,radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeMax() {
        Radio radio = new Radio();
        assertEquals(0,radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(11);
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeMin() {
        Radio radio = new Radio();
        assertEquals(0,radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(-1);
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    void nextStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);
        radio.nextStation();
        assertEquals(6,radio.getCurrentStation());
    }

    @Test
    void nextStationMax() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void prevStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(7);
        radio.prevStation();
        assertEquals(6,radio.getCurrentStation());
    }

    @Test
    void prevStationMin() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    void nextVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(7);
        radio.nextVolume();
        assertEquals(8,radio.getCurrentVolume());
    }
    @Test

    void nextVolumeMax() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        radio.nextVolume();
        assertEquals(10,radio.getCurrentVolume());
    }

    @Test
    void prevVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(7);
        radio.prevVolume();
        assertEquals(6,radio.getCurrentVolume());
    }

    @Test
    void prevVolumeMin() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        radio.prevVolume();
        assertEquals(0,radio.getCurrentVolume());
    }
}