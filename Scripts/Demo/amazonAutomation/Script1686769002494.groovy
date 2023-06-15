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

WebUI.openBrowser('https://www.amazon.com')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/amazonTestObjects/searchTextBox'), 2)

WebUI.click(findTestObject('Object Repository/amazonTestObjects/searchTextBox'))

WebUI.setText(findTestObject('Object Repository/amazonTestObjects/searchTextBox'), 'Mobile')

WebUI.click(findTestObject('Object Repository/amazonTestObjects/searchButton'))

WebUI.verifyElementNotChecked(findTestObject('Object Repository/amazonTestObjects/checkBox'), 2)

WebUI.check(findTestObject('Object Repository/amazonTestObjects/checkBox'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Object Repository/amazonTestObjects/Item'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/amazonTestObjects/Item'))

WebUI.waitForElementPresent(findTestObject('Object Repository/amazonTestObjects/price'), 5)

String price = WebUI.getText(findTestObject('Object Repository/amazonTestObjects/price'))
println('price ::'+price)

WebUI.verifyElementPresent(findTestObject('Object Repository/amazonTestObjects/addToCart'), 2)

WebUI.click(findTestObject('Object Repository/amazonTestObjects/addToCart'))

WebUI.waitForElementPresent(findTestObject('Object Repository/amazonTestObjects/proceedToCheckout'), 10)

WebUI.click(findTestObject('Object Repository/amazonTestObjects/proceedToCheckout'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/amazonTestObjects/createAccount'), 2)

WebUI.closeBrowser()
