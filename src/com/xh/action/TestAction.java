/*************************************************************************************************

 ************************************************************************************************/
package com.xh.action;

import java.awt.Point;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @filename 文件名称：testAction.java
 * @contents 内容摘要
 */
public class TestAction extends ActionSupport {
	private String name;
	private int age;
	private Date d;
	private List<String> interests;
	private Set<String> set;
	private Map<String, String> map;
	private Point p;
	private List<Point> ps;
	private Map<String, Point> points;

	@Override
	public String execute() throws Exception {
		return super.execute();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public List<String> getInterests() {
		return interests;
	}

	public void setInterests(List<String> interests) {
		this.interests = interests;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public List<Point> getPs() {
		return ps;
	}

	public void setPs(List<Point> ps) {
		this.ps = ps;
	}

	public Map<String, Point> getPoints() {
		return points;
	}

	public void setPoints(Map<String, Point> points) {
		this.points = points;
	}
}
