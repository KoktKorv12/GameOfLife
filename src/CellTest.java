public class CellTest {
    public static void main(String[] args) {

        Cell c = new Cell(false);
        System.out.println(c.isState());

        c.setNewState(true);
        c.setState(c.isNewState());
        System.out.println(c.isState());
    }
}
