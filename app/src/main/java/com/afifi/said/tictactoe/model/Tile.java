package com.afifi.said.tictactoe.model;

import com.afifi.said.tictactoe.R;

/**
 * Board Tile Types and associated colors
 */
public enum Tile {
    X(R.color.colorGreen),
    O(R.color.colorRed),
    NONE(R.color.colorTransparent);

    int colorId;

    Tile(int colorId) {
        this.colorId = colorId;
    }

    public int getColorId() {
        return colorId;
    }
}
