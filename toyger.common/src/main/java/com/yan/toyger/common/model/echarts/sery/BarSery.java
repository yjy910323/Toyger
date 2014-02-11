package com.yan.toyger.common.model.echarts.sery;

import com.alibaba.fastjson.JSONObject;
import com.yan.toyger.common.model.echarts.sery.data.BarData;

public class BarSery extends Sery<BarData, BarSery> {
	private String stack;
	private Integer xAxisIndex;
	private Integer yAxisIndex;
	private Integer symbolSize;
	private String barGap;// 默认值 '30%'
	private String barCategoryGap;// 类目间柱形距离，默认为类目间距的20%，可设固定值
	private Integer barMinHeight;// 柱条最小高度，可用于防止某item的值过小而影响交互
	private Integer barWidth;// 柱条宽度，不设时自适应

	public String toString() {
		return JSONObject.toJSONString(this);
	}
	
	public BarSery(){
		super.setType("bar");
	}

	public String getStack() {
		return stack;
	}

	public BarSery setStack(String stack) {
		this.stack = stack;
		return this;
	}

	public Integer getxAxisIndex() {
		return xAxisIndex;
	}

	public BarSery setxAxisIndex(Integer xAxisIndex) {
		this.xAxisIndex = xAxisIndex;
		return this;
	}

	public Integer getyAxisIndex() {
		return yAxisIndex;
	}

	public BarSery setyAxisIndex(Integer yAxisIndex) {
		this.yAxisIndex = yAxisIndex;
		return this;
	}

	public String getBarGap() {
		return barGap;
	}

	public BarSery setBarGap(String barGap) {
		this.barGap = barGap;
		return this;
	}

	public String getBarCategoryGap() {
		return barCategoryGap;
	}

	public BarSery setBarCategoryGap(String barCategoryGap) {
		this.barCategoryGap = barCategoryGap;
		return this;
	}

	public Integer getBarMinHeight() {
		return barMinHeight;
	}

	public BarSery setBarMinHeight(Integer barMinHeight) {
		this.barMinHeight = barMinHeight;
		return this;
	}

	public Integer getBarWidth() {
		return barWidth;
	}

	public BarSery setBarWidth(Integer barWidth) {
		this.barWidth = barWidth;
		return this;
	}

	public Integer getSymbolSize() {
		return symbolSize;
	}

	public BarSery setSymbolSize(Integer symbolSize) {
		this.symbolSize = symbolSize;
		return this;
	}
}
