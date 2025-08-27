package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {
    public Knight(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "N";
    }

    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        // Above-left
        p.setValues(position.getRow() - 2, position.getColumn() - 1);
        if (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // Above-right
        p.setValues(position.getRow() - 2, position.getColumn() + 1);
        if (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // Left-above
        p.setValues(position.getRow() - 1, position.getColumn() - 2);
        if (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // Left-below
        p.setValues(position.getRow() + 1, position.getColumn() - 2);
        if (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // Right-above
        p.setValues(position.getRow() - 1, position.getColumn() + 2);
        if (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // Right-below
        p.setValues(position.getRow() + 1, position.getColumn() + 2);
        if (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // Below-left
        p.setValues(position.getRow() + 2, position.getColumn() - 1);
        if (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // Below-right
        p.setValues(position.getRow() + 2, position.getColumn() + 1);
        if (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }
}