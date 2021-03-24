package com.roon.sample;

import com.roon.config.RootConfig;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={RootConfig.class})
@Log4j
public class SampleTests {
    @Setter(onMethod_ = {@Autowired})
    private Restaurant restraunt;

    @Test
    public void testExist(){
        assertNotNull(restraunt);

        log.info(restraunt);
        log.info("-------------------");
        log.info(restraunt.getChef());
    }
}
