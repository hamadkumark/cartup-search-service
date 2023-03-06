package com.cartup.search.modal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE,
setterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility= JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown=true)
public class Annotation {
	
	private Categories categories;
	private String did_you_mean;
	private LangFeatures lang_features;
	private Spellcheck spellcheck;
	private Suggestions suggestions;
	
	public Categories getCategories() {
		return categories;
	}
	public void setCategories(Categories categories) {
		this.categories = categories;
	}
	public String getDid_you_mean() {
		return did_you_mean;
	}
	public void setDid_you_mean(String did_you_mean) {
		this.did_you_mean = did_you_mean;
	}
	public LangFeatures getLang_features() {
		return lang_features;
	}
	public void setLang_features(LangFeatures lang_features) {
		this.lang_features = lang_features;
	}
	public Suggestions getSuggestions() {
		return suggestions;
	}
	public void setSuggestions(Suggestions suggestions) {
		this.suggestions = suggestions;
	}
	public Spellcheck getSpellcheck() {
		return spellcheck;
	}
	public void setSpellcheck(Spellcheck spellcheck) {
		this.spellcheck = spellcheck;
	}
}