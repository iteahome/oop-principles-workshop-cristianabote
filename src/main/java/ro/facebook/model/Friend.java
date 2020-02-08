package ro.facebook.model;

public class Friend {
    private LoginUser userFriend;
    private SuggestedFriend friendsOfFriend;
    private Post friendsPosts;

    public Friend(LoginUser userFriend, SuggestedFriend friendsOfFriend, Post friendsPosts) {
        this.userFriend = userFriend;
        this.friendsOfFriend = friendsOfFriend;
        this.friendsPosts = friendsPosts;
    }

    public LoginUser getUserFriend() {
        return userFriend;
    }

    public void setUserFriend(LoginUser userFriend) {
        this.userFriend = userFriend;
    }

    public SuggestedFriend getFriendsOfFriend() {
        return friendsOfFriend;
    }

    public void setFriendsOfFriend(SuggestedFriend friendsOfFriend) {
        this.friendsOfFriend = friendsOfFriend;
    }

    public Post getFriendsPosts() {
        return friendsPosts;
    }

    public void setFriendsPosts(Post friendsPosts) {
        this.friendsPosts = friendsPosts;
    }
}
