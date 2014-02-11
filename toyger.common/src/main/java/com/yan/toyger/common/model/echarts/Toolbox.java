package com.yan.toyger.common.model.echarts;

import com.alibaba.fastjson.JSONObject;

public class Toolbox {
	private Boolean show;// 显示策略，可选为：true（显示） | false（隐藏）
	private String orient;// horizontal|vertical
	private String x;// center|left|right
	private String y;// top|botton|center
	private String backgroundColor;// 工具箱背景颜色，默认透明
	private String borderColor;// 工具箱边框颜色
	private Integer borderWidth;// 工具箱边框线宽，单位px，默认为0（无边框）
	private Integer padding;
	private Integer itemGap;// 各个item之间的间隔，单位px，默认为10，横向布局时为水平间隔，纵向布局时为纵向间隔
	private Integer itemSize;// 工具箱icon大小，单位（px）
	private String[] color; // 工具箱icon颜色序列，循环使用
	private Boolean showTitle;// 是否显示工具箱文字提示，默认启用
	private Feature feature;
	
	public String toString(){
		return JSONObject.toJSONString(this);
	}

	public Boolean getShow() {
		return show;
	}

	public Toolbox setShow(Boolean show) {
		this.show = show;
		return this;
	}

	public String getOrient() {
		return orient;
	}

	public Toolbox setOrient(String orient) {
		this.orient = orient;
		return this;
	}

	public String getX() {
		return x;
	}

	public Toolbox setX(String x) {
		this.x = x;
		return this;
	}

	public String getY() {
		return y;
	}

	public Toolbox setY(String y) {
		this.y = y;
		return this;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public Toolbox setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public Toolbox setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	public Integer getBorderWidth() {
		return borderWidth;
	}

	public Toolbox setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	public Integer getPadding() {
		return padding;
	}

	public Toolbox setPadding(Integer padding) {
		this.padding = padding;
		return this;
	}

	public Integer getItemGap() {
		return itemGap;
	}

	public Toolbox setItemGap(Integer itemGap) {
		this.itemGap = itemGap;
		return this;
	}

	public Integer getItemSize() {
		return itemSize;
	}

	public Toolbox setItemSize(Integer itemSize) {
		this.itemSize = itemSize;
		return this;
	}

	public String[] getColor() {
		return color;
	}

	public Toolbox setColor(String[] color) {
		this.color = color;
		return this;
	}

	public Boolean getShowTitle() {
		return showTitle;
	}

	public Toolbox setShowTitle(Boolean showTitle) {
		this.showTitle = showTitle;
		return this;
	}

	public Feature getFeature() {
		return feature;
	}

	public Toolbox setFeature(Feature feature) {
		this.feature = feature;
		return this;
	}
}
