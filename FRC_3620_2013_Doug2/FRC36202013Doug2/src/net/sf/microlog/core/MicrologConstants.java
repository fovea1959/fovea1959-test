/*
 * Copyright 2008 The Microlog project @sourceforge.net
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.sf.microlog.core;

/**
 * The <code>MicrologConstants</code> class contains the global constants for
 * Microlog.
 * 
 * @author Johan Karlsson (johan.karlsson@jayway.se)
 */
public class MicrologConstants {

	public static final String DEFAULT_BT_UUID_STRING = "80d41dda939840c41b605d69043dab6";
	public static final String STOP_LOGGING_COMMAND_STRING = "[STOP]";
	public static final String DEFAULT_PROPERTY_FILE = "/microlog.properties";
	public static final String MICROLOG_MESSAGE_PREFIX = "microlog: ";
	public static final char DOT_CHAR = '.';
	public static final int TEN = 10;
	
	/**
	 * The default host to connect to for logging.
	 */
	public static final String DEFAULT_HOST = "127.0.0.1";
	public static final String DEFAULT_SYSLOG_TAG = "microlog";

}
