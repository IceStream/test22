package com.wangyangyangtest.entity;

import java.util.List;

public class ShopListEntity {
	/*{
	    "data": [
	        {
	            "goods_id": "1",
	            "goods_sn": "ECS000000",
	            "goods_name": "KD876",
	            "goods_thumb": "images/200905/thumb_img/1_thumb_G_1240902890710.jpg",
	            "goods_img": "images/200905/goods_img/1_G_1240902890755.jpg",
	            "market_price": "1665.60",
	            "shop_price": "1388.00"
	        },*/
	private List<ShopEntity> data;

	public List<ShopEntity> getData() {
		return data;
	}

	public void setData(List<ShopEntity> data) {
		this.data = data;
	}
	
}
