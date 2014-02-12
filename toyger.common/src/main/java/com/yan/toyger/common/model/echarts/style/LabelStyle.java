package com.yan.toyger.common.model.echarts.style;

import com.alibaba.fastjson.JSONObject;

public class LabelStyle {
	private Boolean show;
	private String position;
	private String formatter;
	private TextStyle textStyle;
	
	public String toString(){
		return JSONObject.toJSONString(this);
	}

	public String getPosition() {
		return position;
	}

	public LabelStyle setPosition(String position) {
		this.position = position;
		return this;
	}

	public Boolean getShow() {
		return show;
	}

	public LabelStyle setShow(Boolean show) {
		this.show = show;
		return this;
	}

	public String getFormatter() {
		return formatter;
	}

	public LabelStyle setFormatter(String formatter) {
		this.formatter = formatter;
		return this;
	}

	public TextStyle getTextStyle() {
		return textStyle;
	}

	public LabelStyle setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
		return this;
	}
}
