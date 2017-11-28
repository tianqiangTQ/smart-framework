package org.smart4j.chapter2.util;

import java.util.Map;

public class CollectionUtil {
    public static boolean isEmpty(Map map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(Map map) {
        return !isEmpty(map);
    }
}
