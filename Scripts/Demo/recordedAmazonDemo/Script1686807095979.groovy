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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.setText(findTestObject('Object Repository/recordedAmazonObjects/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
    'mobile')

WebUI.click(findTestObject('Object Repository/recordedAmazonObjects/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/recordedAmazonObjects/Page_Amazon.com  mobile/i_More-sustainable Products_a-icon a-icon-checkbox'))

WebUI.click(findTestObject('Object Repository/recordedAmazonObjects/Page_Amazon.com Mobile - Climate Pledge Friendly/img_Price and other details may vary based _072a4b'))

WebUI.click(findTestObject('Object Repository/recordedAmazonObjects/Page_Amazon.com SAMSUNG Galaxy A53 5G A Ser_1ff36c/input_There was a problem retrieving the co_d71a61'))

WebUI.closeBrowser()

