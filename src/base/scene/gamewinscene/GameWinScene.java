package base.scene.gamewinscene;

import base.GameObject;
import base.scene.Scene;
import base.scene.gameoverscene.BannerScene3;

public class GameWinScene extends Scene {
    @Override
    public void destroy() {
        GameObject.clearAll();
    }

    @Override
    public void init() {
        GameObject.recycle(BannerWinScene.class);
    }

    @Override
    public void run() {

    }
}
