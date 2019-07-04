package cm.manager.search.service;

import javax.naming.directory.SearchResult;

public interface SearchService {

	SearchResult search(String keyword, int page, int rows)  throws Exception;
}

