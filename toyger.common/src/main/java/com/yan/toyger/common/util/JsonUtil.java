package com.yan.toyger.common.util;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class JsonUtil {
	public static final Integer _INTEGER_DEFALUT_VALUE = null;
	public static final String _STRING_DEFALUT_VALUE = null;
	public static final String[] _STRINGL_DEFALUT_VALUE = null;
	public static final Boolean _BOOLEAN_DEFALUT_VALUE = null;
	public static final Integer[] _INTEGERL_DEFALUT_VALUE = null;

	/**
	 * 将json中 遍历除Array外全部数值 1.int字段类型变量的值为_INTEGER_DEFALUT_VALUE删除
	 * 2.String字段类型变量的为null或""删除
	 * 
	 * @param json
	 */
	public static JSONObject cutJsonForEmpaty(JSONObject json) {
		List<String> cutKeys = new ArrayList<String>();
		for (String key : json.keySet()) {
			// 值为JSONObject 迭代调用被方法
			if (json.get(key) instanceof JSONObject) {
				// 迭代循环调用
				cutJsonForEmpaty(json.getJSONObject(key));
				if (json.getJSONObject(key).isEmpty()) {
					cutKeys.add(key);
				}
			}

			// 删除_INTEGER_DEFALUT_VALUE
			if (json.get(key) instanceof Integer) {
				if ((Integer) json.get(key) == _INTEGER_DEFALUT_VALUE) {
					cutKeys.add(key);
				}
			}

			// 删除String null或""
			if (json.get(key) instanceof String) {
				if ((String) json.get(key) == null || "".equals((String) json.get(key))) {
					cutKeys.add(key);
				}
			}
			
			// 删除String[] null
			if (json.get(key) instanceof String[]) {
				if ((String[]) json.get(key) == null) {
					cutKeys.add(key);
				}
			}
			
			if (json.get(key) instanceof Boolean) {
				if ((Boolean) json.get(key) == null) {
					cutKeys.add(key);
				}
			}
			
			
		}

		// 删除字段
		for (String cutKey : cutKeys) {
			json.remove(cutKey);
		}

		// 清空
		cutKeys.clear();
		
		return json;
	}
}
