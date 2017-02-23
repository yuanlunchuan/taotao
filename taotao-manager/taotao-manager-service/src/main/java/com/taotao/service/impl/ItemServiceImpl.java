package com.taotao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

@Service(value = "itemService")
public class ItemServiceImpl implements ItemService {
	//@Autowired
	//private TbItemMapper itemMapper;

	public TbItem getItemById(Long itemId) {
		return new TbItem();
		//return itemMapper.selectByPrimaryKey(itemId);
	}
}
