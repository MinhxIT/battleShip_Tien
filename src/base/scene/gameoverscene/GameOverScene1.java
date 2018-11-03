package base.scene.gameoverscene;

import base.GameObject;
import base.scene.Scene;

public class GameOverScene1 extends Scene {
    @Override
    public void destroy() {
        GameObject.clearAll();
    }

    @Override
    public void init() {
        GameObject.recycle(BannerScene1.class);
    }

    @Override
    public void run() {

    }
}
