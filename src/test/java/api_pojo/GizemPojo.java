package api_pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class GizemPojo {

    private String name;
    private String surname;
    private double midtermExam;
    private double finalExam;
    private int absentee;
    private String infoNote;
    private String lessonName;
    private String educationTerm;
    private int id;
    private int creditScore;
    private double average;
    private StudentResponsePojo studentResponsePojo;
    private boolean compulsory;
    private String note;

    public GizemPojo() {
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

    public double getMidtermExam() {
        return midtermExam;
    }

    public void setMidtermExam(double midtermExam) {
        this.midtermExam = midtermExam;
    }

    public double getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }

    public int getAbsentee() {
        return absentee;
    }

    public void setAbsentee(int absentee) {
        this.absentee = absentee;
    }

    public String getInfoNote() {
        return infoNote;
    }

    public void setInfoNote(String infoNote) {
        this.infoNote = infoNote;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getEducationTerm() {
        return educationTerm;
    }

    public void setEducationTerm(String educationTerm) {
        this.educationTerm = educationTerm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public StudentResponsePojo getStudentResponsePojo() {
        return studentResponsePojo;
    }

    public void setStudentResponsePojo(StudentResponsePojo studentResponsePojo) {
        this.studentResponsePojo = studentResponsePojo;
    }

    public boolean isCompulsory() {
        return compulsory;
    }

    public void setCompulsory(boolean compulsory) {
        this.compulsory = compulsory;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "GizemPojo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", midtermExam=" + midtermExam +
                ", finalExam=" + finalExam +
                ", absentee=" + absentee +
                ", infoNote='" + infoNote + '\'' +
                ", lessonName='" + lessonName + '\'' +
                ", educationTerm='" + educationTerm + '\'' +
                ", id=" + id +
                ", creditScore=" + creditScore +
                ", average=" + average +
                ", studentResponsePojo=" + studentResponsePojo +
                ", compulsory=" + compulsory +
                ", note='" + note + '\'' +
                '}';
    }
}

