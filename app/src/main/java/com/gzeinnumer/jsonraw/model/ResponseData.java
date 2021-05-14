package com.gzeinnumer.jsonraw.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import com.gzeinnumer.jsonraw.utils.GblFunction;

public class ResponseData{

	@SerializedName("list")
	private List<ListItem> list;

	public List<ListItem> getList(){
		return list;
	}

	@Override
	public String toString() {
		return "ResponseData{" +
				"list=" + list +
				'}';
	}
}