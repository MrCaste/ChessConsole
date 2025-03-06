import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Board {

  private Piece actualPiece;
  private int lastRow = 0;
  private int lastColumn = 0;
  private int newRow = 0;
  private int newColumn = 0;
  private Scanner console = new Scanner(System.in);
  private boolean isWhiteTurn = true;
  private String coordinate = "";
  private String newCoordinate = "";
  private String board[][] = new String[8][8];
  private Piece pieces[][] = new Piece[8][8];
  private List<Piece> PiecesList = new ArrayList<>();

  public Board() {
    Piece blackPawn1 = new Piece("black", "p ", "a7");
    Piece blackPawn2 = new Piece("black", "p ", "b7");
    Piece blackPawn3 = new Piece("black", "p ", "c7");
    Piece blackPawn4 = new Piece("black", "p ", "d7");
    Piece blackPawn5 = new Piece("black", "p ", "e7");
    Piece blackPawn6 = new Piece("black", "p ", "f7");
    Piece blackPawn7 = new Piece("black", "p ", "g7");
    Piece blackPawn8 = new Piece("black", "p ", "h7");
    Piece blackRook1 = new Piece("black", "r ", "h8");
    Piece blackRook2 = new Piece("black", "r ", "a8");
    Piece blackKnight1 = new Piece("black", "h ", "b8");
    Piece blackKnight2 = new Piece("black", "h ", "g8");
    Piece blackBishop1 = new Piece("black", "b ", "c8");
    Piece blackBishop2 = new Piece("black", "b ", "f8");
    Piece blackQueen = new Piece("black", "q ", "d8");
    Piece blackKing = new Piece("black", "k ", "e8");
    Piece whitePawn1 = new Piece("white", "p ", "a2");
    Piece whitePawn2 = new Piece("white", "p ", "b2");
    Piece whitePawn3 = new Piece("white", "p ", "c2");
    Piece whitePawn4 = new Piece("white", "p ", "d2");
    Piece whitePawn5 = new Piece("white", "p ", "e2");
    Piece whitePawn6 = new Piece("white", "p ", "f2");
    Piece whitePawn7 = new Piece("white", "p ", "g2");
    Piece whitePawn8 = new Piece("white", "p ", "h2");
    Piece whiteRook1 = new Piece("white", "r ", "h1");
    Piece whiteRook2 = new Piece("white", "r ", "a1");
    Piece whiteKnight1 = new Piece("white", "h ", "b1");
    Piece whiteKnight2 = new Piece("white", "h ", "g1");
    Piece whiteBishop1 = new Piece("white", "b ", "c1");
    Piece whiteBishop2 = new Piece("white", "b ", "f1");
    Piece whiteQueen = new Piece("white", "q ", "d1");
    Piece whiteKing = new Piece("white", "k ", "e1");
    PiecesList.addAll(
        Arrays.asList(
            blackPawn1,
            blackPawn2,
            blackPawn3,
            blackPawn4,
            blackPawn5,
            blackPawn6,
            blackPawn7,
            blackPawn8,
            blackRook1,
            blackRook2,
            blackKnight1,
            blackKnight2,
            blackBishop1,
            blackBishop2,
            blackQueen,
            blackKing,
            whitePawn1,
            whitePawn2,
            whitePawn3,
            whitePawn4,
            whitePawn5,
            whitePawn6,
            whitePawn7,
            whitePawn8,
            whiteRook1,
            whiteRook2,
            whiteKnight1,
            whiteKnight2,
            whiteBishop1,
            whiteBishop2,
            whiteQueen,
            whiteKing));
  }

  public void setWhiteTurn(boolean isWhiteTurn) {
    this.isWhiteTurn = isWhiteTurn;
  }

  public String getCoordinate() {
    return coordinate;
  }

  public String getNewCoordinate() {
    return newCoordinate;
  }

  public Piece getActualPiece() {
    return actualPiece;
  }

  void drawBoard() {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (j % 2 == 0 && i % 2 == 0 || j % 2 != 0 && i % 2 != 0) {
          if (pieces[i][j] != null) {
            board[i][j] = pieces[i][j].getName().toUpperCase();
          } else {
            board[i][j] = "- ";
          }
          System.out.print(board[i][j]);
        } else if (j % 2 == 0 && i % 2 != 0 || j % 2 != 0 && i % 2 == 0) {
          if (pieces[i][j] != null) {
            board[i][j] = pieces[i][j].getName().toUpperCase();
          } else {
            board[i][j] = "* ";
          }
          System.out.print(board[i][j]);
        }
      }
      System.out.println();
    }
  }

  void resetPieces() {
    board[1][0] = PiecesList.get(0).getName();
    board[1][1] = PiecesList.get(1).getName();
    board[1][2] = PiecesList.get(2).getName();
    board[1][3] = PiecesList.get(3).getName();
    board[1][4] = PiecesList.get(4).getName();
    board[1][5] = PiecesList.get(5).getName();
    board[1][6] = PiecesList.get(6).getName();
    board[1][7] = PiecesList.get(7).getName();
    board[0][0] = PiecesList.get(8).getName();
    board[0][7] = PiecesList.get(9).getName();
    board[0][1] = PiecesList.get(10).getName();
    board[0][6] = PiecesList.get(11).getName();
    board[0][2] = PiecesList.get(12).getName();
    board[0][5] = PiecesList.get(13).getName();
    board[0][3] = PiecesList.get(14).getName();
    board[0][4] = PiecesList.get(15).getName();
    board[6][0] = PiecesList.get(16).getName();
    board[6][1] = PiecesList.get(17).getName();
    board[6][2] = PiecesList.get(18).getName();
    board[6][3] = PiecesList.get(19).getName();
    board[6][4] = PiecesList.get(20).getName();
    board[6][5] = PiecesList.get(21).getName();
    board[6][6] = PiecesList.get(22).getName();
    board[6][7] = PiecesList.get(23).getName();
    board[7][0] = PiecesList.get(24).getName();
    board[7][7] = PiecesList.get(25).getName();
    board[7][1] = PiecesList.get(26).getName();
    board[7][6] = PiecesList.get(27).getName();
    board[7][2] = PiecesList.get(28).getName();
    board[7][5] = PiecesList.get(29).getName();
    board[7][3] = PiecesList.get(30).getName();
    board[7][4] = PiecesList.get(31).getName();
    pieces[1][0] = PiecesList.get(0);
    pieces[1][1] = PiecesList.get(1);
    pieces[1][2] = PiecesList.get(2);
    pieces[1][3] = PiecesList.get(3);
    pieces[1][4] = PiecesList.get(4);
    pieces[1][5] = PiecesList.get(5);
    pieces[1][6] = PiecesList.get(6);
    pieces[1][7] = PiecesList.get(7);
    pieces[0][0] = PiecesList.get(8);
    pieces[0][7] = PiecesList.get(9);
    pieces[0][1] = PiecesList.get(10);
    pieces[0][6] = PiecesList.get(11);
    pieces[0][2] = PiecesList.get(12);
    pieces[0][5] = PiecesList.get(13);
    pieces[0][3] = PiecesList.get(14);
    pieces[0][4] = PiecesList.get(15);
    pieces[6][0] = PiecesList.get(16);
    pieces[6][1] = PiecesList.get(17);
    pieces[6][2] = PiecesList.get(18);
    pieces[6][3] = PiecesList.get(19);
    pieces[6][4] = PiecesList.get(20);
    pieces[6][5] = PiecesList.get(21);
    pieces[6][6] = PiecesList.get(22);
    pieces[6][7] = PiecesList.get(23);
    pieces[7][0] = PiecesList.get(24);
    pieces[7][7] = PiecesList.get(25);
    pieces[7][1] = PiecesList.get(26);
    pieces[7][6] = PiecesList.get(27);
    pieces[7][2] = PiecesList.get(28);
    pieces[7][5] = PiecesList.get(29);
    pieces[7][3] = PiecesList.get(30);
    pieces[7][4] = PiecesList.get(31);
  }

  void askGetPiece() {
    System.out.print("\nEnter the coordinate of the piece you want to move: ");
    coordinate = console.nextLine().trim().toLowerCase();
  }

  void askMovePiece() {
    System.out.print("\nEnter the coordinate where you want to move the piece: ");
    newCoordinate = console.nextLine().trim().toLowerCase();
  }

  void getPiece(String coordinate) {

    Optional<Piece> piece =
        PiecesList.stream().filter(pieces -> validatePiece(coordinate, pieces)).findFirst();
    if (!piece.isPresent()) {
      System.out.println("Invalid coordinate");
      askGetPiece();
      getPiece(getCoordinate());
    } else {
      actualPiece = piece.get();
    }
  }

  boolean validatePiece(String coordinate, Piece piece) {

    if (piece.getCoordinate().equalsIgnoreCase(coordinate)
        && piece.getColor().equalsIgnoreCase("white")
        && isWhiteTurn) {
      return true;
    } else if (piece.getCoordinate().equalsIgnoreCase(coordinate)
        && piece.getColor().equalsIgnoreCase("black")
        && !isWhiteTurn) {
      return true;
    } else {
      return false;
    }
  }

  void updatePieceList(String coordinate) {
    for (Piece piece : PiecesList) {
      if (piece.getCoordinate().equalsIgnoreCase(coordinate)) {
        piece.setCoordinate(getNewCoordinate());
      }
    }
  }

  boolean collisions(Piece piece) {
    if (piece.getName().equalsIgnoreCase("p ")) {
      if (newRow - lastRow > 0) {
        for (int i = lastRow + 1; i < newRow; i++) {
          if (pieces[i][lastColumn] != null) return true;
        }
      } else if (newRow - lastRow < 0) {
        for (int i = newRow + 1; i < lastRow; i++) {
          if (pieces[i][lastColumn] != null) return true;
        }
      }
    } else if (piece.getName().equalsIgnoreCase("r ")) {

      if (newRow == lastRow && newColumn - lastColumn > 0) {
        for (int i = lastColumn + 1; i < newColumn; i++) {
          if (pieces[lastRow][i] != null) return true;
        }
      } else if (newRow == lastRow && newColumn - lastColumn < 0) {
        for (int i = newColumn + 1; i < lastColumn; i--) {
          if (pieces[lastRow][i] != null) return true;
        }
      } else if (newColumn == lastColumn && newRow - lastRow < 0) {
        for (int i = newRow + 1; i < lastRow; i--) {
          if (pieces[i][lastColumn] != null) return true;
        }
      } else if (newColumn == lastColumn && newRow - lastRow > 0) {
        for (int i = lastRow + 1; i < newRow; i++) {
          if (pieces[i][lastColumn] != null) return true;
        }
      }
    } else if (piece.getName().equalsIgnoreCase("b ")) {

      if (newRow - lastRow < 0 && newColumn - lastColumn > 0) {
        for (int i = newRow + 1; i < lastRow; i--) {
          for (int j = lastColumn + 1; j < newColumn; j++) {
            if (pieces[i][j] != null) return true;
          }
        }
      } else if (newRow - lastRow < 0 && newColumn - lastColumn < 0) {
        for (int i = newRow + 1; i < lastRow; i--) {
          for (int j = newColumn + 1; j < lastColumn; j--) {
            if (pieces[i][j] != null) return true;
          }
        }
      } else if (newRow - lastRow > 0 && newColumn - lastColumn < 0) {
        for (int i = lastRow + 1; i < newRow; i++) {
          for (int j = newColumn + 1; j < lastColumn; j--) {
            if (pieces[i][j] != null) return true;
          }
        }
      } else if (newRow - lastRow > 0 && newColumn - lastColumn > 0) {
        for (int i = lastRow + 1; i < newRow; i++) {
          for (int j = lastColumn + 1; j < newColumn; j++) {
            if (pieces[i][j] != null) return true;
          }
        }
      }
    } else if (piece.getName().equalsIgnoreCase("q ")) {

      if (newRow == lastRow && newColumn - lastColumn > 0) {
        for (int i = lastColumn + 1; i < newColumn; i++) {
          if (pieces[lastRow][i] != null) return true;
        }
      } else if (newRow == lastRow && newColumn - lastColumn < 0) {
        for (int i = newColumn + 1; i < lastColumn; i--) {
          if (pieces[lastRow][i] != null) return true;
        }
      } else if (newColumn == lastColumn && newRow - lastRow < 0) {
        for (int i = newRow + 1; i < lastRow; i--) {
          if (pieces[i][lastColumn] != null) return true;
        }
      } else if (newColumn == lastColumn && newRow - lastRow > 0) {
        for (int i = lastRow + 1; i < newRow; i++) {
          if (pieces[i][lastColumn] != null) return true;
        }
      } if (newRow - lastRow < 0 && newColumn - lastColumn > 0) {
        for (int i = newRow + 1; i < lastRow; i--) {
          for (int j = lastColumn + 1; j < newColumn; j++) {
            if (pieces[i][j] != null) return true;
          }
        }
      } else if (newRow - lastRow < 0 && newColumn - lastColumn < 0) {
        for (int i = newRow + 1; i < lastRow; i--) {
          for (int j = newColumn + 1; j < lastColumn; j--) {
            if (pieces[i][j] != null) return true;
          }
        }
      } else if (newRow - lastRow > 0 && newColumn - lastColumn < 0) {
        for (int i = lastRow + 1; i < newRow; i++) {
          for (int j = newColumn + 1; j < lastColumn; j--) {
            if (pieces[i][j] != null) return true;
          }
        }
      } else if (newRow - lastRow > 0 && newColumn - lastColumn > 0) {
        for (int i = lastRow + 1; i < newRow; i++) {
          for (int j = lastColumn + 1; j < newColumn; j++) {
            if (pieces[i][j] != null) return true;
          }
        }
      }
    }
    return false;
  }

  void captureAndMovePiece(Piece piece, int lastRow, int lastColumn, int newRow, int newColumn, String coordinate) {
    if (collisions(piece)) {
      System.out.println("\nInvalid position");
      askGetPiece();
      askMovePiece();
      setPiece(getNewCoordinate(), getActualPiece());
    } else if (pieces[newRow][newColumn] != null
    && pieces[newRow][newColumn].getColor().equalsIgnoreCase("black")
    && isWhiteTurn) {
      pieces[newRow][newColumn] = piece;
      pieces[lastRow][lastColumn] = null;
      piece.setCoordinate(coordinate);
    } else if (pieces[newRow][newColumn] != null
    && pieces[newRow][newColumn].getColor().equalsIgnoreCase("white")
    && !isWhiteTurn) {
      pieces[newRow][newColumn] = piece;
      pieces[lastRow][lastColumn] = null;
      piece.setCoordinate(coordinate);
    } else {
      pieces[newRow][newColumn] = piece;
      pieces[lastRow][lastColumn] = null;
      piece.setCoordinate(coordinate);
    }
  }

  void pieceMovement(
      Piece piece, int lastRow, int lastColumn, int newRow, int newColumn, String coordinate) {
    if (piece.getName().equalsIgnoreCase("p ") && piece.getColor().equalsIgnoreCase("white")) {
      if (lastRow - newRow <= 2 && lastColumn == newColumn && pieces[newRow][lastColumn] == null 
          || Math.abs(lastRow - newRow) == 1 && Math.abs(lastColumn - newColumn) == 1 && pieces[newRow][newColumn] != null) {
        captureAndMovePiece(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        updatePieceList(getCoordinate());
      } else {
        System.out.println("Invalid movement");
        askGetPiece();
        askMovePiece();
        setPiece(getNewCoordinate(), getActualPiece());
      }
    } else if (piece.getName().equalsIgnoreCase("p ")
        && piece.getColor().equalsIgnoreCase("black")) {
      if (newRow - lastRow <= 2 && lastColumn == newColumn
          || Math.abs(newRow - lastRow) == 1 && Math.abs(newColumn - lastColumn) == 1 && pieces[newRow][newColumn] != null) {
        captureAndMovePiece(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        updatePieceList(getCoordinate());
      } else {
        System.out.println("Invalid movement");
        askGetPiece();
        askMovePiece();
        setPiece(getNewCoordinate(), getActualPiece());
      }
    } else if (piece.getName().equalsIgnoreCase("r ")
        && piece.getColor().equalsIgnoreCase("white")) {
      if (lastRow == newRow || lastColumn == newColumn) {
        captureAndMovePiece(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        updatePieceList(getCoordinate());
      } else {
        System.out.println("Invalid movement");
        askGetPiece();
        askMovePiece();
        setPiece(getNewCoordinate(), getActualPiece());
      }
    } else if (piece.getName().equalsIgnoreCase("r ")
        && piece.getColor().equalsIgnoreCase("black")) {
      if (lastRow == newRow || lastColumn == newColumn) {
        captureAndMovePiece(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        updatePieceList(getCoordinate());
      } else {
        System.out.println("Invalid movement");
        askGetPiece();
        askMovePiece();
        setPiece(getNewCoordinate(), getActualPiece());
      }
    } else if (piece.getName().equalsIgnoreCase("h ")
        && piece.getColor().equalsIgnoreCase("white")) {
      if (Math.abs(lastRow - newRow) == 2 && Math.abs(lastColumn - newColumn) == 1
          || Math.abs(lastRow - newRow) == 1 && Math.abs(lastColumn - newColumn) == 2) {
        captureAndMovePiece(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        updatePieceList(getCoordinate());
      } else {
        System.out.println("Invalid movement");
        askGetPiece();
        askMovePiece();
        setPiece(getNewCoordinate(), getActualPiece());
      }
    } else if (piece.getName().equalsIgnoreCase("h ")
        && piece.getColor().equalsIgnoreCase("black")) {
      if (Math.abs(lastRow - newRow) == 2 && Math.abs(lastColumn - newColumn) == 1
          || Math.abs(lastRow - newRow) == 1 && Math.abs(lastColumn - newColumn) == 2) {
        captureAndMovePiece(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        updatePieceList(getCoordinate());
      } else {
        System.out.println("Invalid movement");
        askGetPiece();
        askMovePiece();
        setPiece(getNewCoordinate(), getActualPiece());
      }
    } else if (piece.getName().equalsIgnoreCase("b ")
        && piece.getColor().equalsIgnoreCase("white")) {
      if (Math.abs(lastRow - newRow) == Math.abs(lastColumn - newColumn)) {
        captureAndMovePiece(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        updatePieceList(getCoordinate());
      } else {
        System.out.println("Invalid movement");
        askGetPiece();
        askMovePiece();
        setPiece(getNewCoordinate(), getActualPiece());
      }
    } else if (piece.getName().equalsIgnoreCase("b ")
        && piece.getColor().equalsIgnoreCase("black")) {
      if (Math.abs(lastRow - newRow) == Math.abs(lastColumn - newColumn)) {
        captureAndMovePiece(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        updatePieceList(getCoordinate());
      } else {
        System.out.println("Invalid movement");
        askGetPiece();
        askMovePiece();
        setPiece(getNewCoordinate(), getActualPiece());
      }
    } else if (piece.getName().equalsIgnoreCase("q ")
        && piece.getColor().equalsIgnoreCase("white")) {
      if (lastRow == newRow
          || lastColumn == newColumn
          || Math.abs(lastRow - newRow) == Math.abs(lastColumn - newColumn)) {
        captureAndMovePiece(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        updatePieceList(getCoordinate());
      } else {
        System.out.println("Invalid movement");
        askGetPiece();
        askMovePiece();
        setPiece(getNewCoordinate(), getActualPiece());
      }
    } else if (piece.getName().equalsIgnoreCase("q ")
        && piece.getColor().equalsIgnoreCase("black")) {
      if (lastRow == newRow
          || lastColumn == newColumn
          || Math.abs(lastRow - newRow) == Math.abs(lastColumn - newColumn)) {
        captureAndMovePiece(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        updatePieceList(getCoordinate());
      } else {
        System.out.println("Invalid movement");
        askGetPiece();
        askMovePiece();
        setPiece(getNewCoordinate(), getActualPiece());
      }
    } else if (piece.getName().equalsIgnoreCase("k ")
        && piece.getColor().equalsIgnoreCase("white")) {
      if (Math.abs(lastRow - newRow) <= 1 && Math.abs(lastColumn - newColumn) <= 1
          || Math.abs(lastColumn - newColumn) <= 1
          || Math.abs(lastRow - newRow) <= 1) {
        captureAndMovePiece(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        updatePieceList(getCoordinate());
      } else {
        System.out.println("Invalid movement");
        askGetPiece();
        askMovePiece();
        setPiece(getNewCoordinate(), getActualPiece());
      }
    } else if (piece.getName().equalsIgnoreCase("k ")
        && piece.getColor().equalsIgnoreCase("black")) {
      if (Math.abs(lastRow - newRow) <= 1 && Math.abs(lastColumn - newColumn) <= 1
          || Math.abs(lastColumn - newColumn) <= 1
          || Math.abs(lastRow - newRow) <= 1) {
        captureAndMovePiece(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        updatePieceList(getCoordinate());
      } else {
        System.out.println("Invalid movement");
        askGetPiece();
        askMovePiece();
        setPiece(getNewCoordinate(), getActualPiece());
      }
    }
  }



  void getLastPosition() {
    switch (getActualPiece().getCoordinate().toLowerCase()) {
      case "a8":
        lastRow = 0;
        lastColumn = 0;
        break;
      case "b8":
        lastRow = 0;
        lastColumn = 1;
        break;
      case "c8":
        lastRow = 0;
        lastColumn = 2;
        break;
      case "d8":
        lastRow = 0;
        lastColumn = 3;
        break;
      case "e8":
        lastRow = 0;
        lastColumn = 4;
        break;
      case "f8":
        lastRow = 0;
        lastColumn = 5;
        break;
      case "g8":
        lastRow = 0;
        lastColumn = 6;
        break;
      case "h8":
        lastRow = 0;
        lastColumn = 7;
        break;
      case "a7":
        lastRow = 1;
        lastColumn = 0;
        break;
      case "b7":
        lastRow = 1;
        lastColumn = 1;
        break;
      case "c7":
        lastRow = 1;
        lastColumn = 2;
        break;
      case "d7":
        lastRow = 1;
        lastColumn = 3;
        break;
      case "e7":
        lastRow = 1;
        lastColumn = 4;
        break;
      case "f7":
        lastRow = 1;
        lastColumn = 5;
        break;
      case "g7":
        lastRow = 1;
        lastColumn = 6;
        break;
      case "h7":
        lastRow = 1;
        lastColumn = 7;
        break;
      case "a6":
        lastRow = 2;
        lastColumn = 0;
        break;
      case "b6":
        lastRow = 2;
        lastColumn = 1;
        break;
      case "c6":
        lastRow = 2;
        lastColumn = 2;
        break;
      case "d6":
        lastRow = 2;
        lastColumn = 3;
        break;
      case "e6":
        lastRow = 2;
        lastColumn = 4;
        break;
      case "f6":
        lastRow = 2;
        lastColumn = 5;
        break;
      case "g6":
        lastRow = 2;
        lastColumn = 6;
        break;
      case "h6":
        lastRow = 2;
        lastColumn = 7;
        break;
      case "a5":
        lastRow = 3;
        lastColumn = 0;
        break;
      case "b5":
        lastRow = 3;
        lastColumn = 1;
        break;
      case "c5":
        lastRow = 3;
        lastColumn = 2;
        break;
      case "d5":
        lastRow = 3;
        lastColumn = 3;
        break;
      case "e5":
        lastRow = 3;
        lastColumn = 4;
        break;
      case "f5":
        lastRow = 3;
        lastColumn = 5;
        break;
      case "g5":
        lastRow = 3;
        lastColumn = 6;
        break;
      case "h5":
        lastRow = 3;
        lastColumn = 7;
        break;
      case "a4":
        lastRow = 4;
        lastColumn = 0;
        break;
      case "b4":
        lastRow = 4;
        lastColumn = 1;
        break;
      case "c4":
        lastRow = 4;
        lastColumn = 2;
        break;
      case "d4":
        lastRow = 4;
        lastColumn = 3;
        break;
      case "e4":
        lastRow = 4;
        lastColumn = 4;
        break;
      case "f4":
        lastRow = 4;
        lastColumn = 5;
        break;
      case "g4":
        lastRow = 4;
        lastColumn = 6;
        break;
      case "h4":
        lastRow = 4;
        lastColumn = 7;
        break;
      case "a3":
        lastRow = 5;
        lastColumn = 0;
        break;
      case "b3":
        lastRow = 5;
        lastColumn = 1;
        break;
      case "c3":
        lastRow = 5;
        lastColumn = 2;
        break;
      case "d3":
        lastRow = 5;
        lastColumn = 3;
        break;
      case "e3":
        lastRow = 5;
        lastColumn = 4;
        break;
      case "f3":
        lastRow = 5;
        lastColumn = 5;
        break;
      case "g3":
        lastRow = 5;
        lastColumn = 6;
        break;
      case "h3":
        lastRow = 5;
        lastColumn = 7;
        break;
      case "a2":
        lastRow = 6;
        lastColumn = 0;
        break;
      case "b2":
        lastRow = 6;
        lastColumn = 1;
        break;
      case "c2":
        lastRow = 6;
        lastColumn = 2;
        break;
      case "d2":
        lastRow = 6;
        lastColumn = 3;
        break;
      case "e2":
        lastRow = 6;
        lastColumn = 4;
        break;
      case "f2":
        lastRow = 6;
        lastColumn = 5;
        break;
      case "g2":
        lastRow = 6;
        lastColumn = 6;
        break;
      case "h2":
        lastRow = 6;
        lastColumn = 7;
        break;
      case "a1":
        lastRow = 7;
        lastColumn = 0;
        break;
      case "b1":
        lastRow = 7;
        lastColumn = 1;
        break;
      case "c1":
        lastRow = 7;
        lastColumn = 2;
        break;
      case "d1":
        lastRow = 7;
        lastColumn = 3;
        break;
      case "e1":
        lastRow = 7;
        lastColumn = 4;
        break;
      case "f1":
        lastRow = 7;
        lastColumn = 5;
        break;
      case "g1":
        lastRow = 7;
        lastColumn = 6;
        break;
      case "h1":
        lastRow = 7;
        lastColumn = 7;
        break;
    }
  }

  void setPiece(String coordinate, Piece piece) {
    switch (coordinate.toLowerCase()) {
      case "a8":
        newRow = 0;
        newColumn = 0;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "b8":
        newRow = 0;
        newColumn = 1;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "c8":
        newRow = 0;
        newColumn = 2;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "d8":
        newRow = 0;
        newColumn = 3;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "e8":
        newRow = 0;
        newColumn = 4;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "f8":
        newRow = 0;
        newColumn = 5;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "g8":
        newRow = 0;
        newColumn = 6;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "h8":
        newRow = 0;
        newColumn = 7;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "a7":
        newRow = 1;
        newColumn = 0;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "b7":
        newRow = 1;
        newColumn = 1;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "c7":
        newRow = 1;
        newColumn = 2;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "d7":
        newRow = 1;
        newColumn = 3;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "e7":
        newRow = 1;
        newColumn = 4;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "f7":
        newRow = 1;
        newColumn = 5;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "g7":
        newRow = 1;
        newColumn = 6;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "h7":
        newRow = 1;
        newColumn = 7;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "a6":
        newRow = 2;
        newColumn = 0;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "b6":
        newRow = 2;
        newColumn = 1;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "c6":
        newRow = 2;
        newColumn = 2;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "d6":
        newRow = 2;
        newColumn = 3;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "e6":
        newRow = 2;
        newColumn = 4;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "f6":
        newRow = 2;
        newColumn = 5;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "g6":
        newRow = 2;
        newColumn = 6;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "h6":
        newRow = 2;
        newColumn = 7;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "a5":
        newRow = 3;
        newColumn = 0;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "b5":
        newRow = 3;
        newColumn = 1;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "c5":
        newRow = 3;
        newColumn = 2;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "d5":
        newRow = 3;
        newColumn = 3;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "e5":
        newRow = 3;
        newColumn = 4;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "f5":
        newRow = 3;
        newColumn = 5;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "g5":
        newRow = 3;
        newColumn = 6;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "h5":
        newRow = 3;
        newColumn = 7;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "a4":
        newRow = 4;
        newColumn = 0;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "b4":
        newRow = 4;
        newColumn = 1;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "c4":
        newRow = 4;
        newColumn = 2;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "d4":
        newRow = 4;
        newColumn = 3;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "e4":
        newRow = 4;
        newColumn = 4;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "f4":
        newRow = 4;
        newColumn = 5;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "g4":
        newRow = 4;
        newColumn = 6;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "h4":
        newRow = 4;
        newColumn = 7;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "a3":
        newRow = 5;
        newColumn = 0;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "b3":
        newRow = 5;
        newColumn = 1;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "c3":
        newRow = 5;
        newColumn = 2;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "d3":
        newRow = 5;
        newColumn = 3;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "e3":
        newRow = 5;
        newColumn = 4;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "f3":
        newRow = 5;
        newColumn = 5;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "g3":
        newRow = 5;
        newColumn = 6;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "h3":
        newRow = 5;
        newColumn = 7;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "a2":
        newRow = 6;
        newColumn = 0;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "b2":
        newRow = 6;
        newColumn = 1;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "c2":
        newRow = 6;
        newColumn = 2;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "d2":
        newRow = 6;
        newColumn = 3;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "e2":
        newRow = 6;
        newColumn = 4;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "f2":
        newRow = 6;
        newColumn = 5;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "g2":
        newRow = 6;
        newColumn = 6;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "h2":
        newRow = 6;
        newColumn = 7;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "a1":
        newRow = 7;
        newColumn = 0;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "b1":
        newRow = 7;
        newColumn = 1;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "c1":
        newRow = 7;
        newColumn = 2;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "d1":
        newRow = 7;
        newColumn = 3;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "e1":
        newRow = 7;
        newColumn = 4;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "f1":
        newRow = 7;
        newColumn = 5;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "g1":
        newRow = 7;
        newColumn = 6;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      case "h1":
        newRow = 7;
        newColumn = 7;
        pieceMovement(piece, lastRow, lastColumn, newRow, newColumn, coordinate);
        break;
      default:
        System.out.println("Invalid coordinate");
        askMovePiece();
        setPiece(getNewCoordinate(), getActualPiece());
        break;
    }
  }
}
