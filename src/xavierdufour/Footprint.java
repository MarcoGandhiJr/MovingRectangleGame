package xavierdufour;

import xavierdufour.engine.Buffer;

import java.awt.*;
import java.util.Random;

public class Footprint {

    private int x;
    private int y;
    private int width = 4;
    private int height = 4;

    public Footprint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Buffer buffer) {
        Color color = new Color(getRandomValue(),
                getRandomValue(), getRandomValue());
        buffer.drawRectangle(x, y, width, height, color);
    }

    private int getRandomValue() {
        Random random = new Random();
        return random.nextInt(256);
    }
}
