/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GWV_Blatt_06;

import java.awt.Point;

class CrosswordSpace {

    private Point start;
    private Point direction;
    private int length;

    public CrosswordSpace(Point start, Point direction, int length) {
        this.start = start;
        this.direction = direction;
        this.length = length;
    }

    public Point getStart() {
        return start;
    }

    public Point getDirection() {
        return direction;
    }

    public int getLength() {
        return length;
    }
}