<METHOD_START> @ Parameters ( name = STRING ) public static java.lang.Object [] [] java.lang.Object[][] ( ) { return new java.lang.Object [] [] { { org.springframework.test.context.junit4.rules.RepeatedSpringRuleTests.NonAnnotatedRepeatedTestCase .class . java.lang.String ( ) , NUMBER , NUMBER , NUMBER , NUMBER } , { org.springframework.test.context.junit4.rules.RepeatedSpringRuleTests.DefaultRepeatValueRepeatedTestCase .class . java.lang.String ( ) , NUMBER , NUMBER , NUMBER , NUMBER } , { org.springframework.test.context.junit4.rules.RepeatedSpringRuleTests.NegativeRepeatValueRepeatedTestCase .class . java.lang.String ( ) , NUMBER , NUMBER , NUMBER , NUMBER } , { org.springframework.test.context.junit4.rules.RepeatedSpringRuleTests.RepeatedFiveTimesRepeatedTestCase .class . java.lang.String ( ) , NUMBER , NUMBER , NUMBER , NUMBER } , { org.springframework.test.context.junit4.rules.RepeatedSpringRuleTests.RepeatedFiveTimesViaMetaAnnotationRepeatedTestCase .class . java.lang.String ( ) , NUMBER , NUMBER , NUMBER , NUMBER } , { org.springframework.test.context.junit4.rules.RepeatedSpringRuleTests.TimedRepeatedTestCase .class . java.lang.String ( ) , NUMBER , NUMBER , NUMBER , ( NUMBER + NUMBER + NUMBER + NUMBER ) } } ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , int int , int int , int int , int int ) throws java.lang.Exception { super( java.lang.String , int , int , int , int ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<? extends org.springframework.test.context.junit4.rules.Runner> < ? extends Runner > java.lang.Class<? extends org.springframework.test.context.junit4.rules.Runner> ( ) { return JUnit4 .class ; }  <METHOD_END>
<METHOD_START> protected void void ( ) java.io.IOException { invocationCount . incrementAndGet ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Timed ( millis = NUMBER ) public void void ( ) java.lang.Exception { void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Repeat @ Timed ( millis = NUMBER ) public void void ( ) java.lang.Exception { void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Repeat ( - NUMBER ) @ Timed ( millis = NUMBER ) public void void ( ) java.lang.Exception { void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Repeat ( NUMBER ) public void void ( ) java.lang.Exception { void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ org.springframework.test.context.junit4.rules.RepeatedSpringRuleTests.RepeatedFiveTimes public void void ( ) java.lang.Exception { void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Timed ( millis = NUMBER ) @ Repeat ( NUMBER ) public void void ( ) java.lang.Exception { void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Timed ( millis = NUMBER ) @ Repeat ( NUMBER ) public void void ( ) java.lang.Exception { void ( ) ; java.lang.Thread . void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Timed ( millis = NUMBER ) @ Repeat ( NUMBER ) public void void ( ) java.lang.Exception { void ( ) ; java.lang.Thread . void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Timed ( millis = NUMBER ) @ Repeat ( NUMBER ) public void void ( ) java.lang.Exception { void ( ) ; java.lang.Thread . void ( NUMBER ) ; }  <METHOD_END>
