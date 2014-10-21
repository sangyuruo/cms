package com.webpagebytes.cms.cache;

public interface WBCacheFactory {
	public WBUrisCache createWBUrisCacheInstance();
	public WBWebPagesCache createWBWebPagesCacheInstance();
	public WBWebPageModulesCache createWBWebPageModulesCacheInstance();
	public WBParametersCache createWBParametersCacheInstance();
	public WBFilesCache createWBFilesCacheInstance();
	public WBArticlesCache createWBArticlesCacheInstance();
	public WBMessagesCache createWBMessagesCacheInstance();
	public WBProjectCache createWBProjectCacheInstance();
	
}
