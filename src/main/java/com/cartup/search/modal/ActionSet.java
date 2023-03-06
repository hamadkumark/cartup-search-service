package com.cartup.search.modal;

import java.util.List;

import lombok.Data;

@Data
public class ActionSet {
	
	private Integer type;
	
	private List<String> value;
	
	private String field;
	
	private boolean isPreProcessor;

}
