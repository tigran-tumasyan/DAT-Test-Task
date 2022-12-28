package test;

import base.BaseTest;
import pages.login.LoginPage;
import pages.member.MemberPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskTest extends BaseTest {

    String correctUsername = "3132781/daticwt2021";
    String correctPassword = "daticwt2021";
    String incorrectUsername = "3132781/daticwt2111";
    String incorrectPassword = "daticwt2111";
    String authorizationErrorMessage = "Authorization Failed";

    String englishLogInText = "Log In";
    String englishUsernameFieldText = "DAT Customer Number/Username";
    String englishPasswordFieldText = "Password";
    String englishLogInButtonText = "Login";
    String englishSelectALanguageText = "Select a language";

    String greekLogInText = "Είσοδος";
    String greekUsernameFieldText = "DAT Αριθμός Χρήστη/Όνομα Χρήστη";
    String greekPasswordFieldText = "Κωδικός";
    String greekLogInButtonText = "Είσοδος";
    String greekSelectALanguageText = "Επιλογή γλώσσα";

    String frenchLogInText = "Accès Utilisateur";
    String frenchUsernameFieldText = "Numéro Client/Utilisateur";
    String frenchPasswordFieldText = "Mot De Passe";
    String frenchLogInButtonText = "Se connecter";
    String frenchSelectALanguageText = "Sélectionner une langue";

    String italianLogInText = "Log In";
    String italianUsernameFieldText = "Numero Cliente/Nome Utente";
    String italianPasswordFieldText = "Password";
    String italianLogInButtonText = "Login";
    String italianSelectALanguageText = "Seleziona una lingua";

    String russianLogInText = "Войти";
    String russianUsernameFieldText = "Номер Клиента DAT/Логин";
    String russianPasswordFieldText = "Пароль";
    String russianLogInButtonText = "Логин";
    String russianSelectALanguageText = "Выберите язык";

    String polishLogInText = "Zaloguj";
    String polishUsernameFieldText = "Nr Klienta DAT/Użytkownik";
    String polishPasswordFieldText = "Hasło";
    String polishLogInButtonText = "Zaloguj";
    String polishSelectALanguageText = "Select a language";

    String chineseLogInText = "登录";
    String chineseUsernameFieldText = "客户编号/用户名";
    String chinesePasswordFieldText = "密码";
    String chineseLogInButtonText = "登录";
    String chineseSelectALanguageText = "选择语言";

    String czechLogInText = "Přihlášení";
    String czechUsernameFieldText = "DAT Zákaznické Číslo/Uživatelské Jméno";
    String czechPasswordFieldText = "Heslo";
    String czechLogInButtonText = "Přihlásit";
    String czechSelectALanguageText = "Sprache auswählen";

    String deutschLogInText = "Anmelden";
    String deutschUsernameFieldText = "DAT Kundennummer/Benutzername";
    String deutschPasswordFieldText = "Passwort";
    String deutschLogInButtonText = "Anmelden";
    String deutschSelectALanguageText = "Sprache auswählen";

    String spanishLogInText = "Log In";
    String spanishUsernameFieldText = "Número De Cliente/Usuario";
    String spanishPasswordFieldText = "Contraseña";
    String spanishLogInButtonText = "Login";
    String spanishSelectALanguageText = "Select a language";

    String koreanLogInText = "로그인";
    String koreanUsernameFieldText = "DAT 고객 번호/사용자 ID";
    String koreanPasswordFieldText = "패스워드";
    String koreanLogInButtonText = "로그인";
    String koreanSelectALanguageText = "Select a language";

    String dutchLogInText = "Inloggen";
    String dutchUsernameFieldText = "DAT-Klantnummer/Gebruikersnaam";
    String dutchPasswordFieldText = "Wachtwoord";
    String dutchLogInButtonText = "Log in";
    String dutchSelectALanguageText = "Select a language";

    String austrianLogInText = "Anmelden";
    String austrianUsernameFieldText = "DAT Kundennummer/Benutzername";
    String austrianPasswordFieldText = "Passwort";
    String austrianLogInButtonText = "Anmelden";
    String austrianSelectALanguageText = "Sprache auswählen";

    String schweizerischLogInText = "Log In";
    String schweizerischUsernameFieldText = "DAT Customer Number/Username";
    String schweizerischPasswordFieldText = "Password";
    String schweizerischLogInButtonText = "Login";
    String schweizerischSelectALanguageText = "Select a language";

    String turkishLogInText = "Giriş Yap";
    String turkishUsernameFieldText = "DAT Müşteri Numarası/Kullanıcı Adı";
    String turkishPasswordFieldText = "Şifre";
    String turkishLogInButtonText = "Giriş";
    String turkishSelectALanguageText = "Dil seçin";

    String hungarianLogInText = "Log In";
    String hungarianUsernameFieldText = "DAT Customer Number/Username";
    String hungarianPasswordFieldText = "Password";
    String hungarianLogInButtonText = "Login";
    String hungarianSelectALanguageText = "Select a language";


    @Test
    public void loginWithCorrectCredentials(){

        LoginPage loginPage = new LoginPage(driver);

        loginPage.chooseLaterForNotifications();

        loginPage.enterUsername(correctUsername);
        loginPage.enterPassword(correctPassword);
        MemberPage memberPage = loginPage.clickOnLoginButton();
        memberPage.headerIsDisplayed();
        memberPage.itemListIsDisplayed();
    }

    @Test
    public void loginWithIncorrectUsername(){

        LoginPage loginPage = new LoginPage(driver);

        loginPage.chooseLaterForNotifications();

        loginPage.enterUsername(incorrectUsername);
        loginPage.enterPassword(correctPassword);
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.authorizationErrorText(), authorizationErrorMessage);
    }

    @Test
    public void loginWithIncorrectPassword(){

        LoginPage loginPage = new LoginPage(driver);

        loginPage.chooseLaterForNotifications();

        loginPage.enterUsername(correctUsername);
        loginPage.enterPassword(incorrectPassword);
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.authorizationErrorText(), authorizationErrorMessage);
    }

    @Test
    public void loginWithIncorrectCredentials(){

        LoginPage loginPage = new LoginPage(driver);

        loginPage.chooseLaterForNotifications();

        loginPage.enterUsername(incorrectUsername);
        loginPage.enterPassword(incorrectPassword);
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.authorizationErrorText(), authorizationErrorMessage);
    }

    @Test
    public void memberPageSomeRedirects(){

        LoginPage loginPage = new LoginPage(driver);

        loginPage.chooseLaterForNotifications();

        loginPage.enterUsername(correctUsername);
        loginPage.enterPassword(correctPassword);
        MemberPage memberPage = loginPage.clickOnLoginButton();
        memberPage.headerIsDisplayed();
        memberPage.itemListIsDisplayed();

        memberPage.check123Component();
        memberPage.checkFastTrackStdComponent();
        memberPage.checkFastTrackStandardComponent();
        memberPage.checkFastTrackStandard2Component();
        memberPage.checkInsuranceCalculationOrderTypeComponent();
        memberPage.checkCalcolatoComponent();
        memberPage.checkTestExpiredComponent();
    }

    @Test
    public void languageChangingTest(){

        LoginPage loginPage = new LoginPage(driver);

        loginPage.chooseLaterForNotifications();

        loginPage.selectEnglishLanguage();
        Assert.assertEquals(loginPage.loginText(), englishLogInText);
        Assert.assertEquals(loginPage.usernameFieldText(), englishUsernameFieldText);
        Assert.assertEquals(loginPage.passwordFieldText(), englishPasswordFieldText);
        Assert.assertEquals(loginPage.logInButtonText(), englishLogInButtonText);
        loginPage.openLanguageWindow();
        Assert.assertEquals(loginPage.selectALanguageText(), englishSelectALanguageText);

        loginPage.selectGreekLanguage();
        Assert.assertEquals(greekLogInText, loginPage.loginText());
        Assert.assertEquals(greekUsernameFieldText, loginPage.usernameFieldText());
        Assert.assertEquals(greekPasswordFieldText, loginPage.passwordFieldText());
        Assert.assertEquals(greekLogInButtonText, loginPage.logInButtonText());
        loginPage.openLanguageWindow();
        Assert.assertEquals(greekSelectALanguageText, loginPage.selectALanguageText());

        loginPage.selectFrenchLanguage();
        Assert.assertEquals(frenchLogInText, loginPage.loginText());
        Assert.assertEquals(frenchUsernameFieldText, loginPage.usernameFieldText());
        Assert.assertEquals(frenchPasswordFieldText, loginPage.passwordFieldText());
        Assert.assertEquals(frenchLogInButtonText, loginPage.logInButtonText());
        loginPage.openLanguageWindow();
        Assert.assertEquals(frenchSelectALanguageText, loginPage.selectALanguageText());

        loginPage.selectItalianLanguage();
        Assert.assertEquals(italianLogInText, loginPage.loginText());
        Assert.assertEquals(italianUsernameFieldText, loginPage.usernameFieldText());
        Assert.assertEquals(italianPasswordFieldText, loginPage.passwordFieldText());
        Assert.assertEquals(italianLogInButtonText, loginPage.logInButtonText());
        loginPage.openLanguageWindow();
        Assert.assertEquals(italianSelectALanguageText, loginPage.selectALanguageText());

        loginPage.selectRussianLanguage();
        Assert.assertEquals(russianLogInText, loginPage.loginText());
        Assert.assertEquals(russianUsernameFieldText, loginPage.usernameFieldText());
        Assert.assertEquals(russianPasswordFieldText, loginPage.passwordFieldText());
        Assert.assertEquals(russianLogInButtonText, loginPage.logInButtonText());
        loginPage.openLanguageWindow();
        Assert.assertEquals(russianSelectALanguageText, loginPage.selectALanguageText());

        loginPage.selectPolishLanguage();
        Assert.assertEquals(polishLogInText, loginPage.loginText());
        Assert.assertEquals(polishUsernameFieldText, loginPage.usernameFieldText());
        Assert.assertEquals(polishPasswordFieldText, loginPage.passwordFieldText());
        Assert.assertEquals(polishLogInButtonText, loginPage.logInButtonText());
        loginPage.openLanguageWindow();
        Assert.assertEquals(polishSelectALanguageText, loginPage.selectALanguageText());

        loginPage.selectChineseLanguage();
        Assert.assertEquals(chineseLogInText, loginPage.loginText());
        Assert.assertEquals(chineseUsernameFieldText, loginPage.usernameFieldText());
        Assert.assertEquals(chinesePasswordFieldText, loginPage.passwordFieldText());
        Assert.assertEquals(chineseLogInButtonText, loginPage.logInButtonText());
        loginPage.openLanguageWindow();
        Assert.assertEquals(chineseSelectALanguageText, loginPage.selectALanguageText());

        loginPage.selectCzechLanguage();
        Assert.assertEquals(czechLogInText, loginPage.loginText());
        Assert.assertEquals(czechUsernameFieldText, loginPage.usernameFieldText());
        Assert.assertEquals(czechPasswordFieldText, loginPage.passwordFieldText());
        Assert.assertEquals(czechLogInButtonText, loginPage.logInButtonText());
        loginPage.openLanguageWindow();
        Assert.assertEquals(czechSelectALanguageText, loginPage.selectALanguageText());

        loginPage.selectDeutscheLanguage();
        Assert.assertEquals(deutschLogInText, loginPage.loginText());
        Assert.assertEquals(deutschUsernameFieldText, loginPage.usernameFieldText());
        Assert.assertEquals(deutschPasswordFieldText, loginPage.passwordFieldText());
        Assert.assertEquals(deutschLogInButtonText, loginPage.logInButtonText());
        loginPage.openLanguageWindow();
        Assert.assertEquals(deutschSelectALanguageText, loginPage.selectALanguageText());

        loginPage.selectSpanishLanguage();
        Assert.assertEquals(spanishLogInText, loginPage.loginText());
        Assert.assertEquals(spanishUsernameFieldText, loginPage.usernameFieldText());
        Assert.assertEquals(spanishPasswordFieldText, loginPage.passwordFieldText());
        Assert.assertEquals(spanishLogInButtonText, loginPage.logInButtonText());
        loginPage.openLanguageWindow();
        Assert.assertEquals(spanishSelectALanguageText, loginPage.selectALanguageText());

        loginPage.selectKoreanLanguage();
        Assert.assertEquals(koreanLogInText, loginPage.loginText());
        Assert.assertEquals(koreanUsernameFieldText, loginPage.usernameFieldText());
        Assert.assertEquals(koreanPasswordFieldText, loginPage.passwordFieldText());
        Assert.assertEquals(koreanLogInButtonText, loginPage.logInButtonText());
        loginPage.openLanguageWindow();
        Assert.assertEquals(koreanSelectALanguageText, loginPage.selectALanguageText());

        loginPage.selectDutchLanguage();
        Assert.assertEquals(dutchLogInText, loginPage.loginText());
        Assert.assertEquals(dutchUsernameFieldText, loginPage.usernameFieldText());
        Assert.assertEquals(dutchPasswordFieldText, loginPage.passwordFieldText());
        Assert.assertEquals(dutchLogInButtonText, loginPage.logInButtonText());
        loginPage.openLanguageWindow();
        Assert.assertEquals(dutchSelectALanguageText, loginPage.selectALanguageText());

        loginPage.selectAustrianLanguage();
        Assert.assertEquals(austrianLogInText, loginPage.loginText());
        Assert.assertEquals(austrianUsernameFieldText, loginPage.usernameFieldText());
        Assert.assertEquals(austrianPasswordFieldText, loginPage.passwordFieldText());
        Assert.assertEquals(austrianLogInButtonText, loginPage.logInButtonText());
        loginPage.openLanguageWindow();
        Assert.assertEquals(austrianSelectALanguageText, loginPage.selectALanguageText());

        loginPage.selectSchweizerischLanguage();
        Assert.assertEquals(schweizerischLogInText, loginPage.loginText());
        Assert.assertEquals(schweizerischUsernameFieldText, loginPage.usernameFieldText());
        Assert.assertEquals(schweizerischPasswordFieldText, loginPage.passwordFieldText());
        Assert.assertEquals(schweizerischLogInButtonText, loginPage.logInButtonText());
        loginPage.openLanguageWindow();
        Assert.assertEquals(schweizerischSelectALanguageText, loginPage.selectALanguageText());

        loginPage.selectTurkishLanguage();
        Assert.assertEquals(turkishLogInText, loginPage.loginText());
        Assert.assertEquals(turkishUsernameFieldText, loginPage.usernameFieldText());
        Assert.assertEquals(turkishPasswordFieldText, loginPage.passwordFieldText());
        Assert.assertEquals(turkishLogInButtonText, loginPage.logInButtonText());
        loginPage.openLanguageWindow();
        Assert.assertEquals(turkishSelectALanguageText, loginPage.selectALanguageText());

        loginPage.selectHungarianLanguage();
        Assert.assertEquals(hungarianLogInText, loginPage.loginText());
        Assert.assertEquals(hungarianUsernameFieldText, loginPage.usernameFieldText());
        Assert.assertEquals(hungarianPasswordFieldText, loginPage.passwordFieldText());
        Assert.assertEquals(hungarianLogInButtonText, loginPage.logInButtonText());
        loginPage.openLanguageWindow();
        Assert.assertEquals(hungarianSelectALanguageText, loginPage.selectALanguageText());
    }

}
