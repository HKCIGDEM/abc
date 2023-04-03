package daily_videos.day11_string;

public class StringMethods3 {
    public static void main(String[] args) {

       String  word = "Java";

       boolean r1 = word.isEmpty();

       System.out.println(r1);

       //---------------------------------------------------

        String str = "          ";

        boolean r2 = str.isEmpty();

        boolean r3 = str.isBlank();

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        //---------------------------------------------------

        String str1 ="Cydeo";
        String  str2 = new String("Cydeo");

        System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));

        String str3 = new String("cydeo");

        System.out.println(str2.equals(str3));

        //----------------------------------------

        String  s1 = "Java";
        String s2 = "java";

        System.out.println(s1.equals(s2)); // false buyuk harf kucuk harf yuzunden yanlis

        System.out.println(s1.equalsIgnoreCase(s2)); // true "ignore ==> gormezden gel demek

        //--------------------------------------------------------------

        String  student = "Hasan Naran Sumeyye Nataliia";

        boolean hasAhmed = student.contains("Ahmed");

        System.out.println( "hasAhmet = " + hasAhmed);

        String sentence = "My favorite programming language is JAVA";

        boolean hasJava = sentence.toLowerCase().contains("java");

        System.out.println("hasJava = " + hasJava);

        //----------------------------------------------------------------------------

        String name = "Michael";

        boolean l = name.startsWith("Da");

        System.out.println(l);

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.");

        System.out.println(isValid);

        boolean t = url.endsWith(".com");

        System.out.println(t);

        //-------------------------------------------------

        String email = "CydeoSchoole@gmail.com"; // eger burasi @outlook.com olsaydi bu defa hepsi yanlis olurdu

        boolean isGmail = email.endsWith("gmail.com");

        boolean isYahoo = email.endsWith("yahoo.com");

        boolean isHotMail = email.endsWith("hotmail.com");

        System.out.println("isGmail = "+isGmail);
        System.out.println( "isYahoo = " + isYahoo);
        System.out.println("isHotMail = " + isHotMail);

    }
}
