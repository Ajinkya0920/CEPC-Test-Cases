package sikuli

import org.sikuli.script.Pattern
import org.sikuli.script.Screen

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration


public class DragAndDrop {
	@Keyword
	public void sikuliDragDrop(String dragImage, String dropImage) {
		Screen s = new Screen()
		Pattern dragArea = new Pattern((RunConfiguration.getProjectDir()+ '\\SikuliImages\\'+dragImage+'.png').replaceAll('[\\\\/]+', '/'))
		Pattern dropArea = new Pattern((RunConfiguration.getProjectDir()+ '\\SikuliImages\\'+dropImage+'.png').replaceAll('[\\\\/]+', '/'))

		s.dragDrop(dragArea, dropArea)
	}
}
