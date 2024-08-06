package entity;

public class qualifications {

    private int id;
    private int inscriptionsId;
    private int note;
    private String description;


    public qualifications() {
    }

    public qualifications(int id, int inscriptionsId, int note, String description) {
        this.id = id;
        this.inscriptionsId = inscriptionsId;
        this.note = note;
        this.description = description;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getInscriptionsId() {
        return inscriptionsId;
    }
    public void setInscriptionsId(int inscriptionsId) {
        this.inscriptionsId = inscriptionsId;
    }

    public int getNote() {
        return note;
    }
    public void setNote(int note) {
        this.note = note;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "qualifications{" +
                "id=" + id +
                ", inscriptionsId=" + inscriptionsId +
                ", note=" + note +
                ", description='" + description + '\'' +
                '}';
    }
}
