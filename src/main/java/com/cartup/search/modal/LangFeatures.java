package com.cartup.search.modal;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE,
setterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility= JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown=true)

class LangFeatures {
	private List<String> token_nlp_ent_header;
	private List<String> token_nlp_noun_chunk;
	private List<String> token_nlp_pos_header;
	public List<String> getToken_nlp_ent_header() {
		return token_nlp_ent_header;
	}
	public void setToken_nlp_ent_header(List<String> token_nlp_ent_header) {
		this.token_nlp_ent_header = token_nlp_ent_header;
	}
	public List<String> getToken_nlp_noun_chunk() {
		return token_nlp_noun_chunk;
	}
	public void setToken_nlp_noun_chunk(List<String> token_nlp_noun_chunk) {
		this.token_nlp_noun_chunk = token_nlp_noun_chunk;
	}
	public List<String> getToken_nlp_pos_header() {
		return token_nlp_pos_header;
	}
	public void setToken_nlp_pos_header(List<String> token_nlp_pos_header) {
		this.token_nlp_pos_header = token_nlp_pos_header;
	}

}


