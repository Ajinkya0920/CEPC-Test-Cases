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

WebUI.openBrowser('https://lonlinux03.cerillion.com:21343/epc/main.html?project#dashboard')

WebUI.delay(50)

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/a_Projects Available_glyphicon glyphicon-pl_4b449d'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/input_Name_gwt-debug-'), 'IOEVER1 CRM')

WebUI.setText(findTestObject('IO Target/Page_Dashboard - Enterprise Product Catalogue/input_Description_gwt-debug-'), 'IOEVER1 CRM')

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/img'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/div_CRM'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/input_App Server URL_gwt-uid-168'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/button_OK'))

WebUI.click(findTestObject('IO Target/Page_Dashboard - Enterprise Product Catalogue/img_Https_radiobutton'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/input_Server Name_gwt-debug-'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/input_Server Name_gwt-debug-'), 
    'lonlinux03.cerillion.com')

WebUI.setText(findTestObject('IO Target/Page_Dashboard - Enterprise Product Catalogue/input_Port_target'), '21243')

WebUI.delay(5)

WebUI.setText(findTestObject('IO Target/Page_Dashboard - Enterprise Product Catalogue/input_User Name_gwt-debug-'), 'super')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/input_User Password_gwt-debug-_password'), 
    'MolI0eyq5yA=')

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/button_Test Target'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/button_Save'))

