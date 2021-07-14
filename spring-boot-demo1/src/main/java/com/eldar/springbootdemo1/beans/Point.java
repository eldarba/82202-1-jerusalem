package com.eldar.springbootdemo1.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Data
public class Point {

	private int x;
	private int y;

}
