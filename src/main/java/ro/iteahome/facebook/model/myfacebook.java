package ro.iteahome.facebook.model;

import java.util.List;

public class myfacebook {
    private login_user utilizator;
    private List<login_user> lista_prieteni;
    private List<post> postarile_mele;
    private post mystory;
    private personal_info general_information;
    private List<messenger> conversatii;

    public myfacebook(login_user utilizator, List<login_user> lista_prieteni, List<post> postarile_mele, post mystory, personal_info general_information, List<messenger> conversatii) {
        this.utilizator = utilizator;
        this.lista_prieteni = lista_prieteni;
        this.postarile_mele = postarile_mele;
        this.mystory = mystory;
        this.general_information = general_information;
        this.conversatii = conversatii;
    }

    public login_user getUtilizator() {
        return utilizator;
    }

    public void setUtilizator(login_user utilizator) {
        this.utilizator = utilizator;
    }

    public List<login_user> getLista_prieteni() {
        return lista_prieteni;
    }

    public void setLista_prieteni(List<login_user> lista_prieteni) {
        this.lista_prieteni = lista_prieteni;
    }

    public List<post> getPostarile_mele() {
        return postarile_mele;
    }

    public void setPostarile_mele(List<post> postarile_mele) {
        this.postarile_mele = postarile_mele;
    }

    public post getMystory() {
        return mystory;
    }

    public void setMystory(post mystory) {
        this.mystory = mystory;
    }

    public personal_info getGeneral_information() {
        return general_information;
    }

    public void setGeneral_information(personal_info general_information) {
        this.general_information = general_information;
    }

    public List<messenger> getConversatii() {
        return conversatii;
    }

    public void setConversatii(List<messenger> conversatii) {
        this.conversatii = conversatii;
    }
}
