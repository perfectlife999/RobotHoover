package robot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class RobotController {



	@PostMapping("/robot")
	RobotOutput getRobot(@RequestBody RoboticInput hoover) {
		//System.out.println(hoover.getRoomSize());
		
		Robot robot = new Robot();
		robot.setLocation(hoover.getCoords()[0], hoover.getCoords()[1]);
		robot.setDirtyPatch(hoover.getPatches());
		robot.setRoomSize(hoover.getRoomSize());
		String instructions = hoover.getInstructions();
		for(int i =0;i<instructions.length();i++){
			
			robot.move(instructions.charAt(i));
			robot.clean();
		}
		
		RobotOutput output= new RobotOutput();
		output.setCoords(robot.getLoation());
		output.setPatches(robot.getCleanedPatch());
		
		
		//System.out.println("fininsh");
		return output;
	}

	
}