import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.loc.Account;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.Description;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean expected;

    public AccountTest(String testName, boolean expected){
        this.name = testName;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Тест имя : {0} valid  {1}")
    public static Object[][] getOrderData() {
        return new Object[][]{
                { "Asd asd", true},
                { "a b", true},
                { "123456789 123456789", true},
                { "as", false},
                { "123456789 1234567890", false},
                { "sdsdas", false},
                { "sd sd as", false},
                { " sdsdas", false},
                { "sdsdas ", false}

        };
    }


    @Test
    @DisplayName("Check Name Test")
    public void checkNameTest(){
        Account account = new Account(name);
        boolean res = account.checkNameToEmboss();

        assertEquals("Validation wrong", expected, res);

    }

}
