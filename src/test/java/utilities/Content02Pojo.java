package utilities;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Content02Pojo {

    private String name;
    private String surname;
    private String birth_place;
    private String gender;
    private String birth_date;
    private String ssn;
    private String username;
    private String phone_number;
public Content02Pojo(){

}
    public Content02Pojo(String name, String surname, String birth_place, String gender, String birth_date, String ssn, String username, String phone_number) {
        this.name = name;
        this.surname = surname;
        this.birth_place = birth_place;
        this.gender = gender;
        this.birth_date = birth_date;
        this.ssn = ssn;
        this.username = username;
        this.phone_number = phone_number;
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

    public String getBirth_place() {
        return birth_place;
    }

    public void setBirth_place(String birth_place) {
        this.birth_place = birth_place;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Content02Pojo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birth_place='" + birth_place + '\'' +
                ", gender='" + gender + '\'' +
                ", birth_date='" + birth_date + '\'' +
                ", ssn='" + ssn + '\'' +
                ", username='" + username + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
