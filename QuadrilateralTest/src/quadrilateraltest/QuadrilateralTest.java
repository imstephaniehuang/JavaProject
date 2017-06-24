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
public class QuadrilateralTest {

    public static void main(String[] args) {
       
        // A rectangle is an equiangular parallelogram
        Rectangle rectangle = new Rectangle(17.0, 14.0, 30.0, 14.0, 30.0, 28.0,17.0, 28.0);
        square square =  new square(4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0);
        trapezoid trapezoid =new trapezoid(0.0, 0.0,10.0, 0.0,8.0, 5.0,3.3, 5.0);
        parellelogram parellelogram =new parellelogram(5.0, 5.0 ,11.0, 5.0,12.0, 20.0,6.0, 20.0);

        System.out.println(trapezoid);
        System.out.println();
        System.out.println(parellelogram);
        System.out.println();
        System.out.println(rectangle);
        System.out.println();
        System.out.println(square);
        
       
    }

}

