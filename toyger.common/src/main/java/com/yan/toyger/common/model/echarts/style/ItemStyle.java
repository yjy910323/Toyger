package com.yan.toyger.common.model.echarts.style;

import com.alibaba.fastjson.JSONObject;

public class ItemStyle {
	private ItemObjectStyle normal;
	private ItemObjectStyle emphasis;
	
	public String toString(){
		return JSONObject.toJSONString(this);
	}

	public ItemObjectStyle getNormal() {
		return normal;
	}

	public ItemStyle setNormal(ItemObjectStyle normal) {
		this.normal = normal;
		return this;
	}

	public ItemObjectStyle getEmphasis() {
		return emphasis;
	}

	public ItemStyle setEmphasis(ItemObjectStyle emphasis) {
		this.emphasis = emphasis;
		return this;
	}
}