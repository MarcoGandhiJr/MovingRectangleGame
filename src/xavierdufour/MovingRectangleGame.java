package xavierdufour;

import xavierdufour.engine.Buffer;
import xavierdufour.engine.Game;
import xavierdufour.engine.controls.MovementController;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class MovingRectangleGame extends Game {

    private Player playerOne;
    private Player playerTwo;
    private GameController controllerOne;
    private GameController controllerTwo;
    private ArrayList<Footprint> footprints;

    public MovingRectangleGame() {
        controllerOne = new GameController();
        controllerTwo = new GameController();
        setSecondPlayerKeys();

        playerOne = new Player(controllerOne);
        playerTwo = new Player(controllerTwo);
        playerTwo.teleport(200, 200);
        footprints = new ArrayList<>();
        super.addKeyListener(controllerOne);
        super.addKeyListener(controllerTwo);
    }

    private void setSecondPlayerKeys() {
        controllerTwo.setDownKey(KeyEvent.VK_S);
        controllerTwo.setUpKey(KeyEvent.VK_W);
        controllerTwo.setLeftKey(KeyEvent.VK_A);
        controllerTwo.setRightKey(KeyEvent.VK_D);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void update() {
        if (controllerTwo.isQuitPressed()) {
            super.stop();
        }
        playerOne.update();
        playerTwo.update();
        if(controllerOne.isMoving()) {
            footprints.add(playerOne.layFootprint());
        }
        if(controllerTwo.isMoving()) {
            footprints.add(playerTwo.layFootprint());
        }
    }

    @Override
    public void draw(Buffer buffer) {
        for (Footprint footprint : footprints) {
            footprint.draw(buffer);
        }
        playerOne.draw(buffer);
        playerTwo.draw(buffer);
    }

    @Override
    public void conclude() {

    }
}
