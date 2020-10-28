package xavierdufour;

import xavierdufour.engine.Buffer;
import xavierdufour.engine.Game;
import xavierdufour.engine.controls.GameController;
import xavierdufour.engine.controls.MovementController;

import java.util.ArrayList;

public class MovingRectangleGame extends Game {

    private Player player;
    private GameController controller;
    private ArrayList<Footprint> footprints;

    public MovingRectangleGame() {
        controller = new GameController();
        player = new Player(controller);
        footprints = new ArrayList<>();
        super.addKeyListener(controller);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void update() {
        if (controller.isQuitPressed()) {
            super.stop();
        }
        player.update();
        if(controller.isMoving()) {
            footprints.add(player.layFootprint());
        }
    }

    @Override
    public void draw(Buffer buffer) {
        for (Footprint footprint : footprints) {
            footprint.draw(buffer);
        }
        player.draw(buffer);
    }

    @Override
    public void conclude() {

    }
}
