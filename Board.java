import java.util.Arrays;


public class Board {
    int BOARD_SIZE = 8;
    Piece.TEAM curr_player;
    Piece[][] board;

    public Board(){
        board = new Piece[][]{
            {Piece.BLACK_ROOK, Piece.BLACK_KNIGHT, Piece.BLACK_BISHOP, Piece.BLACK_QUEEN, Piece.BLACK_KING, Piece.BLACK_BISHOP, Piece.BLACK_KNIGHT, Piece.BLACK_ROOK},
            {Piece.BLACK_PAWN, Piece.BLACK_PAWN,   Piece.BLACK_PAWN,   Piece.BLACK_PAWN,  Piece.BLACK_PAWN, Piece.BLACK_PAWN,   Piece.BLACK_PAWN,   Piece.BLACK_PAWN},
            {null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null},
            {Piece.WHITE_PAWN, Piece.WHITE_PAWN,   Piece.WHITE_PAWN,   Piece.WHITE_PAWN,  Piece.WHITE_PAWN, Piece.WHITE_PAWN,   Piece.WHITE_PAWN,   Piece.WHITE_PAWN},
            {Piece.WHITE_ROOK, Piece.WHITE_KNIGHT, Piece.WHITE_BISHOP, Piece.WHITE_QUEEN, Piece.WHITE_KING, Piece.WHITE_BISHOP, Piece.WHITE_KNIGHT, Piece.WHITE_ROOK}
        };

        curr_player = Piece.TEAM.WHITE;
    }

    public boolean move(int[] p1, int[] p2) {
        board[p2[0]][p2[1]] = board[p1[0]][p1[1]]; 
        board[p1[0]][p1[1]] = null;
        return true;
    }

    public String toString() {
        return Arrays.deepToString(board)
        .replace("],", "],\n")
        .replace(",", ",\t")
        .replace("null,", "null,\t");
    }
}