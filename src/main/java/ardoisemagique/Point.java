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

    protected int x;
    protected int y;
    protected Color color;
    private int taille = 10;
    protected String typePoint = "round";

    public Point() {
    }

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
