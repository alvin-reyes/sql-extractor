package com.areyes1.ext.main;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * The Class AppConfig.
 */
@Configuration
@Import({Providers.class,DBConfig.class,DaoConfig.class})
@ComponentScan(basePackages = {"com.areyes1.ext.dao","com.areyes1.ext.factory"})
@ImportResource(locations="job-config.xml")
public class AppConfig {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("extract_job");
		
		try {
			JobParametersBuilder jobParamBuilder = new JobParametersBuilder();
			jobParamBuilder.addString("properties_location", System.getProperty("inputPropertiesConfig"));
			
			org.springframework.batch.core.JobExecution execution = jobLauncher
					.run(job, jobParamBuilder.toJobParameters());
			
			System.out.println("Exit Status : " + execution.getStatus());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
