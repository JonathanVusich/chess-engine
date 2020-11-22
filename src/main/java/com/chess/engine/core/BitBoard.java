package com.chess.engine.core;

public final class BitBoard {

    private long board = 0;

    public void set(Square location) {
        this.board |= (1 << location.ordinal());
    }

    public void clear(Square location) {
        this.board &= ~(1 << location.ordinal());
    }

    public boolean isSet(Square location) {
        return (this.board >> location.ordinal() & 1) != 0;
    }

    public boolean isEmpty(Square location) {
        return !isSet(location);
    }
}
