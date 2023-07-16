package utilities;

import java.util.List;

public class US01_Pojo {
    private List<Content02Pojo> content;
    public US01_Pojo(){

    }

    public US01_Pojo(List<Content02Pojo> content) {

        this.content = content;
    }

    public List<Content02Pojo> getContent() {
        return content;
    }

    public void setContent(List<Content02Pojo> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ContactMessagePojo{" +
                "content=" + content +
                '}';
    }
}
