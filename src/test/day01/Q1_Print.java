package test.day01;

public class Q1_Print {
    public static void main(String[] args) {
        /*
    Konsolda :

    "Hello "\
    / 'World'"

    yazdiriniz.
*/

    /*
	  \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
	          \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
	          \\  : Prints a back slash    : \  Ters slash yazdırır
	          \'  : Prints single quote    : '  Tek tırnak yazdırır.bunu sadece char ile karismasin diye yapariz normalde' de yazabilirdik
	          \"  : Prints double quote    : "  Çift tırnak yazdırır.
	 */
        System.out.println("\"Hello \"\\\n/ \'World\'\"");
        System.out.println("' ");
        System.out.println();
        System.out.println();//alt tusuna basili tutarak imlecini yukari asagi ilerleterek coklu satira mudahale edebiliriz£
    }
}
