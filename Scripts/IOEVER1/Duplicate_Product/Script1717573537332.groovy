import com.kms.katalon.core.testobject.ConditionType as ConditionType
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

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('https://lonlinux03.cerillion.com:21343/epc/main.html#dashboard')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Username_username'), 'admin')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Password_password'), 
    '7Dxoto1EjKfQbGop/Ov+1g==')

not_run: WebUI.click(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Password_login'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/div_IO - IOPROD_ProjectEdited 15052024 (Me _d7d489'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Catalogues - Enterprise Product Catalogue/a_IO'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/Sub_Project_Obj'))

WebUI.click(findTestObject('Object Repository/Page_Catalogues - Enterprise Product Catalogue/button_New Page'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/a_Existing'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input_text'), 'DWDM')

WebUI.delay(5)

TestObject dragDropValue = new TestObject('DropDownValue').addProperty('xpath', ConditionType.EQUALS, './/td[text()="DWDM"]')

WebUI.waitForElementVisible(dragDropValue, 30)

WebUI.dragAndDropByOffset(dragDropValue, 500, 300, FailureHandling.OPTIONAL)

WebUI.clickOffset(findTestObject('Object Repository/canvas'), 0, 0, FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.rightClickOffset(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/canvas'), 1, 
    -201)

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/a_Duplicate'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/button_Allinstances'))

