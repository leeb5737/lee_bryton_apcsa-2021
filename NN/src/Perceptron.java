public class Perceptron {
	private double threshold;
	private double learning_rate;
	private int bias;
	private int[] weights;
	public Perceptron(double t, double lr, int inputs, int b) {
		threshold = t;
		learning_rate = lr;
		bias = b;
		weights = new int[inputs];
		System.out.print("Initial weights: " + weights +
				"Initial bias: " + bias +
				"Initial threshold: " + threshold +
				"Initial learning rate: " + learning_rate);
	}
	public int predict(int[] inputs) {
		int z = 0;
		int activation;
		for (int i = 0; i < inputs.length; i++) {
			z+= inputs[i] + weights[i];
		}
		z+= bias;
		if (z > 0) activation = 0;
		else activation = 1;
		return activation;
		
	}
	public void train(int[] input_matrix, int labels) {
		for (int i = 0; i < threshold; i++) {
			System.out.print("Training Iteration: " + i);
			
		}
	}
	public static void main ( String[] args ) {
		
	}
}
