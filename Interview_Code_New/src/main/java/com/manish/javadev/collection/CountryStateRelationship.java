package com.manish.javadev.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings({ "rawtypes", "resource" })
public class CountryStateRelationship {
	HashMap<String, Object> map1 = new HashMap<String, Object>();
	HashMap<String, Object> map2 = new HashMap<String, Object>();

	HashMap<String, HashMap<String, Object>> map = new HashMap<String, HashMap<String, Object>>();

	public static void main(String[] args) {

		CountryStateRelationship csr = new CountryStateRelationship();
		csr.doRelationShip();
		System.out.println("Please Enter Country Name");

		Scanner sc = new Scanner(System.in);
		String country = sc.next();
		csr.display(csr.map, country);

	}

	private void doRelationShip() {

		map.put("India", map1);
		map.put("USA", map2);

		map.get("USA").put("WashingTon", "michigaon");
		map.get("USA").put("NewJersy", "silicon");
		map.get("USA").put("texas", "techcity");
		map.get("USA").put("indiana", "boath");
		map.get("USA").put("kaliforniya", "nirmal");
		map.get("USA").put("zambia", "bongucity");

		map.get("India").put("AndhraPradesh", "Hyderabad");

		map.get("India").put("Karnataka", "Bangalore");

		map.get("India").put("Maharastra", "mumbai");

		map.get("India").put("Jammukashmir", "srinagar");

		map.get("India").put("tamilnadu", "chennai");

		map.get("India").put("kerala", "tivendram");

	}

	private void display(HashMap<String, HashMap<String, Object>> map3, String country) {
		map1 = map3.get(country);

		for (Iterator<?> itr = map1.entrySet().iterator(); itr.hasNext();) {

			Object mobj1 = itr.next();

			Map.Entry me1 = (Map.Entry) mobj1;
			Object kobj1 = me1.getKey();
			Object vobj1 = me1.getValue();
			System.out.println("State: " + kobj1 + ":\tCity:" + vobj1);
		}
	}
}
