/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.couchapptakeout.plugins;

import java.io.File;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;

/**
 * Implementing this interface allows you to create a couchdb plugin that can be run
 * in a couchapp.
 * 
 * @param db the database the user is working with
 * @param instance the full database instance.
 * @param workingWolder a folder that has been created if your plugin needs to use the filesystem.
 * 
 */
public interface Plugin {
     void start(CouchDbConnector db, CouchDbInstance instance, File workingFolder);
}
