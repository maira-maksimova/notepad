package lv.ctco.notepad;

import java.time.LocalDate;

public class Reminder extends Alarm {

    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time=" + getFormattedTime() +
                ", date='" + getFormattedDate() + '\'' +
                '}';
    }

    @Override
    public boolean contains(String str) {
        return super.contains(str) || getFormattedDate().contains(str);
    }

    private String getFormattedDate() {
        return date.format(Main.DATE_FORMATTER);
    }

    @Override
    public void askData() {
        super.askData();
        date = Main.askDate("Enter date");
    }
}
