package com.yan.toyger.common.model.echarts;

import com.alibaba.fastjson.JSONObject;
import com.yan.toyger.common.model.echarts.style.TextStyle;

public class DataRange {
	private String orient;// horizontal|vertical
	private String x;// center|left|right
	private String y;// top|botton|center
	private String backgroundColor;// 默认值 rgba(0,0,0,0)
	private String borderColor;// 默认值 #ccc
	private Integer borderWidth;// 默认值 0
	private Integer padding;
	private Integer itemGap;// 各个item之间的间隔，单位px，默认为10，横向布局时为水平间隔，纵向布局时为纵向间隔
	private Integer min;// 指定的最小值，eg: 0，默认无，必须参数
	private Integer max;// 指定的最大值，eg: 100，默认无，必须参数
	private Integer precision;// 小数精度，默认为0，无小数点
	private Integer splitNumber;// 分割段数，默认为5，为0时为线性渐变
	private Boolean calculable;// 是否启用值域漫游，启用后无视splitNumber，值域显示为线性渐变
	private Boolean realtime;// 值域漫游是否实时显示
	private String[] color;
	private String[] text;
	private TextStyle textStyle;
	
	public DataRange(Integer min,Integer max){
		this.min = min;
		this.max = max;
	}

	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public String getOrient() {
		return orient;
	}

	public DataRange setOrient(String orient) {
		this.orient = orient;
		return this;
	}

	public String getX() {
		return x;
	}

	public DataRange setX(String x) {
		this.x = x;
		return this;
	}

	public String getY() {
		return y;
	}

	public DataRange setY(String y) {
		this.y = y;
		return this;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public DataRange setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public DataRange setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	public Integer getBorderWidth() {
		return borderWidth;
	}

	public DataRange setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	public Integer getPadding() {
		return padding;
	}

	public DataRange setPadding(Integer padding) {
		this.padding = padding;
		return this;
	}

	public Integer getItemGap() {
		return itemGap;
	}

	public DataRange setItemGap(Integer itemGap) {
		this.itemGap = itemGap;
		return this;
	}

	public Integer getMin() {
		return min;
	}

	public DataRange setMin(Integer min) {
		this.min = min;
		return this;
	}

	public Integer getMax() {
		return max;
	}

	public DataRange setMax(Integer max) {
		this.max = max;
		return this;
	}

	public Integer getPrecision() {
		return precision;
	}

	public DataRange setPrecision(Integer precision) {
		this.precision = precision;
		return this;
	}

	public Integer getSplitNumber() {
		return splitNumber;
	}

	public DataRange setSplitNumber(Integer splitNumber) {
		this.splitNumber = splitNumber;
		return this;
	}

	public Boolean getCalculable() {
		return calculable;
	}

	public DataRange setCalculable(Boolean calculable) {
		this.calculable = calculable;
		return this;
	}

	public Boolean getRealtime() {
		return realtime;
	}

	public DataRange setRealtime(Boolean realtime) {
		this.realtime = realtime;
		return this;
	}

	public String[] getColor() {
		return color;
	}

	public DataRange setColor(String[] color) {
		this.color = color;
		return this;
	}

	public String[] getText() {
		return text;
	}

	public DataRange setText(String[] text) {
		this.text = text;
		return this;
	}

	public TextStyle getTextStyle() {
		return textStyle;
	}

	public DataRange setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
		return this;
	}

}
