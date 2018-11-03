package base.stone;

import base.GameObject;
import base.Vector2D;
import base.event.KeyEventPress;
import base.physics.BoxCollider;
import base.physics.Physics;
import base.player.Player;
import base.scene.SceneManager;
import base.scene.gameoverscene.GameOverScene;
import base.scene.gameoverscene.GameOverScene1;
import base.scene.gameoverscene.GameOverScene2;

public class Stone extends GameObject implements Physics {
    public Stone() {
       // this.position = new Vector2D(200, 200);
        //this.setPosition();
        this.collider = new BoxCollider(80, 80);
    }

    @Override
    public void setPosition() {
        super.setPosition();
    }

    @Override
    public void run() {
        this.position.y += 3/*speed*/;
        if (this.position.y > 700) {
            this.destroy();
            return;
        }

    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.collider;
    }
}
