package com.boys.test.elasticjob;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class MyElasticJob implements SimpleJob {
    
    @Override
    public void execute(ShardingContext context) {
        switch (context.getShardingItem()) {
            case 0: 
                System.out.println("启动咯00000000");
                break;
            case 1: 
            	  System.out.println("启动咯1111111");
                break;
            case 2: 
            	  System.out.println("启动咯2222222");
                break;
            // case n: ...
        }
    }
}