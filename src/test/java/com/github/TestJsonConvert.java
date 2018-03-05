package com.github;

import com.github.server.ServiceConfig;
import com.github.utils.JSONUtil;
import com.github.utils.convert.Converter;
import org.junit.Test;

import java.util.Map;

/**
 * Created by tumingjian on 2017/3/12.
 */
public class TestJsonConvert {
    @Test
    public void test1()throws Exception{
        ServiceConfig serverInfo = new ServiceConfig(null, null, null);
        String bytes="{\"namespace\":\"test\",\"serviceConfig\":{\"port\":\"8080\",\"ip\":\"2.2.2.2\",\"onlineTime\":\"1489311186969\"},\"serviceName\":\"zufangdai_pc\"}\n";
        ServiceConfig parse = JSONUtil.parse(bytes, ServiceConfig.class);
        System.out.println(parse);
    }

    @Test
    public void test2()throws Exception{
        Map<Class<?>, Converter> map = JSONUtil.converterMap();
        Converter converter = map.get(Integer.class);
        Integer convert = (Integer)converter.convert("34567");
        System.out.println(convert);
    }
}