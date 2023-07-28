package api_pojo;

public class StudentResponsePojo {
    /*
     "studentResponse": {
            "userId": 1302,
            "username": "student_andrey",
            "name": "student_andrey",
            "surname": "kemal",
            "birthDay": "2001-03-02",
            "birthPlace": "VLISSINGEN",
            "phoneNumber": "345-655-3456",
            "gender": "MALE",
            "studentNumber": 2295,
            "motherName": "emke",
            "fatherName": "peter",
            "email": "asb@gmail.com",
            "active": true
        },
     */
    private Integer userId;
    private String username;
    private String name;
    private String surname;
    private String birthDay;
    private String birthPlace;
    private String PhoneNumber;
    private String gender;
    private Integer studentNumber;
    private String motherName;
    private String fatherName;
    private String email;
    private Boolean active;

    public StudentResponsePojo(){

    }

    public StudentResponsePojo(Integer userId, String username, String name, String surname, String birthDay, String birthPlace, String phoneNumber, String gender, Integer studentNumber, String motherName, String fatherName, String email, Boolean active) {
        this.userId = userId;
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
        PhoneNumber = phoneNumber;
        this.gender = gender;
        this.studentNumber = studentNumber;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.email = email;
        this.active = active;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "StudentResponsePojo{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", studentNumber=" + studentNumber +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", email='" + email + '\'' +
                ", active=" + active +
                '}';
    }
}
