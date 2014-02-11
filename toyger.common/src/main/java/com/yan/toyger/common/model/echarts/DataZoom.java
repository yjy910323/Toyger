package com.yan.toyger.common.model.echarts;

import com.alibaba.fastjson.JSONObject;

public class DataZoom {
	private Boolean show;// 是否显示，当show为true时则接管使用指定类目轴的全部系列数据，如不指定则接管全部直角坐标系数据。
	private String orient;// horizontal|vertical
	private Integer x;
	private Integer y;
	private Integer widht;
	private Integer height;
	private String backgroundColor;// 背景颜色
	private String dataBackgroundColor;// 数据缩略背景颜色
	private String fillerColor;// 选择区域填充颜色
	private String handleColor;// 控制手柄颜色
	private Integer start;
	private Integer end;
	private Boolean realtime;// 缩放变化是否实时显示，建议性能较低的浏览器或数据量巨大时不启动实时效果。
	private Boolean zoomLock;// 数据缩放锁，默认为false，当设置为true时选择区域不能伸缩，即(end - start)值保持不变，仅能做数据漫游。

	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public Boolean getShow() {
		return show;
	}

	public DataZoom setShow(Boolean show) {
		this.show = show;
		return this;
	}

	public String getOrient() {
		return orient;
	}

	public DataZoom setOrient(String orient) {
		this.orient = orient;
		return this;
	}

	public Integer getX() {
		return x;
	}

	public DataZoom setX(Integer x) {
		this.x = x;
		return this;
	}

	public Integer getY() {
		return y;
	}

	public DataZoom setY(Integer y) {
		this.y = y;
		return this;
	}

	public Integer getWidht() {
		return widht;
	}

	public DataZoom setWidht(Integer widht) {
		this.widht = widht;
		return this;
	}

	public Integer getHeight() {
		return height;
	}

	public DataZoom setHeight(Integer height) {
		this.height = height;
		return this;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public DataZoom setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	public String getDataBackgroundColor() {
		return dataBackgroundColor;
	}

	public DataZoom setDataBackgroundColor(String dataBackgroundColor) {
		this.dataBackgroundColor = dataBackgroundColor;
		return this;
	}

	public String getFillerColor() {
		return fillerColor;
	}

	public DataZoom setFillerColor(String fillerColor) {
		this.fillerColor = fillerColor;
		return this;
	}

	public String getHandleColor() {
		return handleColor;
	}

	public DataZoom setHandleColor(String handleColor) {
		this.handleColor = handleColor;
		return this;
	}

	public Integer getStart() {
		return start;
	}

	public DataZoom setStart(Integer start) {
		this.start = start;
		return this;
	}

	public Integer getEnd() {
		return end;
	}

	public DataZoom setEnd(Integer end) {
		this.end = end;
		return this;
	}

	public Boolean getRealtime() {
		return realtime;
	}

	public DataZoom setRealtime(Boolean realtime) {
		this.realtime = realtime;
		return this;
	}

	public Boolean getZoomLock() {
		return zoomLock;
	}

	public DataZoom setZoomLock(Boolean zoomLock) {
		this.zoomLock = zoomLock;
		return this;
	}

}
