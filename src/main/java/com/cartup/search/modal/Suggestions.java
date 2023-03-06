package com.cartup.search.modal;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE,
setterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility= JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown=true)
class Suggestions {
	private List<String> auto_suggestions;
	private List<AutoSuggestCategories> auto_suggestions_cats;
	
	public List<String> getAuto_suggestions() {
		return auto_suggestions;
	}
	public void setAuto_suggestions(List<String> auto_suggestions) {
		this.auto_suggestions = auto_suggestions;
	}
	public List<AutoSuggestCategories> getAuto_suggestions_cats() {
		return auto_suggestions_cats;
	}
	public void setAuto_suggestions_cats(List<AutoSuggestCategories> auto_suggestions_cats) {
		this.auto_suggestions_cats = auto_suggestions_cats;
	}
}