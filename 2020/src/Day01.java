import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Day01 {
	private static List<String> readFile(String filename) {
		List<String> records = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null) {
				records.add(line.replace('x', ' '));
			}
			reader.close();
			return records;
		} catch (Exception e) {
			System.err.format("Exception occurred trying to read '%s'.", filename);
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		List<String> input = readFile(
				"C:\\Users\\Win7 Pro x64\\eclipse-workspace\\Advent of Code 2020\\src\\inputDay01.txt");
		String[] in = new String[input.size()];
		in = input.toArray(in);

		int[] intInput = new int[input.size()];

		for (int i = 0; i < in.length; i++) {
			intInput[i] = Integer.parseInt(in[i]);
		}

		for (int i = 0; i < intInput.length; i++) {
			for (int j = i + 1; j < intInput.length; j++) {
				for (int k = i + 2; k < intInput.length; k++) {
					if (intInput[i] + intInput[j] + intInput[k] == 2020) {
						System.out.println(intInput[i] * intInput[j] * intInput[k]);
						return;
					}
				}
			}
		}

	}
}
