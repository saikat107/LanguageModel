<METHOD_START> public static org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( Trigger org.springframework.integration.dsl.Trigger ) { return new PollerSpec ( org.springframework.integration.dsl.Trigger ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( long long ) { return org.springframework.integration.dsl.PollerSpec ( long , null ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( long long , java.util.concurrent.TimeUnit java.util.concurrent.TimeUnit ) { return org.springframework.integration.dsl.PollerSpec ( long , java.util.concurrent.TimeUnit , NUMBER ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( long long , long long ) { return org.springframework.integration.dsl.PollerSpec ( long , null , true , long ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( long long , java.util.concurrent.TimeUnit java.util.concurrent.TimeUnit , long long ) { return org.springframework.integration.dsl.PollerSpec ( long , java.util.concurrent.TimeUnit , true , long ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( long long ) { return org.springframework.integration.dsl.PollerSpec ( long , null ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( long long , java.util.concurrent.TimeUnit java.util.concurrent.TimeUnit ) { return org.springframework.integration.dsl.PollerSpec ( long , java.util.concurrent.TimeUnit , NUMBER ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( long long , long long ) { return org.springframework.integration.dsl.PollerSpec ( long , null , false , long ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( long long , java.util.concurrent.TimeUnit java.util.concurrent.TimeUnit , long long ) { return org.springframework.integration.dsl.PollerSpec ( long , java.util.concurrent.TimeUnit , false , long ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( long long , java.util.concurrent.TimeUnit java.util.concurrent.TimeUnit , boolean boolean , long long ) { PeriodicTrigger org.springframework.integration.dsl.PeriodicTrigger = new PeriodicTrigger ( long , java.util.concurrent.TimeUnit ) ; org.springframework.integration.dsl.PeriodicTrigger . setFixedRate ( boolean ) ; org.springframework.integration.dsl.PeriodicTrigger . setInitialDelay ( long ) ; return new PollerSpec ( org.springframework.integration.dsl.PeriodicTrigger ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( java.lang.String java.lang.String ) { return org.springframework.integration.dsl.PollerSpec ( java.lang.String , java.util.TimeZone . java.util.TimeZone ( ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( java.lang.String java.lang.String , java.util.TimeZone java.util.TimeZone ) { return new PollerSpec ( new CronTrigger ( java.lang.String , java.util.TimeZone ) ) ; }  <METHOD_END>
<METHOD_START> private void ( ) {	}  <METHOD_END>
