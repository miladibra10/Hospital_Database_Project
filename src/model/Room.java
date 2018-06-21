package model;

public class Room {
    int room_id;
    int capacity;
    int rate;

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getFree_cap() {
        return free_cap;
    }

    public void setFree_cap(int free_cap) {
        this.free_cap = free_cap;
    }

    int free_cap;
}
