public class Main {
    public static void main(String[] args) {

        Account an = new Account("An", 500_000);
        Account binh = new Account("Bình", 0);

        an.deposit(200_000);
        boolean ok = binh.withdraw(50_000);

        an.inThongTin();
        binh.inThongTin();
        System.out.println("Bình rút được không? " + ok);

        int soTaiKhoan = 2;
        long tong = an.balance + binh.balance;
        System.out.println("Tổng số tài khoản: " + soTaiKhoan);
        System.out.println("Tổng số dư: " + tong);

        String[] cacTenCanTim = {"An", "Bình"};

        for (String tenCanTim : cacTenCanTim) {
            Account found = null;

            if (an.owner.equals(tenCanTim)) {
                found = an;
            } else if (binh.owner.equals(tenCanTim)) {
                found = binh;
            }

            if (found != null) {
                System.out.print("Tìm thấy: ");
                found.inThongTin();
            } else {
                System.out.println("Không tìm thấy " + tenCanTim);
            }
        }
    }
}