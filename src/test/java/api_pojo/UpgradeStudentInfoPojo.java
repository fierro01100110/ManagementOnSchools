package api_pojo;

public class UpgradeStudentInfoPojo {
    private String lessonName;
    private String educationTerm;
    private int absentee;
    private int midtermExam;
    private int finalExam;
    private String infoNote;

    public UpgradeStudentInfoPojo () {

    }

    public UpgradeStudentInfoPojo(String lessonName, String educationTerm, int absentee, int midtermExam, int finalExam, String infoNote) {
        this.lessonName = lessonName;
        this.educationTerm = educationTerm;
        this.absentee = absentee;
        this.midtermExam = midtermExam;
        this.finalExam = finalExam;
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

    public int getAbsentee() {
        return absentee;
    }

    public void setAbsentee(int absentee) {
        this.absentee = absentee;
    }

    public int getMidtermExam() {
        return midtermExam;
    }

    public void setMidtermExam(int midtermExam) {
        this.midtermExam = midtermExam;
    }

    public int getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(int finalExam) {
        this.finalExam = finalExam;
    }

    public String getInfoNote() {
        return infoNote;
    }

    public void setInfoNote(String infoNote) {
        this.infoNote = infoNote;
    }

    @Override
    public String toString() {
        return "UpgradeStudentInfoPojo{" +
                "lessonName='" + lessonName + '\'' +
                ", educationTerm='" + educationTerm + '\'' +
                ", absentee=" + absentee +
                ", midtermExam=" + midtermExam +
                ", finalExam=" + finalExam +
                ", infoNote='" + infoNote + '\'' +
                '}';
    }
}
