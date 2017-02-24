package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "/{itemId}", method = RequestMethod.GET)
	@ResponseBody
	public TbItem getTbItemById(@PathVariable(value = "itemId") Long itemId) {
		return itemService.getItemById(itemId);
	}

	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult getItemList(@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "30") Integer rows) {
		// 调用service查询商品列表
		EasyUIDataGridResult result = itemService.getItemList(page, rows);
		// 返回结果
		return result;
	}

	@RequestMapping(value = "users", method = RequestMethod.GET)
	@ResponseBody
	public TbItem getAllTbItem() {
		return new TbItem();
	}
}
