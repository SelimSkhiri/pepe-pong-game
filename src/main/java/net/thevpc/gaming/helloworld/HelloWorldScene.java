package net.thevpc.gaming.helloworld;

import net.thevpc.gaming.atom.annotations.AtomScene;
import net.thevpc.gaming.atom.annotations.AtomSceneEngine;
import net.thevpc.gaming.atom.annotations.Inject;
import net.thevpc.gaming.atom.annotations.OnSceneStarted;
import net.thevpc.gaming.atom.debug.AdjustViewController;
import net.thevpc.gaming.atom.engine.SceneEngine;
import net.thevpc.gaming.atom.engine.SpriteFilter;
import net.thevpc.gaming.atom.model.Orientation;
import net.thevpc.gaming.atom.model.Point;
import net.thevpc.gaming.atom.presentation.*;
import net.thevpc.gaming.atom.presentation.components.SLabel;
import net.thevpc.gaming.atom.presentation.layers.Layers;
import net.thevpc.gaming.atom.annotations.OnNextFrame;
import net.thevpc.gaming.atom.annotations.AtomSprite;
import net.thevpc.gaming.atom.model.Sprite; 
import net.thevpc.gaming.helloworld.MouseController;

import java.awt.*;

/**
 * Created by vpc on 9/23/16.
 */
@AtomScene(
        id = "hello",
        title = "Hello World",
        tileWidth = 50,
        tileHeight = 50
        
)
@AtomSceneEngine(
        id="hello",
        columns = 12,
        rows = 12,
        fps = 15
)
public class HelloWorldScene {
    
    
    

    @Inject
    private Scene scene;
    @Inject
    private SceneEngine sceneEngine;
   
            
    private SLabel lifeLabel;         

    @OnSceneStarted
    private void init() {
        scene.addLayer(Layers.debug());
        scene.addLayer(Layers.fillBoardImage("/28xp-pepefrog-superJumbo.jpg"));
        //scene.addLayer(Layers.fillBoardGradient(Color.GRAY,Color.pink, Orientation.NORTH));
        //scene.addLayer(Layers.fillScreen(Color.blue));
        scene.addController(new SpriteController(SpriteFilter.byName("Ball1")).setArrowKeysLayout());
        scene.addController(new SpriteController(SpriteFilter.byName("Ball1")).setESDFLayout());
        scene.addController(new MouseController());
        scene.addController(new AdjustViewController());
        scene.addComponent(
                new SLabel("Click CTRL-D to switch debug mode, use Arrows to move the ball")
                .setLocation(Point.ratio(0.5f,0.5f))
        );
        scene.addComponent(lifeLabel = new SLabel("Vies : 3").setLocation(Point.ratio(0.6f,0.1f)));
//        scene.setSpriteView("Ball1", new DefaultSpriteView() {
//            @Override
//            public void draw(SpriteDrawingContext context) {
//                ViewBox sb = context.getSpriteBounds();
//                context.getGraphics().setPaint(Color.BLUE);
//                context.getGraphics().fillRect(
//                        sb.getX(),sb.getY(),
//                        sb.getWidth(),
//                        sb.getHeight()
//                );
//            }
//        });
//        scene.setSpriteView("Ball2", new DefaultSpriteView() {
//            @Override
//            public void draw(SpriteDrawingContext context) {
//                ViewBox sb = context.getSpriteBounds();
//                context.getGraphics().setPaint(Color.RED);
//                context.getGraphics().fillRect(
//                        sb.getX(),sb.getY(),
//                        sb.getWidth(),
//                        sb.getHeight()
//                );
//            }
//        });
        scene.setSpriteView(SpriteFilter.byKind("Ball"), new ImageSpriteView("/ball.png", 8, 4));
        scene.setSpriteView(SpriteFilter.byKind("Missile"), new ImageSpriteView("/rocket.png", 6, 5));
    }
    
    
    
    @OnNextFrame
    private void aChaqueTic () {
    Sprite sp = sceneEngine.findSpriteByName("Ball1");
    int spriteLife = sp.getLife(); 
    lifeLabel.setText(String.valueOf(spriteLife));        
    }

}
