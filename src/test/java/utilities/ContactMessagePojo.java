package utilities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactMessagePojo {
    private String name;
    private String subject;
    private String message;
    private String email;

    public ContactMessagePojo(){

    }

    public ContactMessagePojo(String name, String subject, String message, String email) {
        this.name = name;
        this.subject = subject;
        this.message = message;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactMessagePojo{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
