package xavierdufour;

import xavierdufour.engine.Buffer;
import xavierdufour.engine.entity.StaticEntity;

import java.awt.*;
import java.util.Random;

public class Footprint extends StaticEntity {

    public Footprint(int x, int y) {
        setDimension(5, 5);
        teleport(x, y);
    }

    @Override
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
