package ro.iteahome.facebook.model;

import java.util.List;

public class messenger {
    private login_user destinatar;
    private List<message> istoric_mesaje;

    public messenger(login_user destinatar, List<message> istoric_mesaje) {
        this.destinatar = destinatar;
        this.istoric_mesaje = istoric_mesaje;
    }

    public login_user getDestinatar() {
        return destinatar;
    }

    public void setDestinatar(login_user destinatar) {
        this.destinatar = destinatar;
    }

    public List<message> getIstoric_mesaje() {
        return istoric_mesaje;
    }

    public void setIstoric_mesaje(List<message> istoric_mesaje) {
        this.istoric_mesaje = istoric_mesaje;
    }
}
