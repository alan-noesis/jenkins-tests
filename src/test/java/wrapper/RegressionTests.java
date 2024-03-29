package wrapper;

import org.junit.jupiter.api.Test;

public class RegressionTests extends BaseTests {

    @Test
    public void CT_001() {
        actions.init(true);

        context.set("FIRST_NAME", "Alan");
        context.set("LAST_NAME", "Silva");
        context.set("PASSWORD", "S7r0ngP4assW0rd");

        facebookPage.navigateTo();
        facebookPage.fillFirstName(context.get("FIRST_NAME"));
        facebookPage.fillLastName(context.get("LAST_NAME"));
        facebookPage.fillPhone("21999999999");
        facebookPage.fillPassword(context.get("PASSWORD"));
        facebookPage.selectDay("25");
        facebookPage.selectMonth("8");
        facebookPage.selectYear("2000");
        facebookPage.checkMale();
    }
}
