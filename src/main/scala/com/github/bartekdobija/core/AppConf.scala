package com.github.bartekdobija.core

import org.apache.spark.sql.SparkSession

object AppConf {
  def apply(spark: SparkSession): AppConf = new AppConf(spark)
}

class AppConf(val spark: SparkSession)
