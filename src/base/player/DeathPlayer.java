package base.player;

import base.GameObject;
import base.counter.FrameCounter;
import base.renderer.SingleImageRenderer;
import base.scene.SceneManager;
import base.scene.gameoverscene.GameOverScene;

public class DeathPlayer extends GameObject {
    public DeathPlayer() {
        super();
        this.renderer = new SingleImageRenderer("assets/images/players/explosion/0.png");
    }

}
