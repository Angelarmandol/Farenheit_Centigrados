/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdu;

/**
 *
 * @author ANGEL
 */
public class CentsToFarenheit implements ConvertionMethod {

     
    @Override
    public double method(double value) {
        double cent= (value*9/5)+32;
        return cent;
    }
    
    
  
 
    
}
