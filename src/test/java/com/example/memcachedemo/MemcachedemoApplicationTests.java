package com.example.memcachedemo;

import com.example.memcachedemo.source.MemcachedRunner;
import net.spy.memcached.MemcachedClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemcachedemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Resource
    private MemcachedRunner memcachedRunner;

    @Test
    public void testSetGet()  {
        MemcachedClient memcachedClient = memcachedRunner.getClient();
        memcachedClient.set("testkey",1000,"666666");
        System.out.println("***********  "+memcachedClient.get("testkey").toString());
    }

}

