package com.yan.toyger.common.model.echarts;

import com.alibaba.fastjson.JSONObject;

public class Feature {
	private Boolean mark ;// 辅助线标志
	private Boolean dataView ;// 数据视图
	private String[] magicType = new String[] { "line", "bar" };// 图表类型切换，当前仅支持直角系下的折线图、柱状图转换
	private Boolean saveAsImage ;// 保存图片
	private Boolean restore;

	public Boolean getMark() {
		return mark;
	}

	public Feature setMark(Boolean mark) {
		this.mark = mark;
		return this;
	}

	public Boolean getDataView() {
		return dataView;
	}

	public Feature setDataView(Boolean dataView) {
		this.dataView = dataView;
		return this;
	}

	public String[] getMagicType() {
		return magicType;
	}

	public Feature setMagicType(String[] magicType) {
		this.magicType = magicType;
		return this;
	}

	public Boolean getSaveAsImage() {
		return saveAsImage;
	}

	public Feature setSaveAsImage(Boolean saveAsImage) {
		this.saveAsImage = saveAsImage;
		return this;
	}

	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public Boolean getRestore() {
		return restore;
	}

	public Feature setRestore(Boolean restore) {
		this.restore = restore;
		return this;
	}
}
