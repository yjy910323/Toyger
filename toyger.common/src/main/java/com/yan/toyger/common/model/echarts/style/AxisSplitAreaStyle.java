package com.yan.toyger.common.model.echarts.style;

import com.alibaba.fastjson.JSONObject;

public class AxisSplitAreaStyle {
	private Boolean show;
	private Boolean onGap;
	private AreaStyle areaStyle = null;

	public Boolean getShow() {
		return show;
	}

	public AxisSplitAreaStyle setShow(Boolean show) {
		this.show = show;
		return this;
	}

	public Boolean getOnGap() {
		return onGap;
	}

	public AxisSplitAreaStyle setOnGap(Boolean onGap) {
		this.onGap = onGap;
		return this;
	}

	public AreaStyle getAreaStyle() {
		return areaStyle;
	}

	public AxisSplitAreaStyle setAreaStyle(AreaStyle areaStyle) {
		this.areaStyle = areaStyle;
		return this;
	}

	public String toString() {
		return JSONObject.toJSONString(this);
	}
}
