/*
 * This source file was generated by the Gradle 'init' task
 */
package leetcode;

import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        logger.info(new App().getGreeting());
    }
}
