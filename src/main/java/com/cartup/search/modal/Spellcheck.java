package com.cartup.search.modal;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE,
setterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility= JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown=true)

public class Spellcheck {
	public List<String> getCompound_suggestions() {
		return compound_suggestions;
	}
	public void setCompound_suggestions(List<String> compound_suggestions) {
		this.compound_suggestions = compound_suggestions;
	}
	public List<String> getProduct_suggestions() {
		return product_suggestions;
	}
	public void setProduct_suggestions(List<String> product_suggestions) {
		this.product_suggestions = product_suggestions;
	}
	private List<String> compound_suggestions;
	private List<String> product_suggestions;
}