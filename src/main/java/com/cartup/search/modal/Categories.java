package com.cartup.search.modal;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE,
setterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility= JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown=true)
public class Categories {
	private List<String> cat_suggestions;

	public List<String> getCat_suggestions() {
		return cat_suggestions;
	}

	public void setCat_suggestions(List<String> cat_suggestions) {
		this.cat_suggestions = cat_suggestions;
	}
}