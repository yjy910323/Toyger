package com.yan.toyger.common.model.echarts;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.yan.toyger.common.model.echarts.style.AxisLabel;
import com.yan.toyger.common.model.echarts.style.AxisLineStyle;
import com.yan.toyger.common.model.echarts.style.AxisSplitAreaStyle;
import com.yan.toyger.common.model.echarts.style.TextStyle;

public class Axis {
	private String type;// 坐标轴类型，横轴默认为类目型'category'，纵轴默认为数值型'value'
	private String position;// 坐标轴类型，横轴默认为类目型'bottom'，纵轴默认为数值型'left'，可选为：'bottom' | 'top' | 'left' | 'right'
	private String name;// 坐标轴名称，默认为空
	private String nameLocation;// 坐标轴名称位置，默认为'end'，可选为：'start' | 'end'
	private TextStyle nameTextStyle;
	private Boolean boundaryGap;// 类目起始和结束两端空白策略，默认为true流控，false则顶头
	private Integer min;// 指定的最小值，eg: 0，默认无，会自动根据具体数值调整，指定后将忽略boundaryGap[0]
	private Integer max;// 指定的最大值，eg: 100，默认无，会自动根据具体数值调整，指定后将忽略boundaryGap[1]
	private Boolean scale;// 脱离0值比例，放大聚焦到最终_min，_max区间
	private Integer precision;// 小数精度，默认为0，无小数点
	private Integer power;// 整数精度，默认为100，个位和百位为0
	private Integer splitNumber;// 分割段数，默认为5
	private AxisLineStyle axisLine;// 坐标轴线，默认显示，属性show控制显示与否
	private AxisLineStyle axisTick;// 坐标轴小标记，默认不显示
	private AxisLabel axisLabel;// 坐标轴文本标签
	private AxisLineStyle splitLine;// 分隔线，默认显示，属性show控制显示与否
	private AxisSplitAreaStyle splitArea;// 分隔区域，默认不显示，属性show控制显示与否
	private List<String> data;// 类目列表，同时也是label内容

	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public String getType() {
		return type;
	}

	public Axis setType(String type) {
		this.type = type;
		return this;
	}

	public String getPosition() {
		return position;
	}

	public Axis setPosition(String position) {
		this.position = position;
		return this;
	}

	public String getName() {
		return name;
	}

	public Axis setName(String name) {
		this.name = name;
		return this;
	}

	public String getNameLocation() {
		return nameLocation;
	}

	public Axis setNameLocation(String nameLocation) {
		this.nameLocation = nameLocation;
		return this;
	}

	public TextStyle getNameTextStyle() {
		return nameTextStyle;
	}

	public Axis setNameTextStyle(TextStyle nameTextStyle) {
		this.nameTextStyle = nameTextStyle;
		return this;
	}

	public Boolean getBoundaryGap() {
		return boundaryGap;
	}

	public Axis setBoundaryGap(Boolean boundaryGap) {
		this.boundaryGap = boundaryGap;
		return this;
	}

	public Integer getMin() {
		return min;
	}

	public Axis setMin(Integer min) {
		this.min = min;
		return this;
	}

	public Integer getMax() {
		return max;
	}

	public Axis setMax(Integer max) {
		this.max = max;
		return this;
	}

	public Boolean getScale() {
		return scale;
	}

	public Axis setScale(Boolean scale) {
		this.scale = scale;
		return this;
	}

	public Integer getPrecision() {
		return precision;
	}

	public Axis setPrecision(Integer precision) {
		this.precision = precision;
		return this;
	}

	public Integer getPower() {
		return power;
	}

	public Axis setPower(Integer power) {
		this.power = power;
		return this;
	}

	public Integer getSplitNumber() {
		return splitNumber;
	}

	public Axis setSplitNumber(Integer splitNumber) {
		this.splitNumber = splitNumber;
		return this;
	}

	public AxisLineStyle getAxisLine() {
		return axisLine;
	}

	public Axis setAxisLine(AxisLineStyle axisLine) {
		this.axisLine = axisLine;
		return this;
	}

	public AxisLineStyle getAxisTick() {
		return axisTick;
	}

	public Axis setAxisTick(AxisLineStyle axisTick) {
		this.axisTick = axisTick;
		return this;
	}

	public AxisLabel getAxisLabel() {
		return axisLabel;
	}

	public Axis setAxisLabel(AxisLabel axisLabel) {
		this.axisLabel = axisLabel;
		return this;
	}

	public AxisLineStyle getSplitLine() {
		return splitLine;
	}

	public Axis setSplitLine(AxisLineStyle splitLine) {
		this.splitLine = splitLine;
		return this;
	}

	public AxisSplitAreaStyle getSplitArea() {
		return splitArea;
	}

	public Axis setSplitArea(AxisSplitAreaStyle splitArea) {
		this.splitArea = splitArea;
		return this;
	}

	public List<String> getData() {
		return data;
	}

	public Axis setData(List<String> data) {
		this.data = data;
		return this;
	}

	public Axis setDatas(String... data) {
		if (this.data == null) {
			this.data = new ArrayList<String>();
		}
		for (String oneData : data) {
			this.data.add(oneData);
		}
		return this;
	}
	
}
