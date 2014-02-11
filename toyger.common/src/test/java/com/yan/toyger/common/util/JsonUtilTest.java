package com.yan.toyger.common.util;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.yan.toyger.common.model.echarts.Legend;

public class JsonUtilTest {

	@Test
	public void listJson() {
		Legend l = new Legend();
		JSONObject j = JSONObject.parseObject(l.toString());
		System.out.println(j);
		JsonUtil.cutJsonForEmpaty(j);
		System.out.println(j);
	}
}
