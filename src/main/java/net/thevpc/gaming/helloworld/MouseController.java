/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.thevpc.gaming.helloworld;

import net.thevpc.gaming.atom.engine.SceneEngine;
import net.thevpc.gaming.atom.engine.maintasks.MoveToPointSpriteMainTask;
import net.thevpc.gaming.atom.model.ModelPoint;
import net.thevpc.gaming.atom.presentation.SceneController;
import net.thevpc.gaming.atom.presentation.SceneMouseEvent;
import net.thevpc.gaming.atom.model.Sprite; 

/**
 *
 * @author sskhiri
 */
public class MouseController implements SceneController {

    @Override
    public void mouseClicked(SceneMouseEvent e) {
        SceneController.super.mouseClicked(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        final SceneEngine se = e.getSceneEngine();
        final Sprite s = se.findSpriteByName("Missile");
        se.setSpriteMainTask(s, new MoveToPointSpriteMainTask(e.getPoint()));
    }
    
    
    
}
