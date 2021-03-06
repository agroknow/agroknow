package com.agroknow.linkchecker.domain;

import javax.ws.rs.core.Response.Status.Family;

public class URLMetadata {
    private String url;
    private String domain;
    private Family statusFamily;
    private int responseStatusCode;
    private String redirectsToUrl;

    /**
     * @param domain
     * @param url
     */
    public URLMetadata(String domain, String url) {
        super();
        this.domain = domain;
        this.url = url;
    }

    /**
     * @param domain
     * @param url
     * @param statusFamily
     * @param responseStatusCode
     */
    public URLMetadata(String domain, String url, Family statusFamily, int responseStatusCode) {
        this(domain, url);
        this.statusFamily = statusFamily;
        this.responseStatusCode = responseStatusCode;
    }

    /**
     * @return the domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * @param domain
     *            the domain to set
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return the responseStatusCode
     */
    public int getResponseStatusCode() {
        return responseStatusCode;
    }

    /**
     * @param url
     *            the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @param responseStatusCode
     *            the responseStatusCode to set
     */
    public void setResponseStatusCode(int responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
    }

    /**
     * @return the statusFamily
     */
    public Family getStatusFamily() {
        return statusFamily;
    }

    /**
     * @param statusFamily
     *            the statusFamily to set
     */
    public void setStatusFamily(Family statusFamily) {
        this.statusFamily = statusFamily;
    }

    /**
     * @return the redirectsToUrl
     */
    public String getRedirectsToUrl() {
        return redirectsToUrl;
    }

    /**
     * @param redirectsToUrl
     *            the redirectsToUrl to set
     */
    public void setRedirectsToUrl(String redirectsToUrl) {
        this.redirectsToUrl = redirectsToUrl;
    }
    
    public boolean isBroken() {
        return this.getStatusFamily() != Family.SUCCESSFUL;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UrlDto [");
        if (url != null) {
            builder.append("url=");
            builder.append(url);
            builder.append(", ");
        }
        if (domain != null) {
            builder.append("domain=");
            builder.append(domain);
            builder.append(", ");
        }
        if (statusFamily != null) {
            builder.append("statusFamily=");
            builder.append(statusFamily);
            builder.append(", ");
        }
        builder.append("responseStatusCode=");
        builder.append(responseStatusCode);
        builder.append("]");
        return builder.toString();
    }
}
