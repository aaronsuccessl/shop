package com.content.service;

import java.util.List;

import com.manager.common.utils.E3Result;
import com.manager.pojo.TbContent;

public interface ContentService {
	E3Result addContent(TbContent content);
	List<TbContent> getContentListByCid(long cid);
}
