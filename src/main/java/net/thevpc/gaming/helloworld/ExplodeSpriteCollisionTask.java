/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.thevpc.gaming.helloworld;

import net.thevpc.gaming.atom.engine.collisiontasks.BorderCollision;
import net.thevpc.gaming.atom.engine.collisiontasks.SpriteCollision;
import net.thevpc.gaming.atom.engine.collisiontasks.SpriteCollisionTask;

/**
 *
 * @author sskhiri
 */
public class ExplodeSpriteCollisionTask implements SpriteCollisionTask {
    
    @Override
    public void collideWithSprite(SpriteCollision spriteCollision) {
        spriteCollision.getSprite().die();
        spriteCollision.getOther().die(); 
        
    }
   
    @Override
    public void collideWithBorder(BorderCollision borderCollision) {
        borderCollision.adjustSpritePosition();
    }

    

}
