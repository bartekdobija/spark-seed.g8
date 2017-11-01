package com.github.bartekdobija.core

import com.github.bartekdobija.SparkSpec

class ApplicationSpec extends SparkSpec {

  "Application" must "execute" in {
    Application(AppConf(_spark)).run()
  }

}
