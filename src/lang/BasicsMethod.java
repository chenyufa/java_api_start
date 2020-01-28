package lang;

/**
 * Created by CYF
 * on 2019/4/5.
 */
public class BasicsMethod {



    public static  void append(){
        String b = null;
        String c = null;
        StringBuffer ab = new StringBuffer("1");
        ab.append(b);
        ab.append(c);
        System.out.println(ab.length());
        System.out.println(ab.toString());
    }

    public static void main(String[] args) {
        append();

    }

}
