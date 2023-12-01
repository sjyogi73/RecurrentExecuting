import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://shloklabs-adroitpayroll.greythr.com/')

WebUI.setText(findTestObject('Object Repository/Page_greytHR IDP/input_username'), '433')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_greytHR IDP/input_password'), 'v2hNRcSmpQIGSBa9yU4OGA==')

WebUI.click(findTestObject('Page_greytHR IDP/button_Log in'))

//WebUI.click(findTestObject('Page_greytHR IDP/button_Signin'))

WebUI.delay(0)

//WebUI.click(findTestObject('Object Repository/Page_greytHR IDP/div_image-gt-icon-logout w-2x h-2x'))

WebUI.closeBrowser()

