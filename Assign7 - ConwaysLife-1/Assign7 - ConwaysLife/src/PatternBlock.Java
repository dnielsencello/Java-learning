class PatternBlock extends Pattern {
    boolean[][] Block;
    public int sizeX = 2;
    public int sizeY = 2;

    public PatternBlock() {
        Block = new boolean[][] {
                { true, true},
                { true, true},
        };
    }

    public PatternBlock(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    @Override
    public boolean getCell(int x, int y) { return Block[y][x]; }
    @Override
    public int getSizeX() { return sizeX; }
    @Override
    public int getSizeY() { return sizeY; }
}