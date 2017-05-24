/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci;

import java.math.BigInteger;

/**
 *
 * @author Jeremiasz
 */
public class FibonacciJeremiaszCzaja
{

    public static BigInteger fibonacci(int a) throws Exception
    {
        if(a<0)
        {
            throw new Exception();
        }
        else
        {
            if (a == 0)
                    return new BigInteger("0");
            else
            {
                     if (a == 1)
                    return new BigInteger("1");
                     else
                     {
                          return (fibonacci(a-1).add(fibonacci(a-2)));
                     }
            }
        }
    }

                
 
}
