package app;

import app.pages.LoginPage;

/**
 * Класс, в котором создаются все страницы, благодаря этому создается только объект App,
 * из которого достаются нужные страницы
 */
public class App {

    public LoginPage loginPage;

    public App() {
        loginPage = PageBuilder.buildLoginPage();
    }
}
