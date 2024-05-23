package ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Domains;

public class FutureDomains {
    private String ngày;
    private String đuongDan;
    private String trangThai;
    private int nhietDo;
    private int doAm;

    public FutureDomains(String ngày, String đuongDan, String trangThai, int nhietDo, int doAm) {
        this.ngày = ngày;
        this.đuongDan = đuongDan;
        this.trangThai = trangThai;
        this.nhietDo = nhietDo;
        this.doAm = doAm;
    }

    public String getNgày() {
        return ngày;
    }

    public void setNgày(String ngày) {
        this.ngày = ngày;
    }

    public String getĐuongDan() {
        return đuongDan;
    }

    public void setĐuongDan(String đuongDan) {
        this.đuongDan = đuongDan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getNhietDo() {
        return nhietDo;
    }

    public void setNhietDo(int nhietDo) {
        this.nhietDo = nhietDo;
    }

    public int getDoAm() {
        return doAm;
    }

    public void setDoAm(int doAm) {
        this.doAm = doAm;
    }
}
