package api_pojo;

import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;

public class StudentPutRequestPojo {
    /*
     "absentee": 11,
  "educationTermId": 1,
  "finalExam": 99,
  "infoNote": "you did a great jon i appriciate you",
  "lessonId": 1,
  "midtermExam": 98
     */

    private Integer abseente;
    private Integer educationTermId;
    private Integer finalExam;
    private String infoNote;
    private Integer lessonId ;
    private int midtermExam;

    public StudentPutRequestPojo (){

    }

    public StudentPutRequestPojo(Integer abseente, Integer educationTermId, Integer finalExam, String infoNote, Integer lessonId, int midtermExam) {
        this.abseente = abseente;
        this.educationTermId = educationTermId;
        this.finalExam = finalExam;
        this.infoNote = infoNote;
        this.lessonId = lessonId;
        this.midtermExam = midtermExam;
    }

    public Integer getAbseente() {
        return abseente;
    }

    public void setAbseente(Integer abseente) {
        this.abseente = abseente;
    }

    public Integer getEducationTermId() {
        return educationTermId;
    }

    public void setEducationTermId(Integer educationTermId) {
        this.educationTermId = educationTermId;
    }

    public Integer getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(Integer finalExam) {
        this.finalExam = finalExam;
    }

    public String getInfoNote() {
        return infoNote;
    }

    public void setInfoNote(String infoNote) {
        this.infoNote = infoNote;
    }

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    public int getMidtermExam() {
        return midtermExam;
    }

    public void setMidtermExam(int midtermExam) {
        this.midtermExam = midtermExam;
    }

    @Override
    public String toString() {
        return "StudentPutRequestPojo{" +
                "abseente=" + abseente +
                ", educationTermId=" + educationTermId +
                ", finalExam=" + finalExam +
                ", infoNote='" + infoNote + '\'' +
                ", lessonId=" + lessonId +
                ", midtermExam=" + midtermExam +
                '}';
    }
}
