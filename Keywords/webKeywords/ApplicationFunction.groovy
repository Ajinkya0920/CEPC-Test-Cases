package webKeywords

import java.awt.Robot;
import java.awt.event.InputEvent;

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class ApplicationFunction {

	@Keyword
	def keywordRobotDragDrop() {
		Robot robot = new Robot()
		robot.mouseMove(4, 20)

		Thread.sleep(2000)

		robot.mouseMove(80,350)
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		

		Thread.sleep(5000)


		robot.mouseMove(400,400)
		Thread.sleep(1000)
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
}
