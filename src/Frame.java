import javax.swing.*;

public class Frame extends JFrame {

    public Frame() {

        add(new Game());

        setSize(800, 800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new Frame();
    }
}
