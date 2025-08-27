# ♟️ Chess Game in Java

Este é um projeto de um **jogo de xadrez em Java**, desenvolvido para rodar no console. Ele implementa as regras do xadrez, movimentação das peças, checagem de jogadas válidas, xeque e xeque-mate.

---

## Funcionalidades

- Tabuleiro de xadrez 8x8
- Movimentação válida de peças
- Validação de jogadas (não permite movimentos ilegais)
- Captura de peças
- Situações de **Xeque** e **Xeque-mate**
- Indicação visual no terminal para movimentos possíveis
- **Promoção de Peão**
- **Roque** e **En Passant**

---

##  Tecnologias Utilizadas

- **Java 24+**
- **Paradigma Orientado a Objetos**
- **Estruturas de Dados** (arrays, listas, enums)
- **Pacotes e organização modular**

---


##  Diagrama UML

Abaixo está o diagrama UML representando a estrutura das classes do projeto: ![Diagrama de Classes](src/images/chess-system-design.png)

---

## ▶️ Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git

## ✔️ Funcionalidades Implementadas

* Movimentos válidos para todas as peças
* Regras especiais: Roque, En Passant, Promoção
* Tratamento de jogadas inválidas
* Indicação de xeque e xeque-mate
* Exibição do tabuleiro atualizado após cada jogada

---

## 🔑 Exemplos de Código Importantes

### ✅ Movimento Especial – En Passant

```java
if (p instanceof Pawn) {
    if (source.getColumn() != target.getColumn() && capturedPiece == null) {
        Position pawnPosition;
        if (p.getColor() == Color.WHITE) {
            pawnPosition = new Position(target.getRow() + 1, target.getColumn());
        } else {
            pawnPosition = new Position(target.getRow() - 1, target.getColumn());
        }
        capturedPiece = board.removePiece(pawnPosition);
        capturedPieces.add(capturedPiece);
    }
}

Checando Xeque-Mate
Java

private boolean testCheckMate(Color color) {
    if (!testCheck(color)) {
        return false;
    }
    for (ChessPiece piece : piecesOnTheBoard) {
        if (piece.getColor() == color) {
            boolean[][] mat = piece.possibleMoves();
            for (int i = 0; i < board.getRows(); i++) {
                for (int j = 0; j < board.getColumns(); j++) {
                    if (mat[i][j]) {
                        Position source = piece.getChessPosition().toPosition();
                        Position target = new Position(i, j);
                        Piece capturedPiece = makeMove(source, target);
                        boolean testCheck = testCheck(color);
                        undoMove(source, target, capturedPiece);
                        if (!testCheck) {
                            return false;
                        }
                    }
                }
            }
        }
    }
    return true;
}


