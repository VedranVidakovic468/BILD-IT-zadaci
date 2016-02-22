/*(Sum series) Write a recursive method to compute the following series:
m(i) =1/3 + 2/5 + 3/7 + 4/9 + 5/11 + 6/13 + ... + i/2i + 1;
Write a test program that displays m(i) for i = 1, 2, . . ., 10.*/

package zadaci_22_2_2016;

/**
 * @author Vedran Vidakovic
 *
 */

public class Z4ZbirNiza2 {
	public static double m(int i) {
		// uslov da se zaustavi rekurzija metoda poziva sama sebe
		if (i == 0)
			return 0;
		else
			// inace sabiri i /( 2*i+1) i smanjuj i,
			return (double) i / (2 * i + 1) + m(i - 1);
	}

	public static void main(String[] args) {
		// metoda sabira za i=1 pa do i=10
		for (int i = 1; i < 11; i++) {
			System.out.println("The summation of a series of \"i = " + i + "\" shall be " + m(i) + ".");
		}
	}
}
