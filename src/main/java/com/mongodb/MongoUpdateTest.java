package com.mongodb;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.FindOneAndUpdateOptions;
import com.mongodb.client.result.UpdateResult;

/**
 * <dl>
 * <dt>MongoUpdateTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/27</dd>
 * </dl>
 *
 * @author lizhu
 */
public class MongoUpdateTest {
    public static void main(String[] args) {
    /*    MongoClient mongoClient = new MongoClient("10.130.29.58:30000");
        MongoDatabase database = mongoClient.getDatabase("lizhu");
        MongoCollection collection = database.getCollection("develop");
        FindOneAndUpdateOptions options = new FindOneAndUpdateOptions();
        options.upsert(true);
        collection.findOneAndUpdate(new BasicDBObject("name", "lz"), new BasicDBObject("$set", new BasicDBObject("name", "lzhh")),options);
        System.out.println();*/
    /**
     * mongo不存在表 执行更新操作  会创建集合
     * */

        MongoClient mongoClient = new MongoClient("10.130.29.58:30000");
        MongoDatabase database = mongoClient.getDatabase("lizhu");
        MongoCollection collection = database.getCollection("testlizhhu");
       /* FindOneAndUpdateOptions options = new FindOneAndUpdateOptions();
        options.upsert(true);*/
        collection.updateOne(new BasicDBObject("name", "lz"), new BasicDBObject("$inc", new BasicDBObject("age", -1)));

    }
}
