package rentACar.entities.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CarStateEnum {

    AVAILABLE(1, "Available"), RENTED(2, "Rented"), MAINTENANCE(3, "Maintenance");

    private int id;
    private String desc;

    public void setId(int id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static CarStateEnum getByDescToValue(String desc) {
        for (CarStateEnum e : values()) {
            if (e.getDesc().equals(desc)) return e;
        }
        return null;
    }

    public static CarStateEnum getByIdToValue(int id) {
        for (CarStateEnum e : values()) {
            if (e.getId() == id) return e;
        }
        return null;
    }
    
}
