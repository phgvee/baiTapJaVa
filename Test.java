public class Test {
    public static void main(String[] args) {
       Ngay d1 = new Ngay(28, 10, 2003);
       Ngay d2 = new Ngay(03, 06, 2003);

       TacGia tg1 = new TacGia("Victor_Hugo",d1);
       TacGia tg2 = new TacGia("Colleen McCulough",d2);
       

       Sach s1 = new Sach("Nhung nguoi khon kho",8000,2021,tg1);
       Sach s2 = new Sach("Tieng chim hot trong bui man gai",9000,2022,tg2);
       System.out.println("----------Quan Ly Sach---------------- ");
       s1.inTenSach();
       s2.inTenSach();
       System.out.println("---------------------------------------");

       System.out.println("Kiem tra sach co bang nhau: "+s1.kiemTraCungNamXuatBan(s2));
       System.out.println("Gia sach1 sau khi giam: "+ s1.giaSauKhiGiam(10));
       System.out.println("Gia sach2 sau khi giam: "+ s1.giaSauKhiGiam(10));
       
       


    }
}
