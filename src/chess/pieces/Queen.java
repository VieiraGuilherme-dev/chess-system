package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {
    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "Q";
    }

    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        // Movimento acima
        p.setValues(position.getRow() - 1, position.getColumn());
        while (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            if (getBoard().thereIsAPiece(p) && isThereOpponentPiece(p)) {
                break;
            }
            p.setValues(p.getRow() - 1, p.getColumn());
        }

        // Movimento abaixo
        p.setValues(position.getRow() + 1, position.getColumn());
        while (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            if (getBoard().thereIsAPiece(p) && isThereOpponentPiece(p)) {
                break;
            }
            p.setValues(p.getRow() + 1, p.getColumn());
        }

        // Movimento à esquerda
        p.setValues(position.getRow(), position.getColumn() - 1);
        while (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            if (getBoard().thereIsAPiece(p) && isThereOpponentPiece(p)) {
                break;
            }
            p.setValues(p.getRow(), p.getColumn() - 1);
        }

        // Movimento à direita
        p.setValues(position.getRow(), position.getColumn() + 1);
        while (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            if (getBoard().thereIsAPiece(p) && isThereOpponentPiece(p)) {
                break;
            }
            p.setValues(p.getRow(), p.getColumn() + 1);
        }

        // Movimento Noroeste (NW)
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        while (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            if (getBoard().thereIsAPiece(p) && isThereOpponentPiece(p)) {
                break;
            }
            p.setValues(p.getRow() - 1, p.getColumn() - 1);
        }

        // Movimento Nordeste (NE)
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        while (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            if (getBoard().thereIsAPiece(p) && isThereOpponentPiece(p)) {
                break;
            }
            p.setValues(p.getRow() - 1, p.getColumn() + 1);
        }

        // Movimento Sudoeste (SW)
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        while (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            if (getBoard().thereIsAPiece(p) && isThereOpponentPiece(p)) {
                break;
            }
            p.setValues(p.getRow() + 1, p.getColumn() - 1);
        }

        // Movimento Sudeste (SE)
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        while (getBoard().positionExist(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            if (getBoard().thereIsAPiece(p) && isThereOpponentPiece(p)) {
                break;
            }
            p.setValues(p.getRow() + 1, p.getColumn() + 1);
        }

        return mat;
    }
}