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
public class trapezoid extends Quadrilateral {
     
     double x1 =0;
     double y1 =0;
     double side = 0;
     
    public trapezoid(double x1, double y1, double x2, double y2, 
            double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4); // 使用 Quadrilateral 建構子
    }

    // 取得矩形長 height itu y
    public double getHeight() {
        if (getPoint1().getY() == getPoint2().getY() )
            return Math.abs(getPoint1().getY() - getPoint4().getY());
        else
            return Math.abs(getPoint1().getY() - getPoint2().getY());
    }

    // 取得矩形寬 width itu x
    public double getWidthlong() {
        if (getPoint1().getY() == getPoint2().getY() )
            return Math.abs(getPoint1().getX() - getPoint2().getX());
        else
            return Math.abs(getPoint1().getX() - getPoint4().getX());
    }
    
    //lbh panjang pny
    public double getWidthshort() {
        if (getPoint3().getY() == getPoint2().getY())
            return Math.abs(getPoint3().getX() - getPoint2().getX());
        else
            return Math.abs(getPoint4().getX() - getPoint3().getX());
    }

    // 取得矩形面積
    public double getArea() {
        return 0.5* (getWidthlong()+getWidthshort()) *getHeight();
    }

    // 取得 Rectangle 物件的 string 格式
    public String toString() {
        return String.format("Coordinates of trapeziod are:\n%s\nShort Width is: %s\nLong Width is: %s\nHeight is: %s\nArea is: %s",
                getCoordinatesAsString(), getWidthshort(),getWidthlong(), getHeight(), getArea());
    }
}
