package entity;

public class inscriptions {

    private int id;
    private int studentsId;
    private int coursesId;



    public inscriptions() {
    }
    public inscriptions(int id, int studentsId, int coursesId) {
        this.id = id;
        this.studentsId = studentsId;
        this.coursesId = coursesId;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getStudentsId() {
        return studentsId;
    }
    public void setStudentsId(int studentsId) {
        this.studentsId = studentsId;
    }

    public int getCoursesId() {
        return coursesId;
    }
    public void setCoursesId(int coursesId) {
        this.coursesId = coursesId;
    }

    @Override
    public String toString() {
        return "inscriptions{" +
                "id=" + id +
                ", studentsId=" + studentsId +
                ", coursesId=" + coursesId +
                '}';
    }
}
