package base.scene.gameoverscene;

import base.GameObject;
import base.Settings;
import base.event.KeyEventPress;
import base.renderer.SingleImageRenderer;
import base.scene.Scene;
import base.scene.SceneManager;
import base.scene.SceneStage1;
import base.scene.SceneStage2;
import tklibs.SpriteUtils;

public class BannerScene2  extends GameObject {
    public BannerScene2(){
        super();
        this.renderer = new SingleImageRenderer(SpriteUtils.loadImage("assets/images/background/GameOverScene.png"));
        this.position.set(Settings.SCREEN_WIDHT/2, Settings.SCREEN_HEIGHT/2);

    }

    @Override
    public void run() {
        if (KeyEventPress.isEnterPress){
            SceneManager.signNewScene(new SceneStage2());
        }
    }
}
