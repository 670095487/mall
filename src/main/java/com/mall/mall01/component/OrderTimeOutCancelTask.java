package com.mall.mall01.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author yunN
 * @date 2023/02/12.
 */
@Component
@Slf4j
public class OrderTimeOutCancelTask {

    /**
     * cron表达式：Seconds Minutes Hours DayofMonth Month DayofWeek [Year]
     * 每10分钟扫描一次，扫描设定超时时间之前下的订单，如果没支付则取消该订单
     */
    @Scheduled(cron = "0 0/10 * ? * ?")
    public void cancelTimeOutOrder() {
        // TODO : 取消超时订单
        log.info("cancel order successfully...");
    }
}
