package ro.iteahome.facebook.model;

public class login_user {
    private String nume;
    private String parola;
    private String email;
    private Boolean administrator;

    public login_user(String nume, String parola, String email, Boolean administrator) {
        this.nume = nume;
        this.parola = parola;
        this.email = email;
        this.administrator = administrator;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
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
