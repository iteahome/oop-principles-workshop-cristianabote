package ro.facebook.model;

import java.util.List;

public class FacebookAccount {
    private LoginUser user;
    private List<Friend> friendsList;
    private List<Post> myPosts;
    private Post myStory;
    private PersonalInfo generalInformation;
    private List<Messenger> conversation;

    public FacebookAccount(LoginUser user, List<Friend> friendsList, List<Post> myPosts, Post myStory, PersonalInfo generalInformation, List<Messenger> conversation) {
        this.user = user;
        this.friendsList = friendsList;
        this.myPosts = myPosts;
        this.myStory = myStory;
        this.generalInformation = generalInformation;
        this.conversation = conversation;
    }

    public LoginUser getUser() {
        return user;
    }

    public void setUser(LoginUser user) {
        this.user = user;
    }

    public List<Friend> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(List<Friend> friendsList) {
        this.friendsList = friendsList;
    }

    public List<Post> getMyPosts() {
        return myPosts;
    }

    public void setMyPosts(List<Post> myPosts) {
        this.myPosts = myPosts;
    }

    public Post getMyStory() {
        return myStory;
    }

    public void setMyStory(Post myStory) {
        this.myStory = myStory;
    }

    public PersonalInfo getGeneralInformation() {
        return generalInformation;
    }

    public void setGeneralInformation(PersonalInfo generalInformation) {
        this.generalInformation = generalInformation;
    }

    public List<Messenger> getConversation() {
        return conversation;
    }

    public void setConversation(List<Messenger> conversation) {
        this.conversation = conversation;
    }
}




