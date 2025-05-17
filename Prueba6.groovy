import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://magento.softwaretestingboard.com/")
selenium.click("link=Sign In")
selenium.click("id=email")
selenium.type("id=email", ("rica@gmail.com").toString())
selenium.click("id=pass")
selenium.type("id=pass", "1234Hola")
selenium.click("id=send2")
selenium.click("xpath=//img[@alt='Argus All-Weather Tank']")
selenium.click("id=option-label-size-143-item-166")
selenium.click("id=option-label-color-93-item-52")
selenium.click("xpath=//button[@id='product-addtocart-button']/span")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Toggle Nav'])[1]/following::a[2]")
selenium.click("id=top-cart-btn-checkout")
selenium.click("id=CV8L11T")
selenium.type("id=CV8L11T", ("Calle 4").toString())
selenium.click("id=H8UNYCU")
selenium.type("id=H8UNYCU", "32")
selenium.click("id=O973S96")
selenium.type("id=O973S96", "87")
selenium.click("id=SQ9QF46")
selenium.type("id=SQ9QF46", "Bogota")
selenium.click("id=checkout")
selenium.click("id=R3CP2YM")
selenium.select("id=R3CP2YM", "label=Colorado")
selenium.click("id=HPV5VFN")
selenium.type("id=HPV5VFN", "102645")
selenium.click("id=shipping-new-address-form")
selenium.type("id=CIQSL1T", "123456")
selenium.click("name=ko_unique_5")
selenium.click("id=HPV5VFN")
selenium.type("id=HPV5VFN", "10264")
selenium.click("xpath=//div[@id='shipping-method-buttons-container']/div/button/span")
