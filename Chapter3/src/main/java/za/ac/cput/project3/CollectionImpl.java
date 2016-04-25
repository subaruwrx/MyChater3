package za.ac.cput.project3;

import java.util.*;

/**
 *  Created by admin on 2016/03/13.
 */
public class CollectionImpl implements CollectionInterface {

    @Override
    public List<String> names() {

        List names = new ArrayList();
        names.add("Sibabalwe");
        names.add("Vernon");
        names.add("Ash");

        return names;
    }

    @Override
    public Set<String> clours() {

        Set colours = new HashSet();
        colours.add("Blue");
        colours.add("Black");
        colours.add("Red");

        return colours;
    }

    @Override
    public Map<String, String> brands() {

        Map brands = new HashMap();
        brands.put("Addidas","Airforce");
        brands.put("BMW","m3");
        brands.put("Benz","amgc63");

        return brands;
    }
}
