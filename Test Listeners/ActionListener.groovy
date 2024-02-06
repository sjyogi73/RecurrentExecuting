import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class ActionListener {

    /**
     * Executes before every test suite starts.
     * @param testSuiteContext: related information of the executed test suite.
     */

    @BeforeTestCase
    def SkipTest(TestCaseContext testCaseContext)
    {
        def dayOfWeek = new Date().format("EEEE")

        if (dayOfWeek in ["Saturday", "Tuesday"])
        {
            testCaseContext.skipThisTestCase()
            WebUI.comment('It is Weekend')
        }
        else
        {
            WebUI.comment('Test continues...')
        }
    }
}