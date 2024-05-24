package ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Domains;

public class FutureDomains {
    private String ngay;
    private String duongDan;
    private String trangThai;
    private int doCao;
    private int doThap;


    public FutureDomains(String ngay, String duongDan, String trangThai, int doCao, int doThap) {
        this.ngay = ngay;
        this.duongDan = duongDan;
        this.trangThai = trangThai;
        this.doCao = doCao;
        this.doThap = doThap;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getDuongDan() {
        return duongDan;
    }

    public void setDuongDan(String duongDan) {
        this.duongDan = duongDan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getDoCao() {
        return doCao;
    }

    public void setDoCao(int doCao) {
        this.doCao = doCao;
    }

    public int getDoThap() {
        return doThap;
    }

    public void setDoThap(int doThap) {
        this.doThap = doThap;
    }
}
