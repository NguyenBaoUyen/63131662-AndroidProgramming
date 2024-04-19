package ntu.nguyenbaouyen.examlist;

public class ExamList {
    String name;
    String date;
    String note;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public ExamList(String name, String date, String note) {
        this.name = name;
        this.date = date;
        this.note = note;
    }
}
