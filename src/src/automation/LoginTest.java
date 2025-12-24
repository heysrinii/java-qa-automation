package automation;

public class LoginTest extends BaseTest {
    public void loginTest() {
        setup();
        System.out.println("Login test executed");
    }

    public static void main(String[] args) {
        LoginTest test = new LoginTest();
        test.loginTest();
    }
}
