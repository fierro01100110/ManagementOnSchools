package api_pojo;

import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;

public class StudentPutRequestPojo {
    /*
{
  "absentee": 16,
  "educationTermId":1,
  "finalExam": 90,
  "infoNote": "i appriciate your hard work, you re doing great",
  "lessonId": 1,
  "midtermExam": 80
}
     */

    private Integer absentee;
    private Integer educationTermId;
    private Integer finalExam;
    private String infoNote;
    private Integer lessonId ;
    private Integer midtermExam;

    public StudentPutRequestPojo (){

    }

    public StudentPutRequestPojo(Integer absentee, Integer educationTermId, Integer finalExam, String infoNote, Integer lessonId, Integer midtermExam) {
        this.absentee = absentee;
        this.educationTermId = educationTermId;
        this.finalExam = finalExam;
        this.infoNote = infoNote;
        this.lessonId = lessonId;
        this.midtermExam = midtermExam;
    }

    public Integer getAbsentee() {
        return absentee;
    }

    public void setAbsentee(Integer abseente) {
        this.absentee = absentee;
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

    public Integer getMidtermExam() {
        return midtermExam;
    }

    public void setMidtermExam(Integer midtermExam) {
        this.midtermExam = midtermExam;
    }

    @Override
    public String toString() {
        return "StudentPutRequestPojo{" +
                "absentee=" + absentee +
                ", educationTermId=" + educationTermId +
                ", finalExam=" + finalExam +
                ", infoNote='" + infoNote + '\'' +
                ", lessonId=" + lessonId +
                ", midtermExam=" + midtermExam +
                '}';
    }
}
