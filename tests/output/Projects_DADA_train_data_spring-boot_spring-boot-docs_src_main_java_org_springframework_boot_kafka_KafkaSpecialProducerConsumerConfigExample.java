<METHOD_START> @ Bean public org.springframework.boot.kafka.ProducerFactory<?,?> < ? , ? > org.springframework.boot.kafka.ProducerFactory<?,?> ( KafkaProperties org.springframework.boot.kafka.KafkaProperties ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.boot.kafka.KafkaProperties . buildProducerProperties ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( CommonClientConfigs . METRIC_REPORTER_CLASSES_CONFIG , org.springframework.boot.kafka.KafkaSpecialProducerConsumerConfigExample.MyProducerMetricsReporter .class ) ; return new DefaultKafkaProducerFactory <> ( java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.kafka.ConsumerFactory<?,?> < ? , ? > org.springframework.boot.kafka.ConsumerFactory<?,?> ( KafkaProperties org.springframework.boot.kafka.KafkaProperties ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.boot.kafka.KafkaProperties . buildConsumerProperties ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( CommonClientConfigs . METRIC_REPORTER_CLASSES_CONFIG , org.springframework.boot.kafka.KafkaSpecialProducerConsumerConfigExample.MyConsumerMetricsReporter .class ) ; return new DefaultKafkaConsumerFactory <> ( java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.util.List<org.springframework.boot.kafka.KafkaMetric> < KafkaMetric > java.util.List<org.springframework.boot.kafka.KafkaMetric> ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( KafkaMetric org.springframework.boot.kafka.KafkaMetric ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( KafkaMetric org.springframework.boot.kafka.KafkaMetric ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.util.List<org.springframework.boot.kafka.KafkaMetric> < KafkaMetric > java.util.List<org.springframework.boot.kafka.KafkaMetric> ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( KafkaMetric org.springframework.boot.kafka.KafkaMetric ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( KafkaMetric org.springframework.boot.kafka.KafkaMetric ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) {		}  <METHOD_END>
