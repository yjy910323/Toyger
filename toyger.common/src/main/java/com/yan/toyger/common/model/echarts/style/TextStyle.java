package com.yan.toyger.common.model.echarts.style;

import com.alibaba.fastjson.JSONObject;

public class TextStyle {
	private String color;// 颜色
	private String decoration;// 修饰，仅对tooltip.textStyle生效
	private String align;// 水平对齐方式，可选为：'left' | 'right' | 'center'
	private String baseline;// 垂直对齐方式，可选为：'top' | 'bottom' | 'middle'
	private String fontFamily;// 字体系列
	private Integer fontSize;// 字号 单位px
	private String fontStyle;// 样式，可选为：'normal' | 'italic' | 'oblique'
	private String fontWeight;// 粗细，可选为：'normal' | 'bold' | 'bolder' | 'lighter'

	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public String getColor() {
		return color;
	}

	public TextStyle setColor(String color) {
		this.color = color;
		return this;
	}

	public String getDecoration() {
		return decoration;
	}

	public TextStyle setDecoration(String decoration) {
		this.decoration = decoration;
		return this;
	}

	public String getAlign() {
		return align;
	}

	public TextStyle setAlign(String align) {
		this.align = align;
		return this;
	}

	public String getBaseline() {
		return baseline;
	}

	public TextStyle setBaseline(String baseline) {
		this.baseline = baseline;
		return this;
	}

	public String getFontFamily() {
		return fontFamily;
	}

	public TextStyle setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
		return this;
	}

	public Integer getFontSize() {
		return fontSize;
	}

	public TextStyle setFontSize(Integer fontSize) {
		this.fontSize = fontSize;
		return this;
	}

	public String getFontStyle() {
		return fontStyle;
	}

	public TextStyle setFontStyle(String fontStyle) {
		this.fontStyle = fontStyle;
		return this;
	}

	public String getFontWeight() {
		return fontWeight;
	}

	public TextStyle setFontWeight(String fontWeight) {
		this.fontWeight = fontWeight;
		return this;
	}

}
