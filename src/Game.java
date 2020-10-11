import javax.swing.JPanel;
import java.awt.*;

public class Game extends JPanel {

    public Game() {

        setSize(800, 800);
        setLayout(null);

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        setBackground(Color.BLACK);
    }

}
