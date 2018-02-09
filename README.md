# compile
mvn assembly:assembly

# upload to envi

# submit command
```
spark-submit --master yarn-cluster --class example.pi.SparkPi bigdata.training-1.0-SNAPSHOT-jar-with-dependencies.jar
```


