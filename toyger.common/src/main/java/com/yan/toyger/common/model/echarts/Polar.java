package com.yan.toyger.common.model.echarts;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.yan.toyger.common.model.echarts.style.AxisLabel;
import com.yan.toyger.common.model.echarts.style.AxisLineStyle;
import com.yan.toyger.common.model.echarts.style.AxisSplitAreaStyle;
import com.yan.toyger.common.model.echarts.style.PolarNameStyle;

public class Polar {
	private String[] center;// 圆心坐标，支持绝对值（px）和百分比，百分比计算min(width,
	private Integer radius;// 半径，支持绝对值（px）和百分比，百分比计算min(width, height) / 2 * 75%,
	private Integer startAngle;// 开始角度，有效输入范围[-180,180]
	private Integer splitNumber;
	private PolarNameStyle name;// 坐标轴名称 eg: { show:true, formatter:null, textStyle:{color:#333} }
	private Integer[] boundaryGap;
	private Boolean scale;// 脱离0值比例，放大聚焦到最终_min，_max区间
	private Integer precision;// 小数精度，默认为0，无小数点
	private Integer power;// 整数精度，默认为100，个位和百位为0
	private AxisLineStyle axisLine;// 坐标轴线，默认显示，属性show控制显示与否
	private AxisLabel asixLabel;// 坐标轴文本标签
	private AxisLineStyle splitLine;// 分隔线，默认显示，属性show控制显示与否
	private AxisSplitAreaStyle splitArea;// 分隔区域，默认不显示，属性show控制显示与否
	private List<IndicatorValue> indicator;// 雷达指标列表，同时也是label内容

	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public String[] getCenter() {
		return center;
	}

	public Polar setCenter(String[] center) {
		this.center = center;
		return this;
	}

	public Integer getRadius() {
		return radius;
	}

	public Polar setRadius(Integer radius) {
		this.radius = radius;
		return this;
	}

	public Integer getStartAngle() {
		return startAngle;
	}

	public Polar setStartAngle(Integer startAngle) {
		this.startAngle = startAngle;
		return this;
	}

	public Integer getSplitNumber() {
		return splitNumber;
	}

	public Polar setSplitNumber(Integer splitNumber) {
		this.splitNumber = splitNumber;
		return this;
	}

	public PolarNameStyle getName() {
		return name;
	}

	public Polar setName(PolarNameStyle name) {
		this.name = name;
		return this;
	}

	public Integer[] getBoundaryGap() {
		return boundaryGap;
	}

	public Polar setBoundaryGap(Integer[] boundaryGap) {
		this.boundaryGap = boundaryGap;
		return this;
	}

	public Boolean getScale() {
		return scale;
	}

	public Polar setScale(Boolean scale) {
		this.scale = scale;
		return this;
	}

	public Integer getPrecision() {
		return precision;
	}

	public Polar setPrecision(Integer precision) {
		this.precision = precision;
		return this;
	}

	public Integer getPower() {
		return power;
	}

	public Polar setPower(Integer power) {
		this.power = power;
		return this;
	}

	public AxisLineStyle getAxisLine() {
		return axisLine;
	}

	public Polar setAxisLine(AxisLineStyle axisLine) {
		this.axisLine = axisLine;
		return this;
	}

	public AxisLabel getAsixLabel() {
		return asixLabel;
	}

	public Polar setAsixLabel(AxisLabel asixLabel) {
		this.asixLabel = asixLabel;
		return this;
	}

	public AxisLineStyle getSplitLine() {
		return splitLine;
	}

	public Polar setSplitLine(AxisLineStyle splitLine) {
		this.splitLine = splitLine;
		return this;
	}

	public AxisSplitAreaStyle getSplitArea() {
		return splitArea;
	}

	public Polar setSplitArea(AxisSplitAreaStyle splitArea) {
		this.splitArea = splitArea;
		return this;
	}

	public List<IndicatorValue> getIndicator() {
		return indicator;
	}

	public Polar setIndicator(List<IndicatorValue> indicator) {
		this.indicator = indicator;
		return this;
	}

}
