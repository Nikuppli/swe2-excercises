package ch.juventus.generics;

import java.util.Iterator;
import java.util.Map;

public class MapFilter {

    public <X, Y> Map<X, Y> cleanup (Map<X, Y> map, Y value) {
        map.entrySet().removeIf(xyEntry -> !value.equals(xyEntry.getValue()));
        //alt so:
        /*
        Iterator<Map.Entry<X, Y>> itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<X, Y> entry = itr.next();
            if(entry.getValue() != value) {
                itr.remove();
            }
        }*/
        return map;
    }
}