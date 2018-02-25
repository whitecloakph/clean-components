package com.whitecloak.cleancomponents.app.login;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.BDDMockito.then;

public class LoginPresenterTest extends PresenterTest {

    @InjectMocks
    LoginPresenter presenter;

    @Mock
    LoginView view;

    @Test
    public void login_shouldShowMain() throws Exception {
        presenter.login("username", "password");

        then(view).should().showMain();
    }
}