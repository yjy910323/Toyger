package com.yan.toyger.common.model.echarts;

import com.alibaba.fastjson.JSONObject;
import com.yan.toyger.common.model.echarts.style.TextStyle;

public class Title {
	private String text;
	private String link;
	private String subtext;
	private String sublink;
	private String x;// center|left|right
	private String y; // top|botton|center
	private String textAlign;// null|left|right|center
	private String backgroundColor;// 默认值 rgba(0,0,0,0)
	private String borderColor;// 默认值 #ccc
	private Integer borderWidth;
	private Integer padding;
	private Integer itemGap;// 各个item之间的间隔，单位px，默认为10，横向布局时为水平间隔，纵向布局时为纵向间隔
	private TextStyle textStyle;
	private TextStyle subtextStyle;

	public String getText() {
		return text;
	}

	public Title setText(String text) {
		this.text = text;
		return this;
	}

	public String getLink() {
		return link;
	}

	public Title setLink(String link) {
		this.link = link;
		return this;
	}

	public String getSubtext() {
		return subtext;
	}

	public Title setSubtext(String subtext) {
		this.subtext = subtext;
		return this;
	}

	public String getSublink() {
		return sublink;
	}

	public Title setSublink(String sublink) {
		this.sublink = sublink;
		return this;
	}

	public String getX() {
		return x;
	}

	public Title setX(String x) {
		this.x = x;
		return this;
	}

	public String getY() {
		return y;
	}

	public Title setY(String y) {
		this.y = y;
		return this;
	}

	public String getTextAlign() {
		return textAlign;
	}

	public Title setTextAlign(String textAlign) {
		this.textAlign = textAlign;
		return this;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public Title setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public Title setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	public Integer getBorderWidth() {
		return borderWidth;
	}

	public Title setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	public Integer getPadding() {
		return padding;
	}

	public Title setPadding(Integer padding) {
		this.padding = padding;
		return this;
	}

	public Integer getItemGap() {
		return itemGap;
	}

	public Title setItemGap(Integer itemGap) {
		this.itemGap = itemGap;
		return this;
	}

	public TextStyle getTextStyle() {
		return textStyle;
	}

	public Title setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
		return this;
	}

	public TextStyle getSubtextStyle() {
		return subtextStyle;
	}

	public Title setSubtextStyle(TextStyle subtextStyle) {
		this.subtextStyle = subtextStyle;
		return this;
	}

	public String toString() {
		return JSONObject.toJSONString(this);
	}
}
