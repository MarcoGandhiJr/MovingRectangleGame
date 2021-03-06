package xavierdufour;

import xavierdufour.engine.Buffer;
import xavierdufour.engine.controls.MovementController;
import xavierdufour.engine.entity.ControllableEntity;

import java.awt.*;

public class Player extends ControllableEntity{

    public Player(MovementController controller) {
        super(controller);
        super.setDimension(30, 30);
        super.teleport(100, 100);
        super.setSpeed(4);
    }

    public Footprint layFootprint() {
        return new Footprint(x, y);
    }

    @Override
    public void update() {
        moveAccordingToHandler();
    }

    @Override
    public void draw(Buffer buffer) {
        buffer.drawRectangle(x, y, width, height, Color.red);
    }
}
