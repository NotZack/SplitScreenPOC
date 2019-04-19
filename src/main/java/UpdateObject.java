import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

class UpdateObject extends ImageView {

    private static Random random = new Random();
    private static Image testImage = new Image("duckTest.png");

    UpdateObject() {
        this.setImage(testImage);
        this.setLayoutX(random.nextInt(50));
        this.setLayoutY(random.nextInt(50));
        this.setRotate(random.nextInt(360));
    }
}