package com.cartup.search.modal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility= JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown=true)
public class KeyWordSuggestorRequest {
    private String orgid;
    private String keyword;
    private String device;
    private String user_cookie;
    private String lang;
    private String type;
    private boolean autosuggest_category;
    private boolean fuzzy_suggest;
    private boolean spell_word_segementation;
    private boolean language_spell_check;
    private String algo;
    

	public String getCookie() {
        return user_cookie;
    }

    public void setCookie(String cookie) {
        this.user_cookie = cookie;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAlgo() {
        return algo;
    }

    public void setAlgo(String algo) {
        this.algo = algo;
    }
    
    public boolean getAutoSuggest() {
        return autosuggest_category;
    }

    public void setAutoSuggest(boolean autosuggest_category) {
        this.autosuggest_category = autosuggest_category;
    }
    
    public boolean getFuzzySuggest() {
        return fuzzy_suggest;
    }

    public void setFuzzySuggest(boolean fuzzy_suggest) {
        this.fuzzy_suggest = fuzzy_suggest;
    }
    
    
    public boolean getSpellWordSegementation() {
        return spell_word_segementation;
    }

    public void setSpellWordSegementation(boolean spell_word_segementation) {
        this.spell_word_segementation = spell_word_segementation;
    }
    
    
    public boolean getLanguageSpellCheck() {
        return language_spell_check;
    }

    public void setLanguageSpellCheck(boolean language_spell_check) {
        this.language_spell_check = language_spell_check;
    }
    
    
}
