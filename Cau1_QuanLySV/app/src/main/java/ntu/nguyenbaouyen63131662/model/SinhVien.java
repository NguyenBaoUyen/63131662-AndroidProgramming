package ntu.nguyenbaouyen63131662.model;

import java.io.Serializable;

public class SinhVien implements Serializable {
    private  String _ID;
    private  String _Name;
    private Boolean gioitinh;
    public SinhVien(){

    }

    public SinhVien(String _ID, String _Name, Boolean gioitinh) {
        this._ID = _ID;
        this._Name = _Name;
        this.gioitinh = gioitinh;
    }

    public String get_ID() {
        return _ID;
    }

    public void set_ID(String _ID) {
        this._ID = _ID;
    }

    public String get_Name() {
        return _Name;
    }

    public void set_Name(String _Name) {
        this._Name = _Name;
    }

    public Boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Boolean gioitinh) {
        this.gioitinh = gioitinh;
    }
}
