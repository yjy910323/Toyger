package com.yan.toyger.common.model.echarts.style;

import com.alibaba.fastjson.JSONObject;

public class PolarNameStyle {
	private Boolean show;
	private String formatter;
	private TextStyle textStyle;

	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public Boolean getShow() {
		return show;
	}

	public PolarNameStyle setShow(Boolean show) {
		this.show = show;
		return this;
	}

	public String getFormatter() {
		return formatter;
	}

	public PolarNameStyle setFormatter(String formatter) {
		this.formatter = formatter;
		return this;
	}

	public TextStyle getTextStyle() {
		return textStyle;
	}

	public PolarNameStyle setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
		return this;
	}
}
