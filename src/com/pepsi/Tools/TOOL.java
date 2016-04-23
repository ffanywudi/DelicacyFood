package com.pepsi.Tools;

import java.util.List;

import com.alibaba.fastjson.JSONArray;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class TOOL {
	private static final String KEY = "MEISHI";
	private static final String UserKey = "userInfo";

	/**
	 * 去掉标题栏
	 * 
	 * @param activity
	 */

	public static void NoTitleBar(Activity activity) {
		activity.requestWindowFeature(Window.FEATURE_NO_TITLE);

	}

	/**
	 * 去掉状态栏
	 * 
	 * @param activity
	 */
	public static void NoStateBar(Activity activity) {
		activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
	}
	
/**
 * 数据存储
 * @param con
 * @param dataKey
 * @param str
 */
	public static void save(Context con, String dataKey, String str) {
		Log.i("xiaoqiang", str);
		SharedPreferences sp = con.getSharedPreferences(KEY, 0);
		SharedPreferences.Editor editor = sp.edit();
		editor.putString(dataKey, str);
		editor.commit();
	}
/**
 *	数据读取 
 * @param con
 * @param dataKey
 * @return
 */
	
	public static String read(Context con, String dataKey) {
		SharedPreferences sp = con.getSharedPreferences(KEY, 0);

		return sp.getString(dataKey, null);
	}
/**
 * 数据删除
 * 
 * @param con
 */
	public static void delete(Context con) {
		SharedPreferences sp = con.getSharedPreferences(KEY, 0);
		SharedPreferences.Editor editor = sp.edit();
		editor.remove(KEY);
		editor.clear();
		editor.commit();
	}

}
