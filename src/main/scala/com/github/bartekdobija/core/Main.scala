package com.github.bartekdobija.core

import org.apache.spark.sql.SparkSession

object Main {

  def main(args: Array[String]): Unit = {
    Application(AppConf(SparkSession.builder().getOrCreate())).run()
  }
}
