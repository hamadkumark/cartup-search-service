package com.cartup.search.modal;

import java.util.Comparator;

import lombok.Data;

@Data
public class RuleSet implements Comparator<Integer> {
	
	private String key;
	
	private Integer type;
	
	private String operator;
	
	private String value;

	@Override
	public int compare(Integer type1, Integer type2) {
		return type1.compareTo(type2);
	}

}
