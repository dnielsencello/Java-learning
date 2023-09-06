class PatternBlinker extends Pattern {
    boolean[][] Blinker;
    public int sizeX = 3;
    public int sizeY = 3;

    public PatternBlinker() {
        Blinker = new boolean[][] {
                { false, false, false},
                { true, true, true },
                { false, false, false},
        };
    }

    public PatternBlinker(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    @Override
    public boolean getCell(int x, int y) { return Blinker[y][x]; }
    @Override
    public int getSizeX() { return sizeX; }
    @Override
    public int getSizeY() { return sizeY; }
}