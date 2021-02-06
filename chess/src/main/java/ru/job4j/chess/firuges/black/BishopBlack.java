package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not way by diagonal from %s to %s", position, dest)
            );
        }
            int x1 = position.getX();
            int y1 = position.getY();
            int x2 = dest.getX();
            int y2 = dest.getY();
            int size = Math.abs(x2 - x1);
            Cell[] steps = new Cell[size];
            int deltaX = x1 - x2 > 0 ? -1 : 1;
            int deltaY = y1 - y2 > 0 ? -1 : 1;
            for (int i = 0; i < size; i++) {
                steps[i] = Cell.findBy(x1 + (i + 1) * deltaX,
                        y1 + (i + 1) * deltaY);
            }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        int a = Math.abs(source.getX() - dest.getX());
        int b = Math.abs(source.getY() - dest.getY());
        return a == b;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
