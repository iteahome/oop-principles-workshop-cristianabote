package ro.facebook.model;

import java.util.List;

public class Messenger {
    private LoginUser recipient;
    private List<Message> messageArchive;

    public Messenger(LoginUser recipient, List<Message> messageArchive) {
        this.recipient = recipient;
        this.messageArchive = messageArchive;
    }

    public LoginUser getRecipient() {
        return recipient;
    }

    public void setRecipient(LoginUser recipient) {
        this.recipient = recipient;
    }

    public List<Message> getMessageArchive() {
        return messageArchive;
    }

    public void setMessageArchive(List<Message> messageArchive) {
        this.messageArchive = messageArchive;
    }
}
