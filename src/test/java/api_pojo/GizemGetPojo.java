package api_pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GizemGetPojo {
    private int absentee;
    private String educationTerm;
    private double finalExam;
    private String infoNote;
    private String name;
    private String surname;
    private String lessonName;
    private double midtermExam;


    public GizemGetPojo() {
    }

    public GizemGetPojo(int absentee, String educationTerm, double finalExam, String infoNote, String name, String surname, String lessonName, double midtermExam) {
        this.absentee = absentee;
        this.educationTerm = educationTerm;
        this.finalExam = finalExam;
        this.infoNote = infoNote;
        this.name = name;
        this.surname = surname;
        this.lessonName = lessonName;
        this.midtermExam = midtermExam;

    }

    public int getAbsentee() {
        return absentee;
    }

    public void setAbsentee(int absentee) {
        this.absentee = absentee;
    }

    public String getEducationTerm() {
        return educationTerm;
    }

    public void setEducationTerm(String educationTerm) {
        this.educationTerm = educationTerm;
    }

    public double getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }

    public String getInfoNote() {
        return infoNote;
    }

    public void setInfoNote(String infoNote) {
        this.infoNote = infoNote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public double getMidtermExam() {
        return midtermExam;
    }

    public void setMidtermExam(double midtermExam) {
        this.midtermExam = midtermExam;
    }


    @Override
    public String toString() {
        return "GizemGetPojo{" +
                "absentee=" + absentee +
                ", educationTerm='" + educationTerm + '\'' +
                ", finalExam=" + finalExam +
                ", infoNote='" + infoNote + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lessonName='" + lessonName + '\'' +
                ", midtermExam=" + midtermExam +
                '}';
    }
}