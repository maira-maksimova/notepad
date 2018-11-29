package lv.ctco.notepad;

public class Reminder extends StickyNote {

    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                "date='" + date + '\'' +
                '}';
    }

    @Override
    public boolean contains(String str) {
        return getText().contains(str) || date.contains(str);
    }

    @Override
    public void askData() {
        super.askData();
        date = Main.askString("Enter date");
    }
}
