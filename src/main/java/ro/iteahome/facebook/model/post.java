package ro.iteahome.facebook.model;

public class post {
    private String foto;
    private String video;
    private String video_live;
    private String text;
    private String check_in;

    public post(String foto, String video, String video_live, String text, String check_in) {
        this.foto = foto;
        this.video = video;
        this.video_live = video_live;
        this.text = text;
        this.check_in = check_in;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getVideo_live() {
        return video_live;
    }

    public void setVideo_live(String video_live) {
        this.video_live = video_live;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCheck_in() {
        return check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }
}
