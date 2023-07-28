package api_pojo;

public class StudentObjectPojo {
    public int id;
    public double midtermExam;
    public double finalExam;
    public int absentee;
    public String infoNote;
    public String lessonName;
    public int creditScore;
    public String educationTerm;
    public double average;
    public StudentResponsePojo studentResponse;
    public boolean compulsory;
    public String note;

    public StudentObjectPojo(){

    }

    public StudentObjectPojo(int id, double midtermExam, double finalExam, int absentee, String infoNote, String lessonName, int creditScore, String educationTerm, double average, StudentResponsePojo studentResponse, boolean compulsory, String note) {
        this.id = id;
        this.midtermExam = midtermExam;
        this.finalExam = finalExam;
        this.absentee = absentee;
        this.infoNote = infoNote;
        this.lessonName = lessonName;
        this.creditScore = creditScore;
        this.educationTerm = educationTerm;
        this.average = average;
        this.studentResponse = studentResponse;
        this.compulsory = compulsory;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getEducationTerm() {
        return educationTerm;
    }

    public void setEducationTerm(String educationTerm) {
        this.educationTerm = educationTerm;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public StudentResponsePojo getStudentResponse() {
        return studentResponse;
    }

    public void setStudentResponse(StudentResponsePojo studentResponse) {
        this.studentResponse = studentResponse;
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
        return "StudentObjectPojo{" +
                "id=" + id +
                ", midtermExam=" + midtermExam +
                ", finalExam=" + finalExam +
                ", absentee=" + absentee +
                ", infoNote='" + infoNote + '\'' +
                ", lessonName='" + lessonName + '\'' +
                ", creditScore=" + creditScore +
                ", educationTerm='" + educationTerm + '\'' +
                ", average=" + average +
                ", studentResponse=" + studentResponse +
                ", compulsory=" + compulsory +
                ", note='" + note + '\'' +
                '}';
    }
}
