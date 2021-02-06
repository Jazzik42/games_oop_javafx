package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bb = new BishopBlack(C8);
        bb.position();
        assertThat(bb.position(), is(C8));
    }

    @Test
    public void testCopy() {
        BishopBlack bb = new BishopBlack(C8);
        Figure figure = bb.copy(C8);
        assertThat(figure.position(), is(bb.position()));
    }

    @Test
    public void testWay()
        throws ImpossibleMoveException {
        BishopBlack bb = new BishopBlack(C1);
        Cell[] c = new Cell[] {D2, E3, F4, G5};
        assertThat(bb.way(G5), is(c));
    }


}