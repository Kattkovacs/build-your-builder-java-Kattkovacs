package com.codecool.mainproduct.logging;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

/**
 * An abstract implementtion of the {@code Logger} interface.  Holdes
 * some common logic.
 * <p>
 * Extending classes should override the {@code safeLog} method which
 * hides the filtering logic for the different log levels.
 */
public abstract class AbstractLogger implements Logger {

    private final Set<LogLevel> levels;

    protected AbstractLogger(LogLevel... levels) {
        this.levels = new HashSet<>(Arrays.asList(levels));
    }

    protected final void withLevel(LogLevel level, Runnable logic) {
        if (levels.contains(level)) {
            logic.run();
        }
    }

    @Override
    public final void log(LogLevel level, String message) {
        withLevel(level, () -> safeLog(level, message));
    }

    protected abstract void safeLog(LogLevel level, String message);
}
