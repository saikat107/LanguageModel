<METHOD_START> public void ( MessageChannel org.springframework.boot.actuate.metrics.writer.MessageChannel ) { this . org.springframework.boot.actuate.metrics.writer.MessageChannel = org.springframework.boot.actuate.metrics.writer.MessageChannel ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Delta < ? > org.springframework.boot.actuate.metrics.writer.Delta<?> ) { this . org.springframework.boot.actuate.metrics.writer.MessageChannel . send ( MetricMessage . forIncrement ( org.springframework.boot.actuate.metrics.writer.Delta<> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Metric < ? > org.springframework.boot.actuate.metrics.writer.Metric<?> ) { this . org.springframework.boot.actuate.metrics.writer.MessageChannel . send ( MetricMessage . forSet ( org.springframework.boot.actuate.metrics.writer.Metric<> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) { this . org.springframework.boot.actuate.metrics.writer.MessageChannel . send ( MetricMessage . forReset ( java.lang.String ) ) ; }  <METHOD_END>