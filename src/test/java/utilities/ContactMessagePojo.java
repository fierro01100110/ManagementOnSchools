package utilities;

import java.util.List;

public class ContactMessagePojo {
    private List<Content> content;
    public ContactMessagePojo(){

    }

    public ContactMessagePojo(List<Content> content) {

        this.content = content;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ContactMessagePojo{" +
                "content=" + content +
                '}';
    }
}
