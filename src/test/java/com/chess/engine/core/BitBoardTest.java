package com.chess.engine.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitBoardTest {

    @Test
    void basicFunctions() {
        var bitboard = new BitBoard();
        bitboard.set(Square.A1);

        assertTrue(bitboard.isSet(Square.A1));
        assertFalse(bitboard.isEmpty(Square.A1));

        bitboard.set(Square.A3);

        assertTrue(bitboard.isSet(Square.A1));
        assertFalse(bitboard.isEmpty(Square.A1));
        assertTrue(bitboard.isSet(Square.A3));
        assertFalse(bitboard.isEmpty(Square.A3));

        bitboard.clear(Square.A1);
        assertTrue(bitboard.isEmpty(Square.A1));
        assertTrue(bitboard.isSet(Square.A3));
        assertFalse(bitboard.isEmpty(Square.A3));
    }
}