import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.sikuli.script.Pattern as Pattern
import org.sikuli.script.Screen as Screen
import com.kms.katalon.core.configuration.RunConfiguration



Screen s = new Screen()
Pattern click3Button = new Pattern((RunConfiguration.getProjectDir()+ '\\SikuliImages\\'+clickImage+'.png').replaceAll('[\\\\/]+', '/'))
s.wait(click3Button, 10)
s.rightClick(click3Button)

