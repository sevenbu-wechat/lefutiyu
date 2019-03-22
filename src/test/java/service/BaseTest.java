package service;

import com.lefutiyu.sevenbu.mp.service.LoveSportsService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by guoqing on 2019/3/22.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContextTest.xml")
public class BaseTest {
    @Autowired
    private LoveSportsService loveSportsService;

    @Test
    public void test(){
        Assert.assertNotNull(loveSportsService);
    }
}
