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

def invalidemail = GlobalVariable.invalid_email

def validpassword = GlobalVariable.valid_password

WebUI.openBrowser('')

WebUI.navigateToUrl('https://apps.ssayomart.com/')

WebUI.click(findTestObject('Object Repository/LoginObj/Page_Ssayomart/a_Download Ssayomart_nav-link'))

WebUI.setText(findTestObject('Object Repository/LoginObj/Page_Masuk/input_Daftar_email'), invalidemail)

WebUI.setText(findTestObject('Object Repository/LoginObj/Page_Masuk/input_Daftar_password'), validpassword)

WebUI.click(findTestObject('Object Repository/LoginObj/Page_Masuk/button_Masuk'))

WebUI.verifyTextPresent('Anda tidak dapat masuk. Harap periksa kredensial Anda.', false)

WebUI.closeBrowser()

