/*
 * Copyright (c) 2000, 2001, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package util.prefs;

import java.util.prefs.Preferences;
import java.util.prefs.PreferencesFactory;

/**
 * Implementation of  <tt>PreferencesFactory</tt> to return
 * WindowsPreferences objects.
 *
 * @author  Konstantin Kladko
 * @see java.util.prefs.Preferences
 * @see WindowsPreferences
 * @since 1.4
 */
class WindowsPreferencesFactory implements PreferencesFactory {

    /**
     * Returns WindowsPreferences.userRoot
     */
    public java.util.prefs.Preferences userRoot() {
        return WindowsPreferences.userRoot;
    }

    /**
     * Returns WindowsPreferences.systemRoot
     */
    public Preferences systemRoot() {
        return WindowsPreferences.systemRoot;
    }
}
