package com.areyes1.ext.util;

import java.io.UnsupportedEncodingException;

import org.apache.commons.lang.StringUtils;
import org.springframework.util.Base64Utils;

import com.thoughtworks.xstream.core.util.Base64Encoder;

/**
 * The Class EnDecrypt.
 */
public class EnDecrypt {
	
	/** The salt. */
	private static String SALT = "";
	
	/**
	 * Encrypt.
	 *
	 * @param str the str
	 * @return the string
	 */
	public static String encrypt(String str) {

		byte[] bytes = null;
		String encoded = null;
		try {
			bytes = str.getBytes("UTF-8");
			encoded = new Base64Encoder().encode(bytes);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		return encoded;
	}
	
	/**
	 * Decrypt.
	 *
	 * @param str the str
	 * @return the string
	 */
	public static String decrypt(String str) {
		return "";
		//return org.springframework.util.StringUtils.newStringUtf8(Base64Utils.decodeFromString(str));
	}

	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println(encrypt("pass"));
		System.out.println(decrypt("cGFzcw=="));
	}
}
