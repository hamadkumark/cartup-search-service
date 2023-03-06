package com.cartup.search.modal;

import java.util.Date;

import org.apache.solr.client.solrj.beans.Field;

import com.cartup.commons.repo.RepoConstants;
import com.cartup.commons.repo.model.customwidget.FilterDocument;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE,
setterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility= JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BadgingConfigCollection {
	
	@Field(RepoConstants.DOC_ID_S)
    private String id;
    @Field(RepoConstants.ORG_ID_S)
    private String orgId;
    @Field(RepoConstants.ORG_NAME_S)
    private String orgName;
    @Field(RepoConstants.DOCTYPE_S)
    private String docType;
    @Field(RepoConstants.BADGE_NAME)
    private String badgeName;
    @Field(RepoConstants.IS_ENABLED_B)
    private boolean isEnabled;
    @Field(RepoConstants.BADGE_TYPE)
    private String badgeType;
    @Field(RepoConstants.ASSET_TYPE)
    private String assetType;
    @Field(RepoConstants.BADGE_PLACEMENT)
    private String badgePlacement;
    @Field(RepoConstants.DOC_INDEX_DT)
    private Date docIndexDate;
    
    public FilterDocument getBadgeType() {
    	return new Gson().fromJson(badgeType, FilterDocument.class);
    }

}
