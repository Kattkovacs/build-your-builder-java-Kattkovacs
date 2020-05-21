package com.codecool.mainproduct.logging;

import java.time.ZonedDateTime;
import java.time.ZoneId;

/**
 * An implementation of the {@code Logger} interface.
 * <p>
 * Logs messages for the standard error stream of the process.
 */
public class ConsoleLogger extends AbstractLogger {
    /**
     * Create an instance which logs to the given log levels.
     */
    public ConsoleLogger(LogLevel... levels) {
        super(levels);
    }

    @Override
    protected void safeLog(LogLevel level, String message) {
        var formattedMessage = formatMessage(level, message);
        System.err.println(formattedMessage);
    }

    private String formatMessage(LogLevel level, String message) {
        var time = ZonedDateTime.now(ZoneId.of("UTC"));
        return String.format("%s - %s: %s",
                             time, level, message);
    }
}
