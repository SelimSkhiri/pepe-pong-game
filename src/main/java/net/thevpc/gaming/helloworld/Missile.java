/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.thevpc.gaming.helloworld;

import net.thevpc.gaming.atom.annotations.AtomSprite;
import net.thevpc.gaming.atom.annotations.Inject;
import net.thevpc.gaming.atom.annotations.OnInit;
import net.thevpc.gaming.atom.engine.SceneEngine;
import net.thevpc.gaming.atom.engine.collisiontasks.StopSpriteCollisionTask;
import net.thevpc.gaming.atom.engine.maintasks.MoveSpriteMainTask;
import net.thevpc.gaming.atom.model.Sprite;

/**
 *
 * @author sskhiri
 */
@AtomSprite(
        name = "Missile",
        kind = "Missile",
//        kind = "ball",
        sceneEngine = "hello",
        x=2,
        y=2,
        direction = - Math.PI/2,
        speed = 0.2,
        mainTask = MoveSpriteMainTask.class,
//        collisionTask = StopSpriteCollisionTask.class
        collisionTask = ExplodeSpriteCollisionTask.class
//        collisionTask = BounceSpriteCollisionTask.class

)
public class Missile {
    @Inject
    Sprite sprite;
    @Inject
    SceneEngine sceneEngine;

    @OnInit
    private void init(){
//        sprite.setLocation(
//                (int)(Math.random()*sceneEngine.getSize().getWidth()),
//                (int)(Math.random()*sceneEngine.getSize().getHeight())
//        );
        sprite.setLocation(10,10);
    }
    
    
}
