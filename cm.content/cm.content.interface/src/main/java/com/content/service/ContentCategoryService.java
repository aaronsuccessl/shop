package com.content.service;


import java.util.List;

import com.manager.common.utils.E3Result;
import com.manager.pojo.EasyUITreeNode;

public interface ContentCategoryService {
	List<EasyUITreeNode> getContentCatList(long parentId);
	E3Result addContentCategory(long parentId, String name);
}
