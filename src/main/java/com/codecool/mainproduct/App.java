package com.codecool.mainproduct;

import com.codecool.mainproduct.logging.Logger;
import com.codecool.mainproduct.logging.ConsoleLogger;
import static com.codecool.mainproduct.logging.LogLevel.*;

/**
 * Our very important flagship product.
 * <p>
 * Has space-age features such as logging.
 */
public class App {

    private final Logger logger;

    /**
     * Create an instance of the app. A logger must be supplied which
     * will be used via the whole lifetime of the app.
     *
     * @param logger  The logger that will be used by the app.
     */
    public App(Logger logger) {
        if (logger == null) {
            // This error can't be logged by its nature
            throw new IllegalArgumentException("logger can't be null");
        }
        this.logger = logger;
    }

    /**
     * Entry point of the app.
     *
     * @param args  Arguments supplied via the command line. They are
     *              ignored at this version.
     */
    public static void main(String[] args) {
        App app = new App(new ConsoleLogger(INFO, WARNING, ERROR));
        app.start();
    }

    /**
     * Start the application.
     */
    public void start() {
        logger.log(INFO, "The app has started.");
    }
}
