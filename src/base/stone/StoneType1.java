package base.stone;

import base.physics.BoxCollider;
import base.renderer.SingleImageRenderer;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StoneType1 extends Stone {
    public StoneType1() {
        List<String> listStones = Arrays.asList(
                "assets/images/stone/rock6.png",
                "assets/images/stone/1.png",
                "assets/images/stone/2.png",
                "assets/images/stone/3.png",
                "assets/images/stone/4.png"
                );
        Random rand = new Random();
        int randomIndex = rand.nextInt(listStones.size());
        String randomElement = listStones.get(randomIndex);
        this.renderer = new SingleImageRenderer(randomElement);
    }
}
