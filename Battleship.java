import java.util.Scanner;

public class Battleship {

	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.println("Pick your grid (1-4):");
		int seed = input.nextInt();
		Grid g = new Grid(seed);

		int shots = 12;

		int row = 0;
		int col = 0;
		int n = 0;
		System.out.println("The battle begins!");

		for (int i = 0;i < 12;i++ ){

			System.out.println("You have " + shots  + " shots remaining.");

			System.out.println("choose your square:");
			n = input.nextInt();
			row = n / 10;
			col = n % 10;


			g.fire(row, col);
			if (g.hit == 5 && seed == 2) {
				g.printGrid();
				System.out.println("You won! and in only " + (i + 1) + " shots!");
				break;
			}

			if (g.hit == 4 && seed == 1) {
				g.printGrid();
				System.out.println("You won! and in only " + (i+1) + " shots!");
				break;
			} else if (g.hit == 9 && seed == 3) {
				g.printGrid();
				System.out.println("You won! and in only " + (i+1) + " shots!");
				break;
			} else if (g.hit == 10 && seed == 4) {
				g.printGrid();
				System.out.println("You won! and in only " + (i+1) + " shots!");
				break;
			}
			g.printGrid();
			shots--;
		}
		if (shots == 0) {
			System.out.println("You're out of ammunition! Game Over!");
		}

	}
}
