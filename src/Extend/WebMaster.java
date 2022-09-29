package Extend;

public class WebMaster extends User {
    String web;

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public WebMaster(int id, String login, String password, String web) {
        super(id, login, password);
        this.web = web;

    }

    public WebMaster() {
        super();
        this.web = "mark.com";
    }

    public String getTextInfo() {
        String s = super.getTextInfo();
        s += "; Web " + this.web;
        return s;
    }
}

