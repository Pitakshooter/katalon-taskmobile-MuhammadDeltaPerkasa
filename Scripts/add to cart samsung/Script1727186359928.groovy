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

Mobile.startApplication('apk/Solodroid.apk.apk', false)

Mobile.verifyElementExist(findTestObject('Button Search'), 0)

Mobile.tap(findTestObject('Checkout/recent.tab'), 0)

Mobile.tap(findTestObject('Checkout/Samsung galaxy'), 0)

Mobile.waitForElementPresent(findTestObject('Checkout/Add to Cart'), 0)

Mobile.tap(findTestObject('Checkout/Add to Cart'), 0)

Mobile.sendKeys(findTestObject('Checkout/Number of Order'), '2')

Mobile.tap(findTestObject('Checkout/add pada field number of order'), 0)

Mobile.tap(findTestObject('Checkout/Check Cart'), 0)

Mobile.verifyElementExist(findTestObject('Checkout/Samsung galaxy pada cart'), 0)

Mobile.closeApplication()

