package com.manager.service;

import com.manager.common.pojo.EasyUIDataGridResult;
import com.manager.common.utils.E3Result;
import com.manager.pojo.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);
	EasyUIDataGridResult getItemList(int page, int rows);
	E3Result addItem(TbItem item, String desc);
}
	