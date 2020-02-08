package ro.facebook.model;

public class LoginUser {
    private String name;
    private String password;
    private String email;
    private Boolean administrator;

    public LoginUser(String name, String password, String email, Boolean administrator) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.administrator = administrator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Boolean administrator) {
        this.administrator = administrator;
    }
}

