import java.util.Map;

/**
 * Created by jahheindev on 7/11/16.
 */
public class Map1 {

  /**
   * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set
   * the key "a" to have the value "". Basically "b" is a bully, taking the value of "a".
   *
   * @param map
   *
   * @return
   */
  public Map<String, String> mapBully(Map<String, String> map) {
    if (map.get("a") != null)
      map.put("b", map.get("a"));
    return map;
  }
}
