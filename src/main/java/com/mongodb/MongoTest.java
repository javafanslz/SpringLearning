package com.mongodb;

import com.mongodb.client.*;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;

import java.util.HashSet;
import java.util.Set;

/**
 * <dl>
 * <dt>MongoTest</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017/12/18</dd>
 * </dl>
 *
 * @author lizhu
 */
public class MongoTest {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("10.130.29.58");
        MongoDatabase database = mongoClient.getDatabase("8989");
       /* MongoIterable<String> t = database.listCollectionNames();
        MongoCursor<String> iteator = t.iterator();
        while(iteator.hasNext()){
            System.out.println(iteator.next());
        }

        ListCollectionsIterable<Document> aa = database.listCollections();
        MongoCursor<Document> bb = aa.iterator();
        while (bb.hasNext()){
            System.out.println("@@"+ bb.next().toJson());
        }
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("a");
        set.add("a");

*/

        MongoCollection collection = database.getCollection("agent_item_3");
        BasicDBObject basicDBObject = new BasicDBObject();
        basicDBObject.append("start_time","1497578400000");
        BasicDBObject basicDBObject1 = new BasicDBObject();
        basicDBObject1.put("start_time","1497578400000");
        BasicDBObject up = new BasicDBObject();
        up.put("$set",basicDBObject1);
        UpdateResult result = collection.updateOne(basicDBObject,up);
        System.out.println(result.getMatchedCount());
     /*   FindIterable iterable = collection.find(basicDBObject);
        MongoCursor mongoCursor = iterable.iterator();

        while(mongoCursor.hasNext()){
            System.out.println(mongoCursor.next().toString());
        }*/
    }
}
