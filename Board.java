import java.util.Arrays;


public class Board {
    int BOARD_SIZE = 8;
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
    }

    public boolean move(int[] curr_pos, int[] moveTo_pos) {
        // int[] -> [rank, (int)file] ie: a2 -> [2, 0]
        board[moveTo_pos[0]][moveTo_pos[1]] = board[curr_pos[0]][curr_pos[1]]; 
        board[curr_pos[0]][curr_pos[1]] = null;
        return true;
    }

    public String toString() {
        return Arrays.deepToString(board)
        .replace("],", "],\n")
        .replace(",", ",\t")
        .replace("null]", "null ]")
        .replaceAll("null.{1}", "    .    ");
    }
}