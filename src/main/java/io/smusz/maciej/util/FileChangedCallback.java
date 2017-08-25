package io.smusz.maciej.util;

import java.io.File;

/**
 * Defines interface called by FileMonitor when a file change event occurs.
 */
public interface FileChangedCallback {
    public void fileChanged(File file);
}
