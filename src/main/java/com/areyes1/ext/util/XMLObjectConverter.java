package com.areyes1.ext.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.springframework.oxm.Marshaller;

/**
 * The Class XMLObjectConverter.
 *
 * @param <T> the generic type
 */
public class XMLObjectConverter<T> {

	/**
	 * Convert xml to object list.
	 *
	 * @param file the file
	 * @param t the t
	 * @return the list
	 */
	public List<T> convertXmlToObjectList(File file, T t) {
		return null;
	}
	
	/**
	 * The main method. // just to quickly test it. Sorry
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File(
				"/Users/alvinreyes/EclipseProjects/JavaAlgo/simple-sql-extractor/src/main/resources/dbconfig/db-config.xml");
		try {

			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement().getChild("databases");
			List<Element> list = rootNode.getChildren("database");

			for (int i = 0; i < list.size(); i++) {
				Element node = (Element) list.get(i);
				System.out.println(node.getAttributeValue("name"));
				
			}

		} catch (IOException io) {
			System.out.println(io.getMessage());
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		}
	}
	
	

}
