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

'Dikondisikan sudah login sebagai yoshuadwi@gmail.com , nanti\r\n'
WebUI.openBrowser('https://demo-app.online/login')
WebUI.maximizeWindow()
WebUI.waitForElementPresent(findTestObject('Web/Login/input_Email_email'), 5)

WebUI.setText(findTestObject('Web/Login/input_Email_email'), 'yoshuadwi@gmail.com')
WebUI.setText(findTestObject('Web/Login/input_Kata                                                            Sandi_password'), 
    'yoshuadwi06')
WebUI.click(findTestObject('Web/Login/button_Login'))


WebUI.waitForElementPresent(findTestObject('Web/Home/LogoUser'), 2)
WebUI.mouseOver(findTestObject('Web/Home/LogoUser'))
WebUI.takeScreenshot('Screenshots/Web/ChangeProfile/CP-001/1.png')

WebUI.click(findTestObject('Web/Home/a_My Account'))
WebUI.takeScreenshot('Screenshots/Web/ChangeProfile/CP-001/2.png')

WebUI.click(findTestObject('Web/Dashboard/a_Profil'))
WebUI.takeScreenshot('Screenshots/Web/ChangeProfile/CP-001/3.png')

WebUI.click(findTestObject('Web/Dashboard-MyProfile/a_Edit Profile'))
WebUI.takeScreenshot('Screenshots/Web/ChangeProfile/CP-001/4.png')

