package test.AbdullahHocaDersTekrar.Day6;

public class Ogrenci {
    /*
    1. BU PROGRAMDA ÖĞRENCİ KAYITLARI İLE İLGİLİ İŞLEMLER YAPILABİLMEKTEDİR. KAYITLARDA ŞU BİLGİLER OLMALIDIR:
	-AD SOYAD
	-KİMLİK NO
	-YAŞ
	-NUMARA
	-SINIF  BİLGİLERİNİ İÇERMELİDİR.
     */
    private String ad;
    private  String sAd;
    private String tcNo;
    private  int numara;
    private int yas;
    private String sinif;

    public Ogrenci(String ad, String sAd, String tcNo, int numara, int yas, String sinif) {
        this.ad = ad;
        this.sAd = sAd;
        this.tcNo = tcNo;
        this.numara = numara;
        this.yas = yas;
        this.sinif = sinif;
    }

    public Ogrenci() {

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getsAd() {
        return sAd;
    }

    public void setsAd(String sAd) {
        this.sAd = sAd;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return
                "ÖĞRENCİNİN ADI= " + ad + "\n" +
                        "ÖĞRENCİNİN SOYADI= " + sAd + "\n" +
                        "ÖĞRENCİNİN TC NUMARASI= " + tcNo + "\n" +
                        "ÖĞRENCİNİN YAŞI=" + yas +"\n"+
                        "ÖĞRENCİNİN NUMARASI= " + numara +"\n"+
                        "ÖĞRECİNİN SINIF=" + sinif;
    }
}
