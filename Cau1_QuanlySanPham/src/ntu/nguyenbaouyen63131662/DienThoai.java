package ntu.nguyenbaouyen63131662;
public class DienThoai extends SanPham{

	public DienThoai(String msp, String tensp, float soluong, float dongia) {
		super(msp, tensp, soluong, dongia);
		// TODO Auto-generated constructor stub
	}

	@Override
	float tinhtien() {
		// TODO Auto-generated method stub
		float tt=(float)(getDongia())*(getSoluong());
		return tt;
	}

}
