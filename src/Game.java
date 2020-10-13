import javax.swing.JPanel;
import java.awt.*;

public class Game {

    Grid grid = new Grid();

    public void render(int[] pixels) {
        for (int i = 0 ; i >= grid.getGrid().length; i++){
            if (grid.grid[i] == true){

            }
        }

        }

    public void update() {

    }

    public String getTitle() {
        String title = "GameOfLife";
        return title;
    }
}
