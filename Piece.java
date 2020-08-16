public enum Piece {
    BLACK_PAWN (TYPE.PAWN, TEAM.BLACK),
    BLACK_ROOK (TYPE.ROOK, TEAM.BLACK),
    BLACK_KNIGHT (TYPE.KNIGHT, TEAM.BLACK),
    BLACK_BISHOP (TYPE.BISHOP, TEAM.BLACK),
    BLACK_QUEEN (TYPE.QUEEN, TEAM.BLACK),
    BLACK_KING (TYPE.KING, TEAM.BLACK),

    WHITE_PAWN (TYPE.PAWN, TEAM.WHITE),
    WHITE_ROOK (TYPE.ROOK, TEAM.WHITE),
    WHITE_KNIGHT (TYPE.KNIGHT, TEAM.WHITE),
    WHITE_BISHOP (TYPE.BISHOP, TEAM.WHITE),
    WHITE_QUEEN (TYPE.QUEEN, TEAM.WHITE),
    WHITE_KING (TYPE.KING, TEAM.WHITE);

    enum TYPE{
        KING,
        QUEEN,
        BISHOP,
        PAWN,
        KNIGHT,
        ROOK;
    }

    enum TEAM{
        WHITE,
        BLACK;
    }

    TYPE type;
    TEAM team;

    Piece(TYPE type, TEAM team){
        this.type=type;
        this.team=team;
    }

}