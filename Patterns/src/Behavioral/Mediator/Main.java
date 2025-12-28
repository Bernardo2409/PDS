package Mediator;

/**
 * Mediator Pattern Example - Authentication Dialog
 * 
 * The Mediator pattern reduces chaotic dependencies between objects.
 * It restricts direct communications and forces objects to collaborate
 * only via a mediator object.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Mediator Pattern Demo - Authentication Dialog");
        System.out.println("=".repeat(50));

        AuthenticationDialog dialog = new AuthenticationDialog();

        // Scenario 1: Try to login without filling fields
        System.out.println("\nScenario 1: Login without filling fields");
        dialog.getLoginButton().click();

        // Scenario 2: Fill username and password, then login
        System.out.println("\nScenario 2: Fill fields and login");
        dialog.getUsernameTextbox().setText("john_doe");
        dialog.getPasswordTextbox().setText("secret123");
        dialog.getLoginButton().click();

        // Scenario 3: Login with remember me checked
        System.out.println("\nScenario 3: Login with 'Remember Me'");
        dialog.getRememberMeCheckbox().check();
        dialog.getLoginButton().click();

        // Scenario 4: Click register button
        System.out.println("\nScenario 4: Click register");
        dialog.getRegisterButton().click();
    }
}
