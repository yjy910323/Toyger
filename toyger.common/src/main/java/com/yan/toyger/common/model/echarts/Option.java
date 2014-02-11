package com.yan.toyger.common.model.echarts;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.yan.toyger.common.model.echarts.sery.Sery;
import com.yan.toyger.common.util.JsonUtil;

public class Option<T extends Sery<?,?>> {
	private String[] color;// 数值系列的颜色列表，默认为null则采用内置颜色
	private Boolean calculable;// 是否可计算
	private Title title;// 标题（详见title），每个图表最多仅有一个标题控件
	private Legend legend;// 图例（详见legend），每个图表最多仅有一个图例，混搭图表共享
	private DataRange dataRange;// 值域选择（详见dataRange）,值域范围
	private Toolbox toolbox;// 工具箱（详见toolbox），每个图表最多仅有一个工具箱
	private Tooltip tooltip;// 提示框（详见tooltip），鼠标悬浮交互时的信息提示
	private DataZoom dataZoom;// 数据区域缩放（详见dataZoom）,数据展现范围选择
	private Axis xAxis;// 直角坐标系中横轴数组（详见xAxis），数组中每一项代表一条横轴坐标轴，标准（1.0）中规定最多同时存在2条横轴
	private Axis yAxis;// 直角坐标系中纵轴数组（详见yAxis），数组中每一项代表一条纵轴坐标轴，标准（1.0）中规定最多同时存在2条纵轴
	private List<T> series;// 驱动图表生成的数据内容（详见series），数组中每一项代表一个系列的特殊选项及数据

	public String toString() {
		return JSONObject.toJSONString(this);
	}
	
	public String buildOptionString(){
		return "option = "+JsonUtil.cutJsonForEmpaty(JSONObject.parseObject(JSONObject.toJSONString(this))).toJSONString()+";";
	}

	public String[] getColor() {
		return color;
	}

	public Option<T> setColor(String[] color) {
		this.color = color;
		return this;
	}

	public Title getTitle() {
		if(this.title == null){
			this.title = new Title();
		}
		return title;
	}

	public Option<T> setTitle(Title title) {
		this.title = title;
		return this;
	}

	public Legend getLegend() {
		if(this.legend == null){
			this.legend = new Legend();
		}
		return legend;
	}

	public Option<T> setLegend(Legend legend) {
		this.legend = legend;
		return this;
	}

	public DataRange getDataRange() {
		if(this.dataRange == null){
			this.dataRange = new DataRange(0,100);
		}
		return dataRange;
	}

	public Option<T> setDataRange(DataRange dataRange) {
		this.dataRange = dataRange;
		return this;
	}

	public Toolbox getToolbox() {
		if(this.toolbox == null){
			this.toolbox = new Toolbox();
		}
		return toolbox;
	}

	public Option<T> setToolbox(Toolbox toolbox) {
		this.toolbox = toolbox;
		return this;
	}

	public Tooltip getTooltip() {
		if(this.tooltip == null){
			this.tooltip = new Tooltip();
		}
		return tooltip;
	}

	public Option<T> setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
		return this;
	}

	public DataZoom getDataZoom() {
		if(this.dataZoom == null){
			this.dataZoom = new DataZoom();
		}
		return dataZoom;
	}

	public Option<T> setDataZoom(DataZoom dataZoom) {
		this.dataZoom = dataZoom;
		return this;
	}

	public List<T> getSeries() {
		if(this.series == null){
			this.series = new ArrayList<T>();
		}
		return series;
	}

	public Option<T> setSeries(List<T> series) {
		this.series = series;
		return this;
	}

	public Boolean getCalculable() {
		if(this.calculable == null){
			this.calculable = new Boolean(false);
		}
		return calculable;
	}

	public Option<T> setCalculable(Boolean calculable) {
		this.calculable = calculable;
		return this;
	}

	public Axis getXAxis() {
		if(this.xAxis == null){
			this.xAxis = new Axis();
		}
		return xAxis;
	}

	public Option<T> setXAxis(Axis xAxis) {
		this.xAxis = xAxis;
		return this;
	}

	public Axis getYAxis() {
		if(this.yAxis == null){
			this.yAxis = new Axis();
		}
		return yAxis;
	}

	public Option<T> setYAxis(Axis yAxis) {
		this.yAxis = yAxis;
		return this;
	}
	
	public Option<T> setSery(T... sery){
		if(this.series == null){
			this.series = new ArrayList<T>();
		}
		for(T oneSery : sery){
			this.series.add(oneSery);
		}
		return this;
	}

}
