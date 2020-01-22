/**
 * 
 */
package com.fairfield.chalktalk.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Base64;

import javax.ws.rs.QueryParam;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fairfield.chalktalk.utility.ChacktalkUtil;

/**
 * @author Ashwini Sajjan
 *
 */
@RestController
public class FileDownloadController {

	@RequestMapping(value = "/download", method = RequestMethod.GET, produces="application/pdf")
	public ResponseEntity<String> getMentorProfiles(@QueryParam("filePath") String filePath) {
		//byte[] response = null;
		String response = null;
		try {
			//File file = Paths.get(filePath).toFile();
			DefaultResourceLoader loader = new DefaultResourceLoader();
			File file = new File(filePath);
			/*System.out.println(filePath);
			file.getAbsolutePath();*/
			InputStream is = new FileInputStream(file);
			String profilePic = Base64.getEncoder().encodeToString(IOUtils.toByteArray(is));
			response = profilePic;
			is.close();
		} catch (Exception e) {
			return new ResponseEntity<String>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if(response == null) {
			return new ResponseEntity<String>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

		//Returning successful response.
		return new ResponseEntity<String>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.OK);
	}
}
