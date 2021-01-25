import java.util.Scanner;

//Author Name: Guy-Evens Gourdet
//Date: 1/17/2020
//Program Name: PilotDrone_Gourdet
//Purpose: Simulation using button, drone movement in x,y,z location

public class TestDrone_Gourdet {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		PilotDroneGourdet firstDrone = new PilotDroneGourdet(0, 0, 0);

		boolean running = true;

		while (running) {
			System.out.println("Which direction would you like to move the drone?");
			System.out.println("1 - Move Up"); // positive movement along z axis
			System.out.println("2 - Move Down"); // negative movement along z axis
			System.out.println("3 - Move Forward"); // positive movement along y axis
			System.out.println("4 - Move Backward"); // negative movement along y axis
			System.out.println("5 - Turn Left");
			System.out.println("6 - Turn Right");
			System.out.println("7 - Display Postion");
			System.out.println("8 - Exit Navigation");

			int choice = input.nextInt();

			switch (choice) {
			case 1:
				firstDrone.setCoordinateZ(firstDrone.getCoordinateZ() + 1);
				System.out.println("Drone moved up.");
				break;

			case 2:
				firstDrone.setCoordinateZ(firstDrone.getCoordinateZ() + -1);
				System.out.println("Drone moved down.");
				break;
			case 3:
				firstDrone.moveLateral(1);
				System.out.println("Drone moved forward");
				break;

			case 4:
				firstDrone.moveLateral(-1);
				System.out.println("Drone moved backward");
				break;
			case 5:
				firstDrone.setOrientation(firstDrone.getOrientation() - 1);
				System.out.println("Drone turned left");
				break;
			case 6:
				firstDrone.setOrientation(firstDrone.getOrientation() + 1);
				System.out.println("Drone turned right");
				break;
			case 7:
				int x = firstDrone.getCoordinateX();
				int y = firstDrone.getCoordinateY();
				int z = firstDrone.getCoordinateZ();
				String or_title = firstDrone.getOrientationString();

				System.out.println("Drone position: " + x + ", " + y + ", " + z + " Orientation: " + or_title);
				break;
			case 8:
				running = false;
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}

		}

	}

}
