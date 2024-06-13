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

WebUI.navigateToUrl('https://lonlinux03.cerillion.com:21343/epc/main.html#dashboard')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Password_password'), '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Password_login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/div_IO - IOPROD_ProjectEdited 15052024 (Me _d7d489'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/a_Create Sub Project'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/input_Project name_gwt-debug-projectName'), 
    'Test1')

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/a_Test1'))

WebUI.click(findTestObject('Object Repository/Page_Catalogues - Enterprise Product Catalogue/a_Validate'))

WebUI.click(findTestObject('Object Repository/Page_Catalogues - Enterprise Product Catalogue/a_Validate_1'))

WebUI.click(findTestObject('Object Repository/Page_Validate - Enterprise Product Catalogue/a_Validate'))

WebUI.click(findTestObject('Object Repository/Page_Validate - Enterprise Product Catalogue/button_'))

WebUI.click(findTestObject('Object Repository/Page_Validate - Enterprise Product Catalogue/a_Merge To Main Project'))

WebUI.click(findTestObject('Object Repository/Page_Validate - Enterprise Product Catalogue/button_Yes'))

