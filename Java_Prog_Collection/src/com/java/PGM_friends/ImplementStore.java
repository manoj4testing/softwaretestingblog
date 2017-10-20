package com.java.PGM_friends;

import java.util.ArrayList;
import java.util.List;

public class ImplementStore extends Store<Comparable<String>>{
	Store<String> store = new Store<String>();
	List<Store<String>> list = new ArrayList<Store<String>>();
}
