package model.entity;

public class RepHistory {
    int room_id;
    String national_id;
    String personnelfName;
    String personnellName;
    int repair_id;
    String date;
    String title;
    String description;

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getNational_id() {
        return national_id;
    }

    public void setNational_id(String national_id) {
        this.national_id = national_id;
    }

    public String getPersonnelfName() {
        return personnelfName;
    }

    public void setPersonnelfName(String personnelfName) {
        this.personnelfName = personnelfName;
    }

    public String getPersonnellName() {
        return personnellName;
    }

    public void setPersonnellName(String personnellName) {
        this.personnellName = personnellName;
    }

    public int getRepair_id() {
        return repair_id;
    }

    public void setRepair_id(int repair_id) {
        this.repair_id = repair_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
