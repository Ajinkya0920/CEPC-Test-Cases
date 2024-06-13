import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.sikuli.script.Pattern as Pattern
import org.sikuli.script.Screen as Screen
import com.kms.katalon.core.configuration.RunConfiguration


Screen s = new Screen()
Pattern dragArea = new Pattern((RunConfiguration.getProjectDir()+ '\\SikuliImages\\P1.png').replaceAll('[\\\\/]+', '/'))
Pattern dropArea = new Pattern((RunConfiguration.getProjectDir()+ '\\SikuliImages\\Canvas.png').replaceAll('[\\\\/]+', '/'))

s.dragDrop(dragArea, dropArea)

