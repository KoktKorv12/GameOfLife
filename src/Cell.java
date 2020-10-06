public class Cell {
    private boolean state = false;
    private boolean newState;

    public Cell(boolean state) {
        this.state = state;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void setNewState(boolean newState) {
        this.newState = newState;
    }

    public boolean isNewState() {
        return newState;
    }
}