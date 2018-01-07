package com.mongodb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

/**
 * <dl>
 * <dt>MongoQueryTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/27</dd>
 * </dl>
 *
 * @author lizhu
 */
public class MongoQueryTest {
    public static void main(String[] args){
        MongoClient mongoClient = new MongoClient("10.130.29.58:30000");
        MongoDatabase database = mongoClient.getDatabase("lizhu");
        MongoCollection collection = database.getCollection("develop");
        FindIterable iterable = collection.find(new BasicDBObject("name","liz"));
        MongoCursor cursor = iterable.iterator();
        while(cursor.hasNext()){
            String json = JSONObject.toJSONString(cursor.next());
            TestPo po = JSONObject.parseObject(json,TestPo.class);
            System.out.println(po.toString());
        }
    }
}
