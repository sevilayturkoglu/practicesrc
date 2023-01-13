package test.AbdullahHocaDersTekrar.ATM_SORU;

public class Kullanici {
    private String kartNo;
    private String sifre;
    private double bakiye;

    public Kullanici() {
    }

    public Kullanici(String kartNo, String sifre, double bakiye) {
        this.kartNo = kartNo;
        this.sifre = sifre;
        this.bakiye = bakiye;
    }

    public String getKartNo() {
        return kartNo;
    }

    public void setKartNo(String kartNo) {
        this.kartNo = kartNo;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public  double getBakiye() {
        return bakiye;
    }

    public  void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}

