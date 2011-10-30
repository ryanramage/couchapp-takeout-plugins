/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.couchapptakeout.plugins;

import java.io.File;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;

/**
 *
 * @author ryan
 */
public interface Plugin {
     void start(CouchDbConnector db, CouchDbInstance instance, File workingFolder);
}
