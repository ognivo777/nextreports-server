/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ro.nextreports.server.licence;

import java.io.File;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import licence.nextserver.LicenceException;
//import licence.nextserver.LicenseLoader;
//import licence.nextserver.NextServerLicense;

public class NextServerModuleLicence implements ModuleLicence {
	
	private static final Logger LOG = LoggerFactory.getLogger(NextServerModuleLicence.class);
	
	public static final String LICENCES_FOLDER = "licences";
	public static final String ANALYSIS_MODULE = "analysismdl"; 
	public static final String BATCH_MODULE = "batchmdl";
	public static final String AUDIT_MODULE = "auditmdl";

	@Override
	public boolean isValid(String moduleName) {

//		File f = new File("./" + LICENCES_FOLDER + "/" + moduleName + ".key");
//		if (f.exists()) {
//			LOG.info("* Licence " + moduleName + " : found");
//		}
//
//		try {
//			NextServerLicense licence = LicenseLoader.decodeLicence(f);
//			if (licence.isValid() && moduleName.equals(licence.getPCODE())) {
//				LOG.info("  Valid licence for " +  moduleName + " module.");
//				return true;
//			}
//		} catch (LicenceException e) {
//
//			// try to get from classpath (need for war version)
//			LOG.info("* Licence " + moduleName + " : try to get it from classpath.");
//			InputStream input = getClass().getResourceAsStream("/" + moduleName + ".key");
//			if (input == null) {
//				LOG.info("* Licence " + moduleName + " : not found in classpath.");
//				LOG.info("  Invalid licence for " +  moduleName + " module.");
//				return false;
//			} else {
//				LOG.info("* Licence " + moduleName + " : found in classpath.");
//			}
//			try {
//				NextServerLicense licence = LicenseLoader.decodeLicence(input);
//				if (licence.isValid() && moduleName.equals(licence.getPCODE())) {
//					LOG.info("  Valid licence for " +  moduleName + " module.");
//					return true;
//				}
//			} catch (LicenceException ex) {
//				LOG.info("  Invalid licence for " +  moduleName + " module.");
//			}
//		}
		return false;
	}

}
