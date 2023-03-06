package com.cartup.search.modal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.Gson;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE,
setterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility= JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown=true)
public class KeywordSuggestorResponse {
	
	private Annotation annotations;
	private Object ptime;
	
	public Annotation getAnnotations() {
		return annotations;
	}

	public void setAnnotations(Annotation annotations) {
		this.annotations = annotations;
	}

	public Object getPtime() {
		return ptime;
	}

	public void setPtime(Object ptime) {
		this.ptime = ptime;
	}

	public static void main(String[] args) {
		String json = "{\"annotations\":{\"categories\":{\"cat_suggestions\":[\"earbuds\",\"wireless earbuds\"]},\"did_you_mean\":\"headphone 700\",\"lang_features\":{\"headphone\":[\"headphone\",\"NOUN\",\"NN\",\"ROOT\",\"xxxx\",\"True\",\"False\",[]],\"token_nlp_ent_header\":[\"ent.start_char\",\"ent.end_char\",\"ent.label_\"],\"token_nlp_noun_chunks\":[\"headphone\"],\"token_nlp_pos_header\":[\"token.lemma_\",\"token.pos_\",\"token.tag_\",\"token.dep_\",\"token.shape_\",\"token.is_alpha\",\"token.is_stop\",\"children\"]},\"spellcheck\":{\"compound_suggestions\":[\"headphone\"],\"product_suggestions\":[\"headphone\"]},\"suggestions\":{\"auto_suggestions\":[\"headphone\",\"headphone - space\",\"headphone - space grey\",\"headphones\",\"headphone 700\"],\"auto_suggestions_cats\":[{\"cat_suggestions\":[\"earbuds\",\"wireless earbuds\"],\"keyword\":\"headphone\",\"type\":\"keyword\"},{\"cat_suggestions\":[\"headphones\",\"wireless headphones\"],\"keyword\":\"headphone - space\",\"type\":\"keyword\"},{\"cat_suggestions\":[\"headphones\",\"wireless headphones\"],\"keyword\":\"headphone - space grey\",\"type\":\"keyword\"},{\"cat_suggestions\":[],\"category_url\":null,\"keyword\":\"headphones\",\"type\":\"category\"},{\"cat_suggestions\":[\"headphones\",\"wireless headphones\"],\"keyword\":\"headphone 700\",\"type\":\"keyword\"}]}},\"ptime\":{\"AutoSuggestProcessorHandler-autocomplete_search\":0.055,\"AutoSuggestProcessorHandler-process\":0.063,\"AutoSuggestProcessorHandler-read_corpus\":0.004,\"CategoryProcessorHandler-annotation_response\":0.007,\"CategoryProcessorHandler-find_category\":0.17200000000000001,\"CategoryProcessorHandler-find_category_auto_suggestion\":0.022,\"CategoryProcessorHandler-process\":0.186,\"CategoryProcessorHandler-read_corpus\":0.004,\"LanguageProcessorHandler-lang_features\":12.765,\"LanguageProcessorHandler-process\":12.803,\"LanguageProcessorHandler-read_corpus\":0.011,\"ProductProcessorHandler-find_category\":0.011,\"ProductProcessorHandler-process\":0.017,\"ProductProcessorHandler-read_corpus\":0.003,\"SpellcheckProcessorHandler-annotation-compound-end\":0.052,\"SpellcheckProcessorHandler-annotation-compound-lookup_compound\":0.043000000000000003,\"SpellcheckProcessorHandler-annotation-compound-word_segmentation\":0.005,\"SpellcheckProcessorHandler-annotation-product-end\":0.103,\"SpellcheckProcessorHandler-annotation-product-lookup_compound\":0.09000000000000001,\"SpellcheckProcessorHandler-annotation-product-word_segmentation\":0.008,\"SpellcheckProcessorHandler-cspell_suggestions\":0.061,\"SpellcheckProcessorHandler-process\":0.186,\"SpellcheckProcessorHandler-pspell_suggestions\":0.11699999999999999,\"SpellcheckProcessorHandler-read_corpus\":0.005,\"response_handler\":13.313},\"user-search\":{\"autosuggest_category\":true,\"device\":\"iphone\",\"fuzzy_suggest\":false,\"keyword\":\"headphone\",\"lang\":\"en\",\"language_spell_check\":false,\"orgid\":\"7d35439c-d1d6-4d55-ad08-7d9757b01c00\",\"spell_word_segementation\":false,\"type\":\"key-suggestion/search/filter\",\"user_cookie\":\"cookie\"}}";		
		Gson gson = new Gson();
	
		KeywordSuggestorResponse keywordInfo = gson.fromJson(json, KeywordSuggestorResponse.class);
		System.out.println(keywordInfo);
	}
}