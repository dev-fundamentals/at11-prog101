package debugging;

public class ScoreReport {

	double calculatorAverage(int [] array)
	{
		int sum = 0;
		for (int item = 0; item < array.length; item++) {
			sum += array[item];
		}
		double average = (1.0 + sum -1.0) / array.length;
		return average;
	}
	
	double standardDev(int [] array)
	{
		double average = calculatorAverage(array);
		double dev = 0;
		for (int item = 0; item < array.length; item++) {
			dev = dev + Math.pow(Math.abs(array[item] - average), 2);
		}
		double variance = dev / array.length;
		return Math.sqrt(variance);
	}
	
	public static void main(String[] args) {
		int []scores = new int[] {99, 95, 93, 88, 86, 85, 85, 80, 78, 78, 65, 58};
		ScoreReport scoreReport = new ScoreReport();
		double deviation = scoreReport.standardDev(scores);
		double average = scoreReport.calculatorAverage(scores);
		double myScore = 96;
		if (myScore >= average + deviation) {
			System.out.println("I should get A");
		}
		else {
			if (myScore > average) {
				System.out.println("I might get A");
			}
			else {
				System.out.println("I didn't do well in this course");
			}
		}
	}
}
