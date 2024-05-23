package ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Domains;

public class Hourly {
    private String gio;
    private int nhiet;
    private String duongDan;

    public String getGio() {
        return gio;
    }

    public void setGio(String gio) {
        this.gio = gio;
    }

    public int getNhiet() {
        return nhiet;
    }

    public void setNhiet(int nhiet) {
        this.nhiet = nhiet;
    }

    public String getDuongDan() {
        return duongDan;
    }

    public void setDuongDan(String duongDan) {
        this.duongDan = duongDan;
    }

    public Hourly(String gio, int nhiet, String duongDan) {
        this.gio = gio;
        this.nhiet = nhiet;
        this.duongDan = duongDan;
    }
}
