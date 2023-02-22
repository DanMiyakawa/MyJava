import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

Set<Integer> set = new LinkedHashSet<>();
set.add(1);
set.add("Two");

Map<Integer, String> map = new HashMap<>();
map.put(1, "Taro");
map.put(2, "Hanako"); 
int value = map.get(0);