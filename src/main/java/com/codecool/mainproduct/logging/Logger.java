package com.codecool.mainproduct.logging;

/**
 * A general interface for logging. All applications classes should
 * be using one.
 */
public interface Logger {
    /**
     * Log a single event.
     * <p>
     * The message will be logged only if the given log level is
     * configured for the logger.
     *
     * @param level  The severity level of the event.
     * @param message  The message of the event.
     */
    public void log(LogLevel level, String message);
}
