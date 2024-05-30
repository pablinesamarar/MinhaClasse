import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    /**
     * @param args
     * @throws ParseException 
     */
    public static void main(String[] args) throws ParseException {
    try {
        Number numero = NumberFormat.getInstance(null).parse("a1.75");
        System.out.println(numero);
    }catch (Exception e) {
        e.printStackTrace();
    }
    }
}
