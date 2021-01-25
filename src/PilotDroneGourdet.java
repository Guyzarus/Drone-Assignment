
public class PilotDroneGourdet {

	private int coordinateX;
	private int coordinateY;
	private int coordinateZ;
	private int orientation;

	public PilotDroneGourdet(int coordinateX, int coordinateY, int coordinateZ) {
		super();
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		this.coordinateZ = coordinateZ;
		this.orientation = 0;
	}

	public int getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(int coordinateX) {
		this.coordinateX = coordinateX;
	}

	public int getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
	}

	public int getCoordinateZ() {
		return coordinateZ;
	}

	public void setCoordinateZ(int coordinateZ) {
		this.coordinateZ = coordinateZ;
	}

	public int getOrientation() {
		return orientation;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
		if (this.orientation < 0)
			this.orientation = 3;
		if (this.orientation > 3)
			this.orientation = 0;
	}

	public String getOrientationString() {
		switch (getOrientation()) {
		case 0:
			return "North";

		case 1:
			return "East";

		case 2:
			return "South";

		case 3:
			return "West";

		}
		return null;
	}

	public void moveLateral(int moveDirection) {
		switch (getOrientation()) {
		case 0: // north
			setCoordinateY(getCoordinateY() + moveDirection);
			break;
		case 1: // east
			setCoordinateX(getCoordinateX() + moveDirection);
			break;
		case 2: // south
			setCoordinateY(getCoordinateY() - moveDirection);
			break;
		case 3: // west
			setCoordinateX(getCoordinateX() - moveDirection);
			break;
		}
	}

}
