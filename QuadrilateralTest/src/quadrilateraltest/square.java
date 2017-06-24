/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrilateraltest;

/**
 *
 * @author stephanie
 */
public class square extends Quadrilateral {

    public square (double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    
    // 取得矩形長
    public double getHeight() {
        if (getPoint1().getY() == getPoint2().getY())
            return Math.abs(getPoint2().getY() - getPoint3().getY());
        else
            return Math.abs(getPoint1().getY() - getPoint2().getY());
    }

    // 取得矩形面積
    public double getArea() {
        return  getHeight() * getHeight();
    }

    // 取得 Rectangle 物件的 string 格式
    public String toString() {
        return String.format("Coordinates of Square are:\n%s\nHeight is: %s\nArea is: %s",
                getCoordinatesAsString(), getHeight(), getArea());
    }
}
