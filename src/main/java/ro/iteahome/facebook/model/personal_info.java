package ro.iteahome.facebook.model;

import java.util.Date;

public class personal_info {
    private Date data_nasterii;
    private String stare_civila;
    private String sex;
    private String oras;
    private String loc_de_munca;

    public personal_info(Date data_nasterii, String stare_civila, String sex, String oras, String loc_de_munca) {
        this.data_nasterii = data_nasterii;
        this.stare_civila = stare_civila;
        this.sex = sex;
        this.oras = oras;
        this.loc_de_munca = loc_de_munca;
    }

    public Date getData_nasterii() {
        return data_nasterii;
    }

    public void setData_nasterii(Date data_nasterii) {
        this.data_nasterii = data_nasterii;
    }

    public String getStare_civila() {
        return stare_civila;
    }

    public void setStare_civila(String stare_civila) {
        this.stare_civila = stare_civila;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getLoc_de_munca() {
        return loc_de_munca;
    }

    public void setLoc_de_munca(String loc_de_munca) {
        this.loc_de_munca = loc_de_munca;
    }
}
