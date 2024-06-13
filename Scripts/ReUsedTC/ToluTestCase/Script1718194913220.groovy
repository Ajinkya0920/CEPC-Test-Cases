import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

WebUI.openBrowser('')

WebUI.navigateToUrl('https://lonlinux03.cerillion.com:21343/epc/main.html#dashboard')

'Maximize current window'
WebUI.maximizeWindow()

Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_MINUS)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_MINUS)

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_MINUS)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_MINUS)

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_MINUS)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_MINUS)

WebUI.setText(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Password_password'), '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/div_IO - ToluTest ProjectEdited 1520 (Me 1519)'))
