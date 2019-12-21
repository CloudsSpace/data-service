package com.service


import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.{SparkConf, SparkContext}

object ConsumeTest {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("tset").setMaster("local[2]")
    val sc = new SparkContext(conf)
    val ssc = new StreamingContext(sc, Seconds(3))
    sc.setLogLevel("error")
    //    val srcData = KafkaCommonUtils.consumesData(ssc, Constants.servers, Constants.topic)
    //    val regex = new Regex("\\{\"msgs\":.*\\}]\\}")
    //    val data = srcData.filter(x => x.contains("[ERROR]") && x.contains("H5") && x.contains("prod") && regex.findAllIn(x).length > 0)
    //    //     data.flatMap(line => {
    //    //      val col = line.split(" \\[ERROR\\] ")(1)
    //    //      val jsonstrArray = col.split("_\\{")
    //    //      val offsetNum = jsonstrArray.apply(0)
    //    //      val jsonData = "{" + jsonstrArray.apply(1)
    //    //      val schema = Array("app_user_id", "vid", "time", "fromtype", "url", "referrer_url", "event", "type", "app_id", "channel_id", "device_id")
    //    //      val json = JSON.parseObject(jsonData).get("msgs").toString
    //    //      JsonUtils.jsonParser(json,schema)
    //    //    }).print()
    //
    //    srcData.foreachRDD(rdd => {
    //      val result = rdd.filter(x => x.contains("[ERROR]") && x.contains("H5") && x.contains("prod") && regex.findAllIn(x).length > 0)
    //      result.flatMap(line => {
    //        val col = line.split(" \\[ERROR\\] ")(1)
    //        val jsonstrArray = col.split("_\\{")
    //        val offsetNum = jsonstrArray.apply(0)
    //        val jsonData = "{" + jsonstrArray.apply(1)
    //        val schema = Array("app_user_id", "vid", "time", "fromtype", "url", "referrer_url", "event", "type", "app_id", "channel_id", "device_id")
    //        val json = JSON.parseObject(jsonData).get("msgs").toString
    //        JsonUtils.jsonParser(json, schema)
    //      }).foreach(println)
    //    })
    // val com.config: Config = ConfigFactory.load()
    //165573  OffsetRange(topic: 'logTopic', partition: 0, range: [192445 -> 192778])
   // val srcData = KafkaUtil.consumes(ssc, Constants.servers, Constants.topic)
    // println(com.config.getString("kafka.metadata.broker.list"))
  //  srcData.foreachRDD(rdd => rdd.foreach(println))

    ssc.start()
    ssc.awaitTermination()
  }


}
