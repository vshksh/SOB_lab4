/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package silnia;

import java.math.BigInteger;

/**
 *
 * @author Jeremiasz
 */
public class SilniaJeremiaszCzaja
{
    public static BigInteger silnia(int n)
    {
        
        
        BigInteger value = new BigInteger("1");
        
        for (int i = 1; i < n; i++)
        {
            value = value.add( value.multiply(new BigInteger(""+i)));
        }
        return value;
    }
}
