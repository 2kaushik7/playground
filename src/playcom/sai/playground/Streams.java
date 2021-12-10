package playcom.sai.playground;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Streams {

	public static void main(String[] args) {

		StreamsToJson sj = new StreamsToJson();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(sj));

	}

}

class StreamsToJson {
	Map<String, String> map;
	List<String> list;

	StreamsToJson() {

		map = new HashMap<String, String>();
		list = new ArrayList<String>();

		map.put("1", "one");
		map.put("2", "two");

		list.add("I");
		list.add("II");
	}

}
