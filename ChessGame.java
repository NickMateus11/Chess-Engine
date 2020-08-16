public class ChessGame {
    public Board board;
    // Player curr_player;

    public ChessGame() {
        board = new Board();
    }

    public void print_state() {
        System.out.println(this.toString());
    }

    public String toString() {
        return board.toString();
    }
}