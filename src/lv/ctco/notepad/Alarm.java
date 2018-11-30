package lv.ctco.notepad;

import java.time.LocalTime;

/**
 * Created by maira.maksimova01 on 11/30/2018.
 */
public class Alarm extends StickyNote{
    private LocalTime time;

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time=" + getFormattedTime() +
                '}';
    }

    @Override
    public boolean contains(String str) {
        return super.contains(str) || getFormattedTime().contains(str);
    }

    protected String getFormattedTime() {
        return time.format(Main.TIME_FORMATTER);
    }

    @Override
    public void askData() {
        super.askData();
        time = Main.askTime("Enter time");

    }
}
