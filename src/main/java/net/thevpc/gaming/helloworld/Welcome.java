/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.thevpc.gaming.helloworld;

import net.thevpc.gaming.atom.annotations.AtomScene;
import net.thevpc.gaming.atom.annotations.AtomSceneEngine;
import net.thevpc.gaming.atom.annotations.Inject;
import net.thevpc.gaming.atom.annotations.OnSceneStarted;
import net.thevpc.gaming.atom.engine.SceneEngine;
import net.thevpc.gaming.atom.model.Point;
import net.thevpc.gaming.atom.presentation.Scene;
import net.thevpc.gaming.atom.presentation.components.SLabel;
import net.thevpc.gaming.atom.presentation.layers.Layers;

/**
 *
 * @author sskhiri
 */


@AtomScene(
        id = "welcome",
        title = "Welcome",
        tileWidth = 50,
        tileHeight = 50
        
)
@AtomSceneEngine(
        id="welcome",
        columns = 12,
        rows = 12,
        fps = 15
)

public class Welcome {
    
    
    @Inject
    private Scene scene;
    @Inject
    private SceneEngine sceneEngine;   
    
    
    @OnSceneStarted
    private void init() {
        scene.addLayer(Layers.fillBoardImage("/28xp-pepefrog-superJumbo.jpg"));
        scene.addComponent(new SLabel("WELCOME").setLocation(Point.ratio(0.6f,0.1f)));
        scene.
    }
    
    
    
}
