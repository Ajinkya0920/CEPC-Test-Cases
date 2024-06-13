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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://lonlinux03.cerillion.com:19103/epc/main.html?project=28#dashboard')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GIBPKTS1CEPC/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to GIBPKTS1CEPC/input_Password_password'), '/5S6MFFLcE4A78PC0HwgEA==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to GIBPKTS1CEPC/input_Password_login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/div_Gibtelecom - Pooja_DemoEdited 22052024 _a8718a'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/a_Create Sub Project'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/input_Project name_gwt-debug-projectName'), 
    'Demo')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/textarea_Description_gwt-debug-description'), 
    'Demo')

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/a_Demo'))

WebUI.click(findTestObject('Object Repository/Page_Catalogues - Enterprise Product Catalogue/button_New Page'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/a_Existing'))

WebUI.delay(5)

TestObject dragDropValue = new TestObject('DropDownValue').addProperty('xpath', ConditionType.EQUALS, './/td[text()="200 SMS"]')

WebUI.waitForElementVisible(dragDropValue, 30)

WebUI.dragAndDropByOffset(dragDropValue, 500, 400, FailureHandling.OPTIONAL)

WebUI.clickOffset(findTestObject('canvas'), 0, 0, FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.rightClickOffset(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/canvas'), 
    1, -7)

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/a_Create a new version'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_24'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/button_Proceed'))

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__Tariff Charge'), 
    '10')

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/a_Save'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/a_Validate'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/a_Validate_1'))

WebUI.click(findTestObject('Object Repository/Page_Validate - Enterprise Product Catalogue/a_Validate'))

WebUI.delay(20)

