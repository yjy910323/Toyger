package com.yan.toyger.common.model.echarts.style;

import com.alibaba.fastjson.JSONObject;

public class AxisLineStyle {
	private Boolean show;
	private Integer length;// axisTick 独有
	private LineStyle lineStyle = null;

	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public Boolean getShow() {
		return show;
	}

	public AxisLineStyle setShow(Boolean show) {
		this.show = show;
		return this;
	}

	public Integer getLength() {
		return length;
	}

	public AxisLineStyle setLength(Integer length) {
		this.length = length;
		return this;
	}

	public LineStyle getLineStyle() {
		return lineStyle;
	}

	public AxisLineStyle setLineStyle(LineStyle lineStyle) {
		this.lineStyle = lineStyle;
		return this;
	}
}
