package za.ac.cput.project3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.project3.config.Appconfig;

/**
 * Created by admin on 2016/03/13.
 */
public class TestCollection {


    private CollectionImpl colImpl;
    private CollectionInterface col;
    private ApplicationContext context;
    @Before
    public void setUp() throws Exception {

        context = new AnnotationConfigApplicationContext(Appconfig.class);

         col = (CollectionInterface) context.getBean("col");
    }

    @Test
    public void TestList()
    {
        Collection collect1 = new Collection();

        Assert.assertTrue(collect1.names().contains("sibabalwe"));
    }

    @Test
    public void TestSet()
    {
        Collection collect2 = new Collection();

        Assert.assertTrue(collect2.colours().contains("Blue"));
    }

    @Test
    public void TestMap()
    {
        Collection collect3 = new Collection();

        Assert.assertEquals("Testing map", "Airforce", collect3.brands().get("Addidas"));
    }


}
