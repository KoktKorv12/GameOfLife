public class Grid{

    public boolean[] grid = new boolean[36];
    public Cell[] cellGenerator = new Cell[36];

    public boolean[] getGrid() {
        return grid;
    }

    public void setGrid(boolean[] grid) {
        this.grid = grid;
    }

    public Cell[] getCellGenerator() {
        return cellGenerator;
    }

    public void setCellGenerator(Cell[] cellGenerator) {
        this.cellGenerator = cellGenerator;
    }

    public boolean[] populate() {
        Cell[] cellGenerator;
        cellGenerator = new Cell[36];

    boolean[] grid;
        grid = new boolean[36];
        for(int i = 0 ; i < grid.length; i++){
                if (Math.random() < 0.5){
                    grid[i] = true;
                    cellGenerator[i] = new Cell(grid[i]);
                } else
                    grid[i] = false;
        }
        return grid;
    }
}
