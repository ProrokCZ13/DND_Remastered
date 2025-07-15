package project.map;

import java.util.Random;

public class MapGenerator {
    public static MapElements[][] generateMap() {
        int rows = MapConfig.ROWS;
        int cols = MapConfig.COLS;

        MapElements[][] map = new MapElements[rows][cols];
        Random random = new Random();
        MapElements[] elements = MapElements.values();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                map[i][j] = elements[random.nextInt(elements.length)];
            }
        }

        return map;
    }

    public static void printMap(MapElements[][] map) {
        for (MapElements[] row : map) {
            for (MapElements cell : row) {
                System.out.printf("%-10s", cell);
            }
            System.out.println();
        }
    }
}
