import net.imparando.*;

public class Main {
    public static void main(String[] args) {
        ContoCorrente c = new ContoCorrente("Gino", "Latilla");
        c.deposita(200);
        c.preleva(100);
        System.out.println(c);
    }
}