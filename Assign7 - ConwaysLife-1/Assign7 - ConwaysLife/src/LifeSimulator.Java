class LifeSimulator extends ConwaysLife{
    private final int sizeX;
    private final int sizeY;
    boolean[][] grid;

    public LifeSimulator(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        grid = new boolean[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++){
            for( int j = 0; j<sizeY; j++){
                grid[i][j] = false;

            }
        }
    }

    public int getSizeX() {return sizeX;}
    public int getSizeY() {return sizeY;}
    public boolean getCell(int x, int y) {return grid[x][y];}

    public void insertPattern(Pattern pattern, int startX, int startY) {
        for(int i = 0; i<pattern.getSizeX();i++){
            for(int j=0;j<pattern.getSizeY();j++){
                grid[startX + i][startY + j] = pattern.getCell(i,j);

            }
        }
    }

   public void update() {
       grid = new boolean[sizeX][sizeY];
       for (int i = 0; i < sizeX; i++) {
           for (int j = 0; j < sizeY; j++) {
               grid[i][j] = false;
           }
       }

   }
}