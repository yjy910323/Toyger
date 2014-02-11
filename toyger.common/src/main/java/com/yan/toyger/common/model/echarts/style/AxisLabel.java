package com.yan.toyger.common.model.echarts.style;

import com.alibaba.fastjson.JSONObject;

public class AxisLabel {
	private Boolean show;
	private Integer interval;
	private Integer margin;
	private String formatter;
	private TextStyle textStyle;

	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public Boolean getShow() {
		return show;
	}

	public AxisLabel setShow(Boolean show) {
		this.show = show;
		return this;
	}

	public Integer getInterval() {
		return interval;
	}

	public AxisLabel setInterval(Integer interval) {
		this.interval = interval;
		return this;
	}

	public Integer getMargin() {
		return margin;
	}

	public AxisLabel setMargin(Integer margin) {
		this.margin = margin;
		return this;
	}

	public String getFormatter() {
		return formatter;
	}

	public AxisLabel setFormatter(String formatter) {
		this.formatter = formatter;
		return this;
	}

	public TextStyle getTextStyle() {
		return textStyle;
	}

	public AxisLabel setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
		return this;
	}

}
