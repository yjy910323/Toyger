package com.yan.toyger.common.model.echarts.style;

import com.alibaba.fastjson.JSONObject;

public class AreaStyle {
	private String color;// 颜色
	private String type;// 填充样式，目前仅支持'default'(实填充)
	
	public String toString(){
		return JSONObject.toJSONString(this);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
