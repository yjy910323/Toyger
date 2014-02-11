package com.yan.toyger.common.model.echarts;

import com.alibaba.fastjson.JSONObject;
import com.yan.toyger.common.model.echarts.style.AxisLabel;

public class IndicatorValue {
	private String name;
	private Integer min;
	private Integer max;
	private AxisLabel axisLabel;

	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public String getName() {
		return name;
	}

	public IndicatorValue setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getMin() {
		return min;
	}

	public IndicatorValue setMin(Integer min) {
		this.min = min;
		return this;
	}

	public Integer getMax() {
		return max;
	}

	public IndicatorValue setMax(Integer max) {
		this.max = max;
		return this;
	}

	public AxisLabel getAxisLabel() {
		return axisLabel;
	}

	public IndicatorValue setAxisLabel(AxisLabel axisLabel) {
		this.axisLabel = axisLabel;
		return this;
	}
}
