package com.MovieApp.sparkDataInjection;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
//1
public class InjecetData {
	public static void main(String[] args) {
		
		SparkSession spark = SparkSession.builder()
				.appName("Movie Data Injection")
				.master("local[1]")
				.getOrCreate();
		
		spark.sparkContext().setLogLevel("ERROR");
//		
//		Dataset<Row> movie_dataSet = spark
//				.read()
//				.json("../MovieApp/src/main/resources/movies.json");
		
//		movie_dataSet.show();
		
	}
}
