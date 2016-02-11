/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2014 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
package org.orcid.pojo.ajaxForm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RequestInfoForm implements ErrorsInterface, Serializable {
    private static final long serialVersionUID = 1L;
    private List<String> errors = new ArrayList<String>();
    private Set<ScopeInfoForm> scopes = new HashSet<ScopeInfoForm>();
    private String clientDescription;
    private String clientId;
    private String clientName;
    private String memberName;
    private String redirectUrl;
    private String responseType;
    private String stateParam;
    private String userId;
    private boolean clientHavePersistentTokens = false;

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public Set<ScopeInfoForm> getScopes() {
        return scopes;
    }

    public void setScopes(Set<ScopeInfoForm> scopes) {
        this.scopes = scopes;
    }

    public String getClientDescription() {
        return clientDescription;
    }

    public void setClientDescription(String clientDescription) {
        this.clientDescription = clientDescription;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public String getStateParam() {
        return stateParam;
    }

    public void setStateParam(String stateParam) {
        this.stateParam = stateParam;
    }

    public boolean getClientHavePersistentTokens() {
        return clientHavePersistentTokens;
    }

    public void setClientHavePersistentTokens(boolean clientHavePersistentTokens) {
        this.clientHavePersistentTokens = clientHavePersistentTokens;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getScopesAsString() {
        String result = new String();
        for (ScopeInfoForm form : scopes) {
            result += form.getValue() + " ";
        }
        return result.trim();
    }
}
