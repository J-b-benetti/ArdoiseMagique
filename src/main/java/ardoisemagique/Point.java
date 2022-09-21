/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ardoisemagique;

import java.awt.Color;
import java.util.*;

/**
 *
 * @author jbben
 */
public class Point {
    
    private int x;
    private int y;
    private Color color;
    private int taille;
    private String typePoint;

    public Point(int x, int y, Color color, int taille, String typePoint) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.taille = taille;
        this.typePoint = typePoint;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    public int getTaille() {
        return taille;
    }

    public String getTypePoint() {
        return typePoint;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setTypePoint(String typePoint) {
        this.typePoint = typePoint;
    }
    
    
    
}
