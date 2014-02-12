package com.yan.toyger.common.model.echarts.style;

import com.alibaba.fastjson.JSONObject;

public class LabelStyle {
	private Boolean show;
	private String position;//标签显示位置，地图标签不可指定位置 饼图可选为：'outer'（外部） | 'inner'（内部），折线图，柱形图，K线图，散点图默认根据布局自适应为'top'或者'right'，可选的还有：'inside'|'left'|'bottom' 
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
