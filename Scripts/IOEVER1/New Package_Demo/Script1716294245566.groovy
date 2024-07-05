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

WebUI.setText(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/input_Loading_gwt-debug-'), 
    'packag')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('ProductPackage'))

not_run: CustomKeywords.'webKeywords.ApplicationFunction.keywordRobotDragDrop'()

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Gibtel/Page_Catalogue View - Enterprise Product Catalogue/input__dhxId_JCEel9d0KBoH'), Keys.chord(
        Keys.ENTER, 'a', Keys.DELETE))

/*
TestObject dragDropProductPackage = new TestObject('DropDownValue').addProperty('xpath', ConditionType.EQUALS, '(.//*[text()="Product/Package"])[1]')

WebUI.waitForElementVisible(dragDropProductPackage, 30)

WebUI.dragAndDropByOffset(dragDropProductPackage, 400, 400, FailureHandling.OPTIONAL)

WebUI.clickOffset(findTestObject('canvas'), 100, 100, FailureHandling.OPTIONAL)

WebUI.delay(5)

WebDriver driver = DriverFactory.getWebDriver()

Actions actions = new Actions(driver)

WebElement element = driver.findElement(By.xpath('(.//*[text()=\'Product/Package\'])[1]'))

actions.dragAndDropBy(element, 400, 400)
*/
WebUI.setText(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/input__dhxId_JCEel9d0KBoH'), 
    'Dani')

WebUI.click(findTestObject('Page_Catalogue View - Enterprise Product Catalogue/div_DanishKrone'))

WebUI.setText(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/input__dhxId_WHxYYvx9S88C'), 
    'Pa')

WebUI.click(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/div_Package'))

WebUI.sendKeys(findTestObject('Gibtel/Page_Catalogue View - Enterprise Product Catalogue/input__dhxId_NvDyHh8AXgXD'), Keys.chord(
        Keys.ENTER, 'a', Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/IOEVER/Page_Catalogue View - Enterprise Product Catalogue/input__dhxId_BFOrI7OMyFHo'), 
    'Mobi')

WebUI.click(findTestObject('Object Repository/IOEVER/Page_Catalogue View - Enterprise Product Catalogue/div_MobileService'))

WebUI.setText(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/input__Product Description'), 
    'Mobile Service')

WebUI.setText(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/input__Order 11'), 
    'O11_P0000312')

WebUI.click(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/a_Save'))

WebUI.rightClickOffset(findTestObject('Page_Catalogue View - Enterprise Product Catalogue/canvas'), -2, -26)

WebUI.click(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/a_Add New'))

WebUI.click(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/div_Combo'))

WebUI.setText(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/input__Group Name'), 
    'Mobile Service')

WebUI.setText(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/input__Minimum Products'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/input__Maximum Products'), 
    '1')

WebUI.click(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/a_Save'))

WebUI.rightClickOffset(findTestObject('Page_Catalogue View - Enterprise Product Catalogue/canvas'), -5, 102)

WebUI.click(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/a_Add New'))

WebUI.click(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/a_ProductLink to Component Product'))

WebUI.sendKeys(findTestObject('Page_Catalogue View - Enterprise Product Catalogue/input__dhxId_NJDZnz9bJNXj'), Keys.chord(
        Keys.ENTER, 'a', Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__dhxId_NJDZnz9bJNXj'), 
    'Dani')

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_DanishKrone'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__dhxId_q3v7KopyxxeW'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_AdditionalService'))

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__dhxId_xxtHQVbGIcQK'), 
    'Mob')

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_MobileService'))

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__Product Description'), 
    'Service')

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__dhxId_Zswt7estmhJq'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_Add-Ons'))

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__Order 11'), 'O11_P0000313')

WebUI.click(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/a_Save'))

WebUI.rightClickOffset(findTestObject('Page_Catalogue View - Enterprise Product Catalogue/canvas'), -7, 176)

WebUI.click(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/a_Add New'))

WebUI.click(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/a_Product Charge OptionCharge'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_Show Zero Charge On Invoice_dhxform_img chbx0'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_Group Default_dhxform_img chbx1'))

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input_Charge Type_dhxId_coh3HQ3WocmC'), 
    'Pur')

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_Purchase'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div__dhxcombo_select_img'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/div_PurchaseCharge-P0'))

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__Tariff Charge'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__Gl 11 Cost'), 
    'Gl_11_C')

WebUI.setText(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/input__Gl 11 Income'), 
    'GL_11_I')

WebUI.click(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/a_Save'))

WebUI.click(findTestObject('Object Repository/Gibtel/Page_Catalogues - Enterprise Product Catalogue/a_Validate'))

WebUI.click(findTestObject('Object Repository/Gibtel/Page_Catalogues - Enterprise Product Catalogue/a_Validate_1'))

WebUI.click(findTestObject('Object Repository/Gibtel/Page_Validate - Enterprise Product Catalogue/a_Validate'))

WebUI.delay(20)

