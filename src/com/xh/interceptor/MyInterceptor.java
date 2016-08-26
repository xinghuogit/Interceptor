/*************************************************************************************************
 * 版权所有 (C)2016
 * 
 * 文件名称：MyInterceptor.java
 * 内容摘要：MyInterceptor.java
 * 当前版本：TODO
 * 作        者：李加蒙
 * 完成日期：2016年8月26日 下午2:25:10
 * 修改记录：
 * 修改日期：2016年8月26日 下午2:25:10
 * 版   本 号：
 * 修   改 人：
 * 修改内容：
 ************************************************************************************************/
package com.xh.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * @filename 文件名称：MyInterceptor.java
 * @contents 内容摘要：
 */
public class MyInterceptor implements Interceptor {

	@Override
	public void destroy() {

	}

	@Override
	public void init() {

	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		long start = System.currentTimeMillis();
		System.out.println(start);
		String r = invocation.invoke();
		long end = System.currentTimeMillis();
		System.out.println((end - start));
		System.out.println(end);
		return r;
	}
}
