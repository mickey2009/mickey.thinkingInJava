package enums;

/**
 * Created by Mickey on 2017/2/14.
 * Enum可以有成员和方法
 */
public enum OzWitch {
    WEST("WEST"),
    NORTH("NORTH"),
    EAST("EAST"),
    SOUTH("SOUTH");
    private String description;

    private OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch o : OzWitch.values()) {
            System.out.println(o.getDescription());
        }
    }
}
