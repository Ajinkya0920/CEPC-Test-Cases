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

WebUI.delay(30)

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/h4_IO - IOPROD_Project'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/a_Create Sub Project'))

WebUI.setText(findTestObject('Page_Dashboard - Enterprise Product Catalogue/input_Project name_gwt-debug-projectName'), 
    'Test2')

WebUI.setText(findTestObject('Page_Dashboard - Enterprise Product Catalogue/textarea_Description_gwt-debug-description'), 
    'Test2')

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/a_Version 1'))

WebUI.click(findTestObject('Object Repository/Page_Catalogues - Enterprise Product Catalogue/a_Publish'))

WebUI.click(findTestObject('Object Repository/Page_Catalogues - Enterprise Product Catalogue/a_Publish_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Publish - Enterprise Product Catalogue/select_Select an optionIO - ToluTest Projec_2791f5'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Publish - Enterprise Product Catalogue/select_Select an optionIOEVER1 CCSIOEVER1 CRM'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Publish - Enterprise Product Catalogue/select_Select an optionTestTest2'), 
    '26', true)

WebUI.click(findTestObject('Object Repository/Page_Publish - Enterprise Product Catalogue/button_Publish'))

