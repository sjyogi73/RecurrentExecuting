import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

if (!GlobalVariable.isSkip) {
	
	WebUI.openBrowser(GlobalVariable.url)
	
	WebUI.setText(findTestObject('Object Repository/Page_greytHR IDP/input_username'), GlobalVariable.user)
	
	WebUI.setEncryptedText(findTestObject('Object Repository/Page_greytHR IDP/input_password'), GlobalVariable.password)
	
	WebUI.click(findTestObject('Page_greytHR IDP/button_Log in'))
	
	WebUI.delay(30)
	
	WebUI.click(findTestObject('Object Repository/TempSignOut/Page_greytHR/button_Sign Out-ydrated-de2'))

	WebUI.click(findTestObject('Object Repository/TempSignOut/Page_greytHR/span_Client Location-ydrated-6f7'))

	WebUI.click(findTestObject('Object Repository/TempSignOut/Page_greytHR/div_Client Location-ydrated-585'))
	
	WebUI.delay(20)
	
	WebUI.click(findTestObject('Object Repository/TempSignOut/Page_greytHR/button_Sign Out-ydrated-d2d'))
	
	WebUI.closeBrowser()

}