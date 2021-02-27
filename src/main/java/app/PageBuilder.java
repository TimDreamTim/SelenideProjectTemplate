package app;

import app.pages.LoginPage;

/**
 * Класс для создания страниц в одном месте
 */
public class PageBuilder {

    public static LoginPage buildLoginPage() {
        return new LoginPage("/login");
    }
}
