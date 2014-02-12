package com.yan.toyger.common.model.echarts.style;

import com.alibaba.fastjson.JSONObject;

public class LabelLineStyle {
	private Boolean show;
	private Integer length;
	private LineStyle lineStyle;
	
	public String toString(){
		return JSONObject.toJSONString(this);
	}

	public Boolean getShow() {
		return show;
	}

	public LabelLineStyle setShow(Boolean show) {
		this.show = show;
		return this;
	}

	public Integer getLength() {
		return length;
	}

	public LabelLineStyle setLength(Integer length) {
		this.length = length;
		return this;
	}

	public LineStyle getLineStyle() {
		return lineStyle;
	}

	public LabelLineStyle setLineStyle(LineStyle lineStyle) {
		this.lineStyle = lineStyle;
		return this;
	}
}
