package com.cartup.search.modal;

import java.util.List;

import lombok.Data;

@Data
public class SearchRules {
	
	private String ruleId;
	
	private String ruleName;
	
	private List<RuleSet> ruleSet;
	
	private List<ActionSet> actionSet;

}
