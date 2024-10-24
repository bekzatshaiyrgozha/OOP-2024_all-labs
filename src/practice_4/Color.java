package practice_4;

enum Color {
    RED, BLUE, GREEN;
    public java.awt.Color toAwtColor() {
        if (this == RED) return java.awt.Color.RED;
        if (this == BLUE) return java.awt.Color.BLUE;
        if (this == GREEN) return java.awt.Color.GREEN;
        return java.awt.Color.BLACK;
    }
}
