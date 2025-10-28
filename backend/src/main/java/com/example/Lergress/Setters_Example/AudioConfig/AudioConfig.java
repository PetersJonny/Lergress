package com.example.Lergress.Setters_Example.AudioConfig;

public class AudioConfig {
    private int volume;

    public int getVolume() {
        return volume;
    }

    // set to put the volume
    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            volume = 0;
        } else if (volume > 100) {
            volume = 100;
        } else {
            volume = newVolume;
        }
    }
}
