public class kiemthu {
    public kiemthu () {
    }
    public static String tinhtoan(int n, String chuoi_dauvao) {
        String chuoi = chuoi_dauvao.toLowerCase().replace("\n", "");
        if (chuoi.equals("tre em") && n >= 100) {
            return "Giam gia 20%";
        }
        else if (chuoi.equals("tre em") && n >= 50) {
            return "Giam gia 10%";
        }
        else if (chuoi.equals("tre em") && n >= 0) {
            return "Giam gia 5%";
        }
        else if (chuoi.equals("nguoi lon") && n >= 100) {
            return "Giam gia 10%";
        }
        else if (chuoi.equals("nguoi lon") && n >= 50) {
            return "Giam gia 5%";
        }
        else if (chuoi.equals("nguoi lon") && n >= 0) {
            return "Khong duoc giam gia";
        }
        else
            return "Du lieu dau vao khong hop le";
    }
}
