package robot;

public class RoboticInput {
	
	Integer[] roomSize ;//= new Integer[2];
	Integer[] coords ;//= new Integer[2];
	Integer[][] patches ; 
	String instructions ;

	public Integer[] getCoords() {
		return coords;
	}

	public void setCoords(Integer[] coords) {
		this.coords = coords;
	}

	public Integer[][] getPatches() {
		return patches;
	}

	public void setPatches(Integer[][] patches) {
		this.patches = patches;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public Integer[] getRoomSize() {
		return roomSize;
	}

	public void setRoomSize(Integer[] roomSize) {
		this.roomSize = roomSize;
	}

}
