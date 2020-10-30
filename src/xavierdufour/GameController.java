package xavierdufour;

import xavierdufour.engine.controls.MovementController;
import java.awt.event.KeyEvent;

public class GameController extends MovementController {

    private int quitKey = KeyEvent.VK_Q;

    public GameController() {
        super.bindKey(quitKey);
    }

    public boolean isQuitPressed() {
        return super.isKeyPressed(quitKey);
    }
}
