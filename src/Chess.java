public class Chess {

    private Board board;

    public Chess() {
        board = new Board();
    }

    void gameSense() {
        board.resetPieces();
        while(true) {
            board.drawBoard();
            board.askGetPiece();
            board.getPiece(board.getCoordinate());
            board.getLastPosition();
            board.askMovePiece();
            board.setPiece(board.getNewCoordinate(), board.getActualPiece());
            System.out.println();
            board.drawBoard();
            board.setWhiteTurn(false);
            board.askGetPiece();
            board.getPiece(board.getCoordinate());
            board.getLastPosition();
            board.askMovePiece();
            board.setPiece(board.getNewCoordinate(), board.getActualPiece());
            board.setWhiteTurn(true);
            System.out.println();
        }
    }

}
