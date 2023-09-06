class PatternGlider extends Pattern {
    boolean[][]Glider;
    public int sizeX = 7;
    public int sizeY = 3;

    public PatternGlider() {
        Glider= new boolean[][] {
                { false, true, false, false, false, false, false },
                { false, false, false, true, false, false, false },
                { true, true, false, false, true, true, true }
        };
    }

    public PatternGlider(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    @Override
    public boolean getCell(int x, int y) { return Glider[y][x]; }
    @Override
    public int getSizeX() { return sizeX; }
    @Override
    public int getSizeY() { return sizeY; }
}