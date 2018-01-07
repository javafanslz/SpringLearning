package com.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoUtil;
import com.mongodb.QueryOperators;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * <dl>
 * <dt>FastJsonTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/28</dd>
 * </dl>
 *
 * @author lizhu
 */
public class FastJsonTest {
    public static void main(String[] args) {
        /*FastJsonPo po = new FastJsonPo();
        po.setAge(1);
        po .setUsername("lizhu");
        System.out.println(JSON.toJSONString(po));*/
        /**测试long的转换的问题*/
        MongoUtil.initMongoClient();
        MongoDatabase database = MongoUtil.getMongoClient("rollback");
        MongoCollection collection = database.getCollection("rollBackLog");
        //{ "entId" : "9898" , "date" : { "$gte" : "1485659718000" , "$lte" : "1514517322000"}}
        BasicDBObject query = new BasicDBObject();
        query.append("entId","9898");
        query.append("date",new BasicDBObject(QueryOperators.GTE,"1485659718000").append(QueryOperators.LTE,"1514517322000"));
        FindIterable iterable = collection.find(query);
        MongoCursor cursor = iterable.iterator();
        while(cursor.hasNext()){
            Document document = (Document)cursor.next();
            String json = JSON.toJSONString(document);
            System.out.println(json);
            JSONObject jsonObject = JSON.parseObject(json);
            System.out.println(jsonObject.toJSONString());
            System.out.println(jsonObject.get("delete_time"));
        }


    }
}
