package ro.facebook.model;

public class Message {
    private LoginUser messageWriter;
    private Post comment;

    public Message(LoginUser messageWriter, Post comment) {
        this.messageWriter = messageWriter;
        this.comment = comment;
    }

    public LoginUser getMessageWriter() {
        return messageWriter;
    }

    public void setMessageWriter(LoginUser messageWriter) {
        this.messageWriter = messageWriter;
    }

    public Post getComment() {
        return comment;
    }

    public void setComment(Post comment) {
        this.comment = comment;
    }
}
