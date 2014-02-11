package com.yan.toyger.common.model.echarts.sery;

import com.alibaba.fastjson.JSONObject;
import com.yan.toyger.common.model.echarts.sery.data.PieData;

public class PieSery extends Sery<PieData, PieSery> {
	private String[] center;// 圆心坐标，支持绝对值（px）和百分比，百分比计算min(width, height) * 50% 
	private Integer radius;
	private Integer startAngle;
	private Integer minAngle;
	private String roseType;// 南丁格尔玫瑰图模式，'radius'（半径） | 'area'（面积）
	private Integer selectedOffset;// 选中是扇区偏移量 
	private String selectedMode;// 选中模式，默认关闭，可选single，multiple 
	
	public String toString(){
		return JSONObject.toJSONString(this);
	}
	
	public PieSery(){
		super.setType("pie");
	}

	public String[] getCenter() {
		return center;
	}

	public PieSery setCenter(String[] center) {
		this.center = center;
		return this;
	}

	public Integer getRadius() {
		return radius;
	}

	public PieSery setRadius(Integer radius) {
		this.radius = radius;
		return this;
	}

	public Integer getStartAngle() {
		return startAngle;
	}

	public PieSery setStartAngle(Integer startAngle) {
		this.startAngle = startAngle;
		return this;
	}

	public Integer getMinAngle() {
		return minAngle;
	}

	public PieSery setMinAngle(Integer minAngle) {
		this.minAngle = minAngle;
		return this;
	}

	public String getRoseType() {
		return roseType;
	}

	public PieSery setRoseType(String roseType) {
		this.roseType = roseType;
		return this;
	}

	public Integer getSelectedOffset() {
		return selectedOffset;
	}

	public PieSery setSelectedOffset(Integer selectedOffset) {
		this.selectedOffset = selectedOffset;
		return this;
	}

	public String getSelectedMode() {
		return selectedMode;
	}

	public PieSery setSelectedMode(String selectedMode) {
		this.selectedMode = selectedMode;
		return this;
	}

}
