package tests

import org.openqa.selenium.By
import org.testng.annotations.Test
import support.FunctionalTestSupport

class FrontPageTest9 extends FunctionalTestSupport {

    @Test
    void testFrontPage() {
        goToAppRoot()
        assert driver.findElement(By.cssSelector("h1")).text == "Welcome to Gradle Summit!"
        sleep 1000
    }


}
