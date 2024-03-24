package ntu.nguyenbaouyen63131662;
public class MayTinh extends SanPham {

	public MayTinh(String msp, String tensp, float soluong, float dongia) {
		super(msp, tensp, soluong, dongia);
		// TODO Auto-generated constructor stub
	}

	@Override
	float tinhtien() {
		// TODO Auto-generated method stub
		float tt=(getDongia())*(getSoluong());
		return tt;
	}
	

}
