/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13.pkg2;

/**
 *
 * @author Gonzalo
 */
public class ConversorTemperaturas {
        final float grados = 80;
    
    public float centigradosAFahrenheit(float centigrados) throws Excepcion{
        float fahrenheit;
        if(centigrados > 80){
            throw new Excepcion();
        } else {
            fahrenheit = (float) (9.0 / 5.0 * centigrados + 32.4);
            return fahrenheit;

}
    }
    public float centigradorAReamur(float centigrados) throws Excepcion{
        float reamur = 0;
        if(centigrados>80){
            throw new Excepcion();
        }else{
            reamur = (float)(4.0/5.0*centigrados);
            return reamur;
        }
    }
}
