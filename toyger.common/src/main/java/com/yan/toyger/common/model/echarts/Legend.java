package com.yan.toyger.common.model.echarts;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.yan.toyger.common.model.echarts.style.TextStyle;

public class Legend {
	private String orient;// horizontal|vertical
	private String x;// center|left|right
	private String y;// top|botton|center
	private String backgroundColor;// 默认值 rgba(0,0,0,0)
	private String borderColor;// 默认值 #ccc
	private Integer borderWidth;// 默认值 0
	private Integer padding;
	private Integer itemGap;// 各个item之间的间隔，单位px，默认为10，横向布局时为水平间隔，纵向布局时为纵向间隔
	private TextStyle textStyle = null;
	private Boolean selectedMode;// 选择模式，默认开启图例开关
	private List<String> data;

	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public String getOrient() {
		return orient;
	}

	public Legend setOrient(String orient) {
		this.orient = orient;
		return this;
	}

	public String getX() {
		return x;
	}

	public Legend setX(String x) {
		this.x = x;
		return this;
	}

	public String getY() {
		return y;
	}

	public Legend setY(String y) {
		this.y = y;
		return this;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public Legend setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public Legend setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	public Integer getBorderWidth() {
		return borderWidth;
	}

	public Legend setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	public Integer getPadding() {
		return padding;
	}

	public Legend setPadding(Integer padding) {
		this.padding = padding;
		return this;
	}

	public Integer getItemGap() {
		return itemGap;
	}

	public Legend setItemGap(Integer itemGap) {
		this.itemGap = itemGap;
		return this;
	}

	public TextStyle getTextStyle() {
		return textStyle;
	}

	public Legend setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
		return this;
	}

	public Boolean getSelectedMode() {
		return selectedMode;
	}

	public Legend setSelectedMode(Boolean selectedMode) {
		this.selectedMode = selectedMode;
		return this;
	}

	public List<String> getData() {
		return data;
	}

	public Legend setData(List<String> data) {
		this.data = data;
		return this;
	}
	
	public Legend setDatas(String... data){
		if(this.data == null){
			this.data = new ArrayList<String>();
		}
		for(String oneData : data){
			this.data.add(oneData);
		}
		return this;
	}
}
