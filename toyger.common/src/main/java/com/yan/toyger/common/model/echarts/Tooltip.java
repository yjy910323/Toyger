package com.yan.toyger.common.model.echarts;

import com.alibaba.fastjson.JSONObject;
import com.yan.toyger.common.model.echarts.style.TextStyle;

public class Tooltip {
	private Boolean show;// 显示策略
	private Boolean showContent;
	private String trigger;// 触发类型，默认数据触发，可选为：'item' | 'axis'
	private String formatter;
	private String islandFormatter;
	private Integer showDelay;// 显示延迟，添加显示延迟可以避免频繁切换，单位ms
	private Integer hideDelay;// 隐藏延迟，单位ms
	private Double transitionDuration;// 动画变换时长，单位s
	private String backgroundColor;// 提示背景颜色，默认为透明度为0.7的黑色
	private String borderColor;
	private Integer borderRadius;
	private Integer borderWidth;
	private Integer padding;
	private TextStyle textStyle;

	public Boolean getShow() {
		return show;
	}

	public Tooltip setShow(Boolean show) {
		this.show = show;
		return this;
	}

	public Boolean getShowContent() {
		return showContent;
	}

	public Tooltip setShowContent(Boolean showContent) {
		this.showContent = showContent;
		return this;
	}

	public String getTrigger() {
		return trigger;
	}

	public Tooltip setTrigger(String trigger) {
		this.trigger = trigger;
		return this;
	}

	public String getFormatter() {
		return formatter;
	}

	public Tooltip setFormatter(String formatter) {
		this.formatter = formatter;
		return this;
	}

	public String getIslandFormatter() {
		return islandFormatter;
	}

	public Tooltip setIslandFormatter(String islandFormatter) {
		this.islandFormatter = islandFormatter;
		return this;
	}

	public Integer getShowDelay() {
		return showDelay;
	}

	public Tooltip setShowDelay(Integer showDelay) {
		this.showDelay = showDelay;
		return this;
	}

	public Integer getHideDelay() {
		return hideDelay;
	}

	public Tooltip setHideDelay(Integer hideDelay) {
		this.hideDelay = hideDelay;
		return this;
	}

	public Double getTransitionDuration() {
		return transitionDuration;
	}

	public Tooltip setTransitionDuration(Double transitionDuration) {
		this.transitionDuration = transitionDuration;
		return this;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public Tooltip setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public Tooltip setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	public Integer getBorderRadius() {
		return borderRadius;
	}

	public Tooltip setBorderRadius(Integer borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	public Integer getBorderWidth() {
		return borderWidth;
	}

	public Tooltip setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	public Integer getPadding() {
		return padding;
	}

	public Tooltip setPadding(Integer padding) {
		this.padding = padding;
		return this;
	}

	public TextStyle getTextStyle() {
		return textStyle;
	}

	public Tooltip setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
		return this;
	}
	
	public String toString(){
		return JSONObject.toJSONString(this);
	}
}
