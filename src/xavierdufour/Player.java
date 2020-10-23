package xavierdufour;

import xavierdufour.engine.Buffer;

import java.awt.*;

public class Player {

    private int x;
    private int y;
    private int width = 30;
    private int height = 60;
    private int speed = 4;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Footprint layFootprint() {
        return new Footprint(x, y);
    }

    public void update(InputHandler inputHandler) {
        if (inputHandler.isDownPressed()) {
            y += speed;
        } else if (inputHandler.isUpPressed()) {
            y -= speed;
        } else if (inputHandler.isLeftPressed()) {
            x -= speed;
        } else if (inputHandler.isRightPressed()) {
           x += speed;
        }
    }

    public void draw(Buffer buffer) {
        buffer.drawRectangle(x, y, width, height, Color.red);
    }

}
