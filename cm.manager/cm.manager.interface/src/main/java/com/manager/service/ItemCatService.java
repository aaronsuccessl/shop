package com.manager.service;

import java.util.List;

import com.manager.pojo.EasyUITreeNode;

public interface ItemCatService {
	List<EasyUITreeNode> getItemCatlist(long parentId);
}
