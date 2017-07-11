package monteCarlo;

/**
 * This class runs a monteCarlo integration to calculate pie. 
 * @author thomasseagrave
 *
 */
public class Pie {

	/**
	 * Calculates pie, using i iterations
	 * @param i
	 * @return pie
	 */
	public double calculatePie(int i) {
		double nThrows = i;
		double nHits = 0;
		for (int j = 0; j < nThrows; ++j) {
			double r1 = Math.random();
			double r2 = Math.random();
			double r = (r1*r1) + (r2*r2);
			if (r <= 1) 
				++nHits;
		}
		double pie = 4*(nHits/nThrows);
		return pie;
	}

}


