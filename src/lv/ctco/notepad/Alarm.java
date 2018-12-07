package lv.ctco.notepad;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by maira.maksimova01 on 11/30/2018.
 */
public class Alarm extends StickyNote implements Expirable {
    private LocalTime time;
    private LocalDate dismissedAt;

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

    @Override
    public boolean isExpired() {
        if (dismissedAt != null && dismissedAt.isEqual(LocalDate.now())){
            return false;
        }
        LocalTime now = LocalTime.now();
        return now.isAfter(time);
    }

    @Override
    public void dismiss() {
        dismissedAt = LocalDate.now();
    }
}
