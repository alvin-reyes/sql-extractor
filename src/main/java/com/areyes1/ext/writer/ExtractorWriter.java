package com.areyes1.ext.writer;

import java.io.StringWriter;
import java.util.List;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.areyes1.ext.obj.ExtractConfigLineOutput;

/**
 * The Class ExtractorWriter.
 */
public class ExtractorWriter implements ItemWriter<ExtractConfigLineOutput> {

	/** The extract to where. */
	@Autowired
	@Qualifier("extractToWhere")
	private String extractToWhere;
	
	/* (non-Javadoc)
	 * @see org.springframework.batch.item.ItemWriter#write(java.util.List)
	 */
	public void write(List<? extends ExtractConfigLineOutput> items)
			throws Exception {

		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		ve.setProperty("classpath.resource.loader.class",ClasspathResourceLoader.class.getName());
		ve.init();
		
		Template t = ve.getTemplate("/velocity/extract_template.vm");
		VelocityContext context = new VelocityContext();
		
		context.put("items",items);
		StringWriter writer = new StringWriter();
		t.merge(context, writer);
		
		
		System.out.println(writer.toString());

	}

}
