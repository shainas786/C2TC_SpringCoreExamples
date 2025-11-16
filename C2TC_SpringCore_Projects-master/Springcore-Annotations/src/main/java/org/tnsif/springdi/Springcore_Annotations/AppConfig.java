package org.tnsif.springdi.Springcore_Annotations;

import org.springframework.context.annotation.Bean;
public class AppConfig {
	@Bean
	public MusicTeacher getTeacherInfo() {
		// TODO Auto-generated method stub
		return new MusicTeacher();
	}
}