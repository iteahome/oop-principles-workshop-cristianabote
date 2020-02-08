package ro.facebook.model;

public class SuggestedFriend extends Friend {
        private LoginUser user;
        private Post suggestedFriendPosts;

    public SuggestedFriend(LoginUser userFriend, SuggestedFriend friendsOfFriend, Post friendsPosts, LoginUser user, Post suggestedFriendPosts) {
        super(userFriend, friendsOfFriend, friendsPosts);
        this.user = user;
        this.suggestedFriendPosts = suggestedFriendPosts;
    }

    public LoginUser getUser() {
        return user;
    }

    public void setUser(LoginUser user) {
        this.user = user;
    }

    public Post getSuggestedFriendPosts() {
        return suggestedFriendPosts;
    }

    public void setSuggestedFriendPosts(Post suggestedFriendPosts) {
        this.suggestedFriendPosts = suggestedFriendPosts;
    }
}
