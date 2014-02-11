package com.yan.toyger.common.model.echarts;

import com.alibaba.fastjson.JSONObject;

public class MarkPointData {
	private String name;
	private Integer value;
	private Integer x;
	private Integer y;
	private Integer xAxis;
	private Integer yAxis;
	
	public String toString(){
		return JSONObject.toJSONString(this);
	}
	
	public String getName() {
		return name;
	}
	public MarkPointData setName(String name) {
		this.name = name;
		return this;
	}
	public Integer getValue() {
		return value;
	}
	public MarkPointData setValue(Integer value) {
		this.value = value;
		return this;
	}
	public Integer getX() {
		return x;
	}
	public MarkPointData setX(Integer x) {
		this.x = x;
		return this;
	}
	public Integer getY() {
		return y;
	}
	public MarkPointData setY(Integer y) {
		this.y = y;
		return this;
	}

	public Integer getXAxis() {
		return xAxis;
	}

	public MarkPointData setXAxis(Integer xAxis) {
		this.xAxis = xAxis;
		return this;
	}

	public Integer getYAxis() {
		return yAxis;
	}

	public MarkPointData setYAxis(Integer yAxis) {
		this.yAxis = yAxis;
		return this;
	}
}
