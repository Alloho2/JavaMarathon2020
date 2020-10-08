package day17;

public class ChessBoard {
    private ChessPiece[][] chessPiece;

    public ChessBoard(ChessPiece[][] chessPiece) {
        this.chessPiece = chessPiece;
        for (int i = 0; i < chessPiece.length; i++) {
            for (int j = 0; j < chessPiece[0].length; j++) {
                if (chessPiece[i][j] == null) {
                    chessPiece[i][j] = ChessPiece.EMPTY;
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < chessPiece.length; i++) {
            for (int j = 0; j < chessPiece[0].length; j++) {
                System.out.print(chessPiece[i][j]);
            }
            System.out.println();
        }
    }
}
