package base.scene.gameoverscene;

import base.GameObject;
import base.scene.Scene;

public class GameOverScene2 extends Scene {
    @Override
    public void destroy() {
        GameObject.clearAll();
    }

    @Override
    public void init() {
        GameObject.recycle(BannerScene2.class);
    }

    @Override
    public void run() {

    }
}
