package ro.iteahome.facebook.model;

public class message {
    private login_user  autor_mesaj;
    private post mesaj;

    public message(login_user autor_mesaj, post mesaj) {
        this.autor_mesaj = autor_mesaj;
        this.mesaj = mesaj;
    }

    public login_user getAutor_mesaj() {
        return autor_mesaj;
    }

    public void setAutor_mesaj(login_user autor_mesaj) {
        this.autor_mesaj = autor_mesaj;
    }

    public post getMesaj() {
        return mesaj;
    }

    public void setMesaj(post mesaj) {
        this.mesaj = mesaj;
    }
}
