package com.cartup.search.modal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility= JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown=true)
public class FacetFilter {
    private String repoFieldId;
    private String value;
    private String type;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRepoFieldId() {
        return repoFieldId;
    }

    public void setRepoFieldId(String repoFieldId) {
        this.repoFieldId = repoFieldId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
