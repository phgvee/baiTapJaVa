public class TacGia {
    private String tenTacGia;
    private Ngay ngaySinh;
    
    public TacGia(String tenTacGia, Ngay ngaySinh){
         this.tenTacGia = tenTacGia;
         this.ngaySinh = ngaySinh;
    }
    public String gettenTacGia(){
        return tenTacGia;
    }
    public void settenTacGia(String tenTacGia){
        this.tenTacGia = tenTacGia;
    }
    public Ngay getngaySinh(){
        return ngaySinh;
    }
    public void setngaySinh(Ngay ngaySinh){
       this.ngaySinh = ngaySinh;
    }
}
