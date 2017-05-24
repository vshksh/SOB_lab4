/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package silnia;

/**
 *
 * @author Jeremiasz
 */
public class SilniaJeremiaszCzaja
{
    public static int silnia(int n)
    {
        int value = 1;
        
        for (int i = 1; i < n; i++)
        {
            value = value + value*i;
        }
        return value;
    }
}
