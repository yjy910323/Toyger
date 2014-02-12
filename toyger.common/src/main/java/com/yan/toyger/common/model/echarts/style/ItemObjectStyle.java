package com.yan.toyger.common.model.echarts.style;

import com.alibaba.fastjson.JSONObject;

public class ItemObjectStyle {
	private String color;
	private LineStyle lineStyle;// 折线图，K线图 ，地图，markLine
	private AreaStyle areaStyle;// 堆积折线图，地图
	private ChordStyle chordStyle;// 和弦图
	private String borderColor;// 柱形图，折线图（symbol），散点图（symbole），markPoint
	private Integer borderRadius;// 柱形图
	private Integer borderWidth;// 柱形图，折线图（symbol），散点图（symbole），markPoint
	private LabelStyle label;// 折线图，柱形图，K线图，散点图，饼图 ，地图，力导向，markPoint，markLine
	private LabelLineStyle labelLine;// 饼图

	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public String getColor() {
		return color;
	}

	public ItemObjectStyle setColor(String color) {
		this.color = color;
		return this;
	}

	public LineStyle getLineStyle() {
		return lineStyle;
	}

	public ItemObjectStyle setLineStyle(LineStyle lineStyle) {
		this.lineStyle = lineStyle;
		return this;
	}

	public AreaStyle getAreaStyle() {
		return areaStyle;
	}

	public ItemObjectStyle setAreaStyle(AreaStyle areaStyle) {
		this.areaStyle = areaStyle;
		return this;
	}

	public ChordStyle getChordStyle() {
		return chordStyle;
	}

	public ItemObjectStyle setChordStyle(ChordStyle chordStyle) {
		this.chordStyle = chordStyle;
		return this;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public ItemObjectStyle setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	public Integer getBorderRadius() {
		return borderRadius;
	}

	public ItemObjectStyle setBorderRadius(Integer borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	public Integer getBorderWidth() {
		return borderWidth;
	}

	public ItemObjectStyle setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	public LabelStyle getLabel() {
		return label;
	}

	public ItemObjectStyle setLabel(LabelStyle label) {
		this.label = label;
		return this;
	}

	public LabelLineStyle getLabelLine() {
		return labelLine;
	}

	public ItemObjectStyle setLabelLine(LabelLineStyle labelLine) {
		this.labelLine = labelLine;
		return this;
	}

}
