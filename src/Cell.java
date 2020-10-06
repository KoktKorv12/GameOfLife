public class Cell {
    private boolean state = false;
    private boolean newState;

    public Cell(boolean newState) {
        this.newState = newState;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}