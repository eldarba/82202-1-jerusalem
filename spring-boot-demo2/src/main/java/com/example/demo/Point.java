package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Data
public class Point {

	@Autowired
	private Integer x;
	@Autowired
	private Integer y;

}
