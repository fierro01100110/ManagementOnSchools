package api_pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentInfoUpgradePojo {
    public StudentObjectPojo objectPojo;
    public String message;
    public String httpStatus;

    public StudentInfoUpgradePojo (){

    }

    public StudentInfoUpgradePojo(StudentObjectPojo object, String message, String httpStatus) {
        this.objectPojo = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public StudentObjectPojo getObject() {
        return objectPojo;
    }

    public void setObject(StudentObjectPojo object) {
        this.objectPojo = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        return "StudentInfoUpgradePojo{" +
                "object=" + objectPojo +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
