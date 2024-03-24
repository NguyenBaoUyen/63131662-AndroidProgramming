package ntu.nguyenbaouyen63131662;

public abstract class SanPham {
	private String msp;
	private String tensp;
	private float soluong;
	private float dongia;
	abstract float tinhtien();
	
	public SanPham(String msp, String tensp, float soluong, float dongia) {
		setDongia(dongia);
		setMsp(msp);
		setTensp(tensp);
		setSoluong(soluong);
	}
	String getMsp() {
		return msp;
	}
	void setMsp(String msp) {
		this.msp = msp;
	}
	String getTensp() {
		return tensp;
	}
	void setTensp(String tensp) {
		this.tensp = tensp;
	}
	float getSoluong() {
		return soluong;
	}
	void setSoluong(float soluong) {
		this.soluong = soluong;
	}
	float getDongia() {
		return dongia;
	}
	void setDongia(float dongia) {
		this.dongia = dongia;
	}
	
}
