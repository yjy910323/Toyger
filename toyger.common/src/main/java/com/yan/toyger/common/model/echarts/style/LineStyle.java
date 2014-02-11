package com.yan.toyger.common.model.echarts.style;

import com.alibaba.fastjson.JSONObject;

public class LineStyle {
	private String color;// 颜色
	private String type;// 线条样式，可选为：'solid' | 'dotted' | 'dashed'
	private Integer width;// 线宽
	private String shadowColor;// 折线主线(IE8+)有效，阴影色彩，支持rgba
	private Integer shadowBlur;// 折线主线(IE8+)有效，阴影模糊度，大于0有效
	private Integer shadowOffsetX;// 折线主线(IE8+)有效，阴影横向偏移，正值往右，负值往左
	private Integer shadowOffsetY;// 折线主线(IE8+)有效，阴影纵向偏移，正值往下，负值往上

	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public String getColor() {
		return color;
	}

	public LineStyle setColor(String color) {
		this.color = color;
		return this;
	}

	public String getType() {
		return type;
	}

	public LineStyle setType(String type) {
		this.type = type;
		return this;
	}

	public Integer getWidth() {
		return width;
	}

	public LineStyle setWidth(Integer width) {
		this.width = width;
		return this;
	}

	public String getShadowColor() {
		return shadowColor;
	}

	public LineStyle setShadowColor(String shadowColor) {
		this.shadowColor = shadowColor;
		return this;
	}

	public Integer getShadowBlur() {
		return shadowBlur;
	}

	public LineStyle setShadowBlur(Integer shadowBlur) {
		this.shadowBlur = shadowBlur;
		return this;
	}

	public Integer getShadowOffsetX() {
		return shadowOffsetX;
	}

	public LineStyle setShadowOffsetX(Integer shadowOffsetX) {
		this.shadowOffsetX = shadowOffsetX;
		return this;
	}

	public Integer getShadowOffsetY() {
		return shadowOffsetY;
	}

	public LineStyle setShadowOffsetY(Integer shadowOffsetY) {
		this.shadowOffsetY = shadowOffsetY;
		return this;
	}
}
