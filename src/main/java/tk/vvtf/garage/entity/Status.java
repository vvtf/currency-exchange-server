package tk.vvtf.garage.entity;

import java.util.Objects;

public class Status {

    private boolean available;

    public Status(boolean available) {
        this.available = available;
    }

    public Status() {
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Status)) return false;
        Status status = (Status) o;
        return isAvailable() == status.isAvailable();
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAvailable());
    }
}
