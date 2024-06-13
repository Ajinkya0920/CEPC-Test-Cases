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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://lonlinux03.cerillion.com:21323/auth/realms/IOEVER1_CEPC/protocol/openid-connect/auth?client_id=cepcauth&redirect_uri=https%3A%2F%2Flonlinux03.cerillion.com%3A21343%2Fepc%2Fmain.html%23dashboard&state=2b1563d5-1695-4bd3-a334-c160abc7b313&response_mode=fragment&response_type=code&scope=openid&nonce=09acbb77-49ee-453e-aeb6-8b1a0039fcd8')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Username_username'), 'Username')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Password_password'), 'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Password_login'))