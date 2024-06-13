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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://lonlinux03.cerillion.com:21343/epc/main.html#dashboard')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Password_password'), '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Password_login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/h4_IO - IOPROD_Project'))

WebUI.delay(5)

not_run: WebUI.enhancedClick(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/a_Create Sub Project'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/input_Project name_gwt-debug-projectName'), 
    'Test')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/textarea_Description_gwt-debug-description'), 
    'Test')

not_run: WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/Sub_Project_Obj'))

WebUI.click(findTestObject('Object Repository/Page_Catalogues - Enterprise Product Catalogue/button_New Page'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/a_Existing'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input_text'), 'PKGDARK')

WebUI.delay(5)

TestObject dragDropValue = new TestObject('DropDownValue').addProperty('xpath', ConditionType.EQUALS, './/td[text()="PKGDARK"]')

WebUI.waitForElementVisible(dragDropValue, 30)

WebUI.dragAndDropByOffset(dragDropValue, 500, 300, FailureHandling.OPTIONAL)

WebUI.clickOffset(findTestObject('canvas'), 0, 0, FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.rightClickOffset(findTestObject('canvas'), -143, 107)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/a_Add New'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_Product'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Catalogue View - Enterprise Product Catalogue/input__dhxId_uRRkyLTqXRyX'))

WebUI.sendKeys(findTestObject('Page_Catalogue View - Enterprise Product Catalogue/input__dhxId_uRRkyLTqXRyX'), Keys.chord(
        Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('Page_Catalogue View - Enterprise Product Catalogue/input__dhxId_uRRkyLTqXRyX'), 'Dani')

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_DanishKrone'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__dhxId_sKk1UBJC8on5'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_ChargeableItem'))

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__dhxId_Me0s79kugGWZ'), 
    'Bro')

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_BroadbandService'))

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__Product Description'), 
    'Fiber1')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__dhxId_aDjwK651GXMZ'), 
    'Add')

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_Add-Ons'))

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__Order 11'), 'O11_ADDDARK01')

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/a_Save'))

WebUI.delay(5)

WebUI.rightClickOffset(findTestObject('canvas'), -100, 160)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/a_Add New'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_Product Charge Option'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_Show Zero Charge On Invoice_dhxform_img chbx0'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_Group Default_dhxform_img chbx1'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input_Charge Type_dhxId_sedJxj5NLkwi'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_Rental'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div__dhxcombo_select_img_1'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_MonthlyCharge-R1'))

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__Tariff Charge'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__Gl 11 Cost'), 
    'GL11C')

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__Gl 11 Income'), 
    'GL11I')

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/a_Save'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/a_Validate'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/a_Validate_1'))

WebUI.click(findTestObject('Object Repository/Page_Validate - Enterprise Product Catalogue/a_Validate'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Validate - Enterprise Product Catalogue/a_IOPROD_Project'))

WebUI.click(findTestObject('Object Repository/Page_Catalogues - Enterprise Product Catalogue/a_Validate'))

WebUI.click(findTestObject('Object Repository/Page_Catalogues - Enterprise Product Catalogue/a_Validate_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Validate - Enterprise Product Catalogue/select_Select an optionTest'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Page_Validate - Enterprise Product Catalogue/a_Validate'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/IOEVER/Page_Dashboard - Enterprise Product Catalogue/a_Publish'))

WebUI.click(findTestObject('Object Repository/IOEVER/Page_Dashboard - Enterprise Product Catalogue/a_Publish_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/IOEVER/Page_Publish - Enterprise Product Catalogue/select_Select an optionIO - ToluTest Projec_2791f5'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IOEVER/Page_Publish - Enterprise Product Catalogue/select_Select an optionIOEVER1 CCSIOEVER1 CRM'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IOEVER/Page_Publish - Enterprise Product Catalogue/select_Select an optionTestTest'), 
    '14', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IOEVER/Page_Publish - Enterprise Product Catalogue/select_CompleteDelta'), 
    'DELTA', true)

WebUI.click(findTestObject('Object Repository/IOEVER/Page_Publish - Enterprise Product Catalogue/button_Publish'))

WebUI.delay(20)

