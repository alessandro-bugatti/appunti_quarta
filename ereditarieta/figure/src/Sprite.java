import javax.swing.text.html.ImageView;
import java.awt.*;

public class Sprite implements OggettoGrafico{
    Image im;
    ImageView iv;
    @Override
    public void sposta(double dx, double dy) {

    }

    @Override
    public void disegna() {
        iv.paint(null, null);
    }
}
