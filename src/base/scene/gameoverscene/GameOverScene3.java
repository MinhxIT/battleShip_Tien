package base.scene.gameoverscene;

import base.GameObject;
import base.scene.Scene;

public class GameOverScene3 extends Scene {
    @Override
    public void destroy() {
        GameObject.clearAll();
    }

    @Override
    public void init() {
        GameObject.recycle(BannerScene3.class);
    }

    @Override
    public void run() {

    }
}
