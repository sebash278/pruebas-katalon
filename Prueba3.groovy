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
selenium.open("chrome://newtab/")
selenium.open("https://magento.softwaretestingboard.com/men.html")
selenium.click("id=ui-id-17")
selenium.open("https://magento.softwaretestingboard.com/men/tops-men.html")
selenium.click("xpath=//div[2]")
selenium.click("xpath=//a[@id='ui-id-5']/span[2]")
selenium.open("https://magento.softwaretestingboard.com/men.html")
selenium.click("id=ui-id-19")
selenium.open("https://magento.softwaretestingboard.com/men/tops-men/jackets-men.html")
selenium.click("link=Typhon Performance Fleece-lined Jacket")
selenium.open("https://magento.softwaretestingboard.com/typhon-performance-fleece-lined-jacket.html")
selenium.click("id=option-label-size-143-item-170")
selenium.click("id=option-label-color-93-item-53")
selenium.click("id=product-addtocart-button")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='My Cart'])[1]/following::span[1]")
selenium.click("xpath=//div[@id='minicart-content-wrapper']/div[2]/div[5]/div/a/span")
selenium.open("https://magento.softwaretestingboard.com/checkout/cart/")
