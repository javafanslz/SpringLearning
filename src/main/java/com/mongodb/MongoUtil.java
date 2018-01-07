package com.mongodb;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.List;
import java.util.Map;

public class MongoUtil {

	private final static String HOST = "10.130.29.58:30000";// 端口
    private final static int POOLSIZE = 100;// 连接数量  
    private final static int BLOCKSIZE = 100; // 等待队列长度  
    private static MongoClient mongo = null; 
    
    public static MongoDatabase getMongoClient(String databaseName) {
    	return mongo.getDatabase(databaseName);
    }
    
    public static DB getDB(String databaseName){
    	return mongo.getDB(databaseName);
    }
    
    public static List<String> getDatabases(){
    	return mongo.getDatabaseNames();
    }
    
    public static List<String> getMongoDBNames() {
    	return mongo.getDatabaseNames();
    }
    
    public static void initMongoClient() {
    	if(mongo == null) {
    		MongoClientOptions.Builder build = new MongoClientOptions.Builder();
            build.connectionsPerHost(POOLSIZE);//与目标数据库能够建立的最大connection数量 
            build.threadsAllowedToBlockForConnectionMultiplier(BLOCKSIZE);//如果当前所有的connection都在使用中，每个connection上线程排队等待数 
            build.maxWaitTime(1000*60*2);//最大等待时间 
            build.connectTimeout(1000*60*1);//与数据库建立连接的timeout  
            MongoClientOptions mongoOptions = build.build();     
                //数据库连接实例  
            mongo = new MongoClient(HOST,mongoOptions);      
    	}
    }
    
    public static void insertOne(String dbName, String collName, Map<String, Object> map) {
    	Document document = new Document(map);
    	getCollection(dbName, collName).insertOne(document);
    }
    
    private static MongoCollection<Document> getCollection(String dbName, String collName) {
        MongoCollection<Document> collection = mongo.getDatabase(dbName).getCollection(collName);
        return collection;
    }
}
