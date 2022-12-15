package com.atguigu.gulimall.coupon;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallCouponApplicationTests {

    @Value("${coupon.user.name}")
    public String name;

    @Test
    void contextLoads() {
        System.out.println(name);
    }

}
