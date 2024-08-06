package entity;

import java.util.List;

public class student {

    private int id;
    private String name;
    private String email;
    private Boolean active = Boolean.TRUE;

    public student() {
    }

    public student(int id, String name, String email, Boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public static void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public static void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public static void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return this.active;
    }

    public static void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", active=" + active +
                '}';
    }

    public boolean isActive() {
        return false;
    };
}
