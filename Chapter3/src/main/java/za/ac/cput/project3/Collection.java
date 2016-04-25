package za.ac.cput.project3;

import java.util.*;

/**
 *  Created by admin on 2016/03/13.
 */
public class Collection {

    public List names;
    public Set colours;
    public Map brands;

    public List<String> names()
    {
        List names = new ArrayList();
        names.add("Sibabalwe");
        names.add("Vernon");
        names.add("Ash");

        return names;
    }

    public Set<String> colours()
    {
        Set colours = new HashSet();
        colours.add("Blue");
        colours.add("Black");
        colours.add("Red");

        return colours;
    }

    public Map<String,String> brands()
    {
        Map brands = new HashMap();
        brands.put("Addidas","Airforce");
        brands.put("BMW","m3");
        brands.put("Benz","amgc63");

        return brands;
    }


}
