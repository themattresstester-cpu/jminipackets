package net.jminipackets.shortcuts;

public class SleepShortcuts {
    public void pauseSeconds(long seconds) {
        try {
            Thread.sleep(seconds/1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void pauseMilliseconds(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
