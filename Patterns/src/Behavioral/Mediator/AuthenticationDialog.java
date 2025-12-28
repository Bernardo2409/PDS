package Mediator;

/**
 * Concrete Mediator - coordinates interactions between components.
 */
public class AuthenticationDialog implements Mediator {
    private Button loginButton;
    private Button registerButton;
    private Textbox usernameTextbox;
    private Textbox passwordTextbox;
    private Checkbox rememberMeCheckbox;

    public AuthenticationDialog() {
        this.loginButton = new Button(this);
        this.registerButton = new Button(this);
        this.usernameTextbox = new Textbox(this);
        this.passwordTextbox = new Textbox(this);
        this.rememberMeCheckbox = new Checkbox(this);
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == loginButton && event.equals("click")) {
            System.out.println("Mediator: Login button clicked - validating credentials...");
            if (!usernameTextbox.getText().isEmpty() && !passwordTextbox.getText().isEmpty()) {
                System.out.println("Mediator: Credentials valid - logging in!");
                if (rememberMeCheckbox.isChecked()) {
                    System.out.println("Mediator: Saving session for next time.");
                }
            } else {
                System.out.println("Mediator: Please fill in all fields!");
            }
        }

        if (sender == registerButton && event.equals("click")) {
            System.out.println("Mediator: Register button clicked - opening registration form...");
        }

        if (sender == usernameTextbox && event.equals("textChanged")) {
            System.out.println("Mediator: Username field changed.");
        }
    }

    // Getters for demo
    public Button getLoginButton() {
        return loginButton;
    }

    public Button getRegisterButton() {
        return registerButton;
    }

    public Textbox getUsernameTextbox() {
        return usernameTextbox;
    }

    public Textbox getPasswordTextbox() {
        return passwordTextbox;
    }

    public Checkbox getRememberMeCheckbox() {
        return rememberMeCheckbox;
    }
}
