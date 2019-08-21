mapAB4 
prev  |  next  |  chance
Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.


mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}


public Map<String, String> mapAB4(Map<String, String> map) {
  String "a" = map.get("a");
  String "b" = map.get("b");
  String "c" = map.get("c");
  if("a.length") == ("b.length") && map.get("a") && map.get("b"){
    also if(map.get("a") !== map.get("b"));
  }
}
public Map<String, String> mapAB3(Map<String, String> map) {
  if(map.containsKey("a") && !map.containsKey("b")) {
    map.put("b", map.get("a"));
  }
  if(map.containKey("b") && !map.containsKey("a")) {
    map.put("a", map.get("b"));
  }
  r
      
public Map<String, String> mapAB4(Map<String, String> map) {
    if(map.containsKey("a") > map.containsKey("b")) {
      map.put("c", map.get("a"));
  }
    or if(map.containsKey("a") < map.containsKey("b")) {
      map.put("c", map.get("b"));
  }
    or if(map.containsKey("a") ==  map.containsKey("b")) {
      map.put("a" '', "b" "", "c", "");
    }
return map;
}
}
